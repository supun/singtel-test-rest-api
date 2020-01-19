package com.singtel.assignment;

import com.singtel.assignment.domain.IAnimal;
import com.singtel.assignment.domain.bird.Bird;
import com.singtel.assignment.domain.bird.Chicken;
import com.singtel.assignment.domain.bird.Duck;
import com.singtel.assignment.domain.bird.Parrot;
import com.singtel.assignment.domain.butterfly.Butterfly;
import com.singtel.assignment.domain.fish.ClownFish;
import com.singtel.assignment.domain.fish.Dolphin;
import com.singtel.assignment.domain.fish.Shark;
import com.singtel.assignment.util.AnimalType;
import com.singtel.assignment.util.InsectState;
import com.singtel.assignment.util.NeighbourType;

public class AnimalFactory {
	/**
	 * factory method to create animal using given type
	 *
	 * @param type
	 * @return
	 */
	public IAnimal createAnimal(AnimalType type) {
		switch (type) {
		case BIRD:
			return new Bird();
		case CHICKEN:
			return new Chicken(Boolean.FALSE);
		case DUCK:
			return new Duck();
		case ROOSTER:
			return new Chicken(Boolean.TRUE);
		case PARROT:
			return new Parrot();
		case PARROT_NEAR_DOG:
			return new Parrot(NeighbourType.DOG);
		case PARROT_NEAR_CAT:
			return new Parrot(NeighbourType.CAT);
		case PARROT_NEAR_ROOSTER:
			return new Parrot(NeighbourType.ROOSTER);
		case PARROT_NEAR_DUCK:
			return new Parrot(NeighbourType.DUCK);
		case PARROT_NEAR_PHONE:
			return new Parrot(NeighbourType.PHONE);
		case SHARK:
			return new Shark();
		case CLOWN_FISH:
			return new ClownFish();
		case DOLPHIN:
			return new Dolphin();
		case BUTTERFLY:
			return new Butterfly(InsectState.CATERPILLAR);
		default:
			return null;
		}

	}
}
