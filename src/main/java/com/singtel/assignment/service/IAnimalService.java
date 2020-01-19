package com.singtel.assignment.service;

import com.singtel.assignment.domain.Animal;

import java.util.List;

public interface IAnimalService {
	List<Animal> getAnimals();

	Animal getAnimalById(Long id);

	void addAnimal(Animal animal);
}
