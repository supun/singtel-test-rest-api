package com.singtel.assignment.util;

import com.singtel.assignment.AnimalFactory;
import com.singtel.assignment.domain.Animal;
import com.singtel.assignment.domain.IAnimal;
import com.singtel.assignment.domain.bird.Chicken;
import com.singtel.assignment.domain.bird.Duck;
import com.singtel.assignment.domain.butterfly.Butterfly;
import com.singtel.assignment.domain.fish.ClownFish;
import com.singtel.assignment.domain.fish.Dolphin;
import com.singtel.assignment.domain.fish.Fish;
import com.singtel.assignment.domain.fish.Shark;

public class AnimalGenerator {

	public static IAnimal[] createAnimalList(){
		AnimalFactory animalFactory = new AnimalFactory();
		IAnimal[] animals = new IAnimal[]{
				animalFactory.createAnimal(AnimalType.DUCK),
				animalFactory.createAnimal(AnimalType.CHICKEN),
				animalFactory.createAnimal(AnimalType.ROOSTER),
				animalFactory.createAnimal(AnimalType.FISH),
			animalFactory.createAnimal(AnimalType.SHARK),
				animalFactory.createAnimal(AnimalType.CLOWN_FISH),
				animalFactory.createAnimal(AnimalType.DOLPHIN),
				animalFactory.createAnimal(AnimalType.BUTTERFLY)
		};

		return animals;
	}

	public static Animal createAnimal(IAnimal iAnimal){
		Animal animal = new Animal();
		if(iAnimal instanceof Animal){
			animal.setMale(((Animal) iAnimal).isMale());
		}
		if(iAnimal instanceof Duck){
			animal.setName("DUCK");
		} else if(iAnimal instanceof Chicken && ((Animal) iAnimal).isMale()){
			animal.setName("ROOSTER");
		}else if(iAnimal instanceof Chicken){
			animal.setName("CHICKEN");
		} else if(iAnimal instanceof Shark){
			animal.setName("SHARK");
			animal.setSize(Size.LARGE);
			animal.setColor(Color.GREY);
		}else if(iAnimal instanceof ClownFish){
			animal.setName("CLOWN_FISH");
			animal.setSize(Size.SMALL);
			animal.setColor(Color.ORANGE);
		}else if(iAnimal instanceof Fish){
			animal.setName("FISH");
		}else if(iAnimal instanceof Chicken){
			animal.setName("CHICKEN");
		}else if(iAnimal instanceof Dolphin){
			animal.setName("DOLPHIN");
		}else if(iAnimal instanceof Butterfly){
			animal.setName("BUTTERFLY");
		}
		return animal;
	}

}
