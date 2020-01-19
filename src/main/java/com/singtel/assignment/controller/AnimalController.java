package com.singtel.assignment.controller;

import com.singtel.assignment.domain.Animal;
import com.singtel.assignment.domain.IAnimal;
import com.singtel.assignment.service.IAnimalService;
import com.singtel.assignment.util.AnimalGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("api/v1") @Api(tags = "Animal service API", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class AnimalController {

	@Autowired
	IAnimalService service;

	@GetMapping(value = "/animals", produces = MediaType.APPLICATION_JSON_VALUE) @ApiOperation(value = "Retrieve all animals")
	public ResponseEntity<?> getAnimals() {
		// post some data to db to test
		for(IAnimal animal : AnimalGenerator.createAnimalList()){
			service.addAnimal(AnimalGenerator.createAnimal(animal));
		}

		List<Animal> animals = service.getAnimals();
		return ResponseEntity.ok(animals);
	}

	@GetMapping(value = "/animal/{id}", produces = MediaType.APPLICATION_JSON_VALUE) @ApiOperation(value = "Retrieve animal by id")
	public ResponseEntity<?> getAnimalById(@PathVariable("id") long id) {
		Animal animal = service.getAnimalById(id);
		return ResponseEntity.ok(animal);
	}


	@PostMapping(value = "/animals", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE) @ApiOperation(value = "Adds an Animal")
	public ResponseEntity<?> addAnimal(
			@RequestBody Animal animal) {
		service.addAnimal(animal);
		return ResponseEntity.ok().build();
	}
}
