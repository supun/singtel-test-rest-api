package com.singtel.assignment.service;

import com.singtel.assignment.domain.Animal;
import com.singtel.assignment.respository.AnimalRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AnimalService implements IAnimalService {
	@Autowired
	AnimalRespository animalRespository;

	@Override public List<Animal> getAnimals() {
		return animalRespository.findAll();
	}

	@Override public Animal getAnimalById(Long id) {
		Optional<Animal> result = animalRespository.findById(id);
		if(result.isPresent()){
			return result.get();
		} else {
			return null;
		}

	}

	public void addAnimal(Animal animal){
		animalRespository.save(animal);
	}

}
