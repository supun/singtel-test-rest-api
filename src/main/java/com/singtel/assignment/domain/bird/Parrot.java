package com.singtel.assignment.domain.bird;

import com.singtel.assignment.domain.Flyable;
import com.singtel.assignment.domain.Singable;
import com.singtel.assignment.domain.Walkable;
import com.singtel.assignment.util.Constants;
import com.singtel.assignment.util.NeighbourType;

public class Parrot extends Bird implements Flyable, Walkable, Singable {

	private NeighbourType neighbourType;

	public Parrot() {

	}

	public Parrot(NeighbourType animalFriendType) {
		this.setNeighbourType(animalFriendType);
	}

	public NeighbourType getNeighbourType() {
		return neighbourType;
	}

	public void setNeighbourType(NeighbourType neighbourType) {
		this.neighbourType = neighbourType;
	}

	@Override
	public void walk(){
		System.out.println(Constants.WALKING);
	}

	@Override
	public void fly() {
		System.out.println(Constants.FLYING);
	}

	@Override
	public void sing() {
		switch (this.getNeighbourType()) {
		case CAT:
			System.out.println(Constants.CAT_SOUND);
			break;
		case DOG:
			System.out.println(Constants.DOG_SOUND);
			break;
		case DUCK:
			System.out.println(Constants.DUCK_SOUND);
			break;
		case ROOSTER:
			System.out.println(Constants.ROOSTER_SOUND);
			break;
		case PHONE:
			System.out.println(Constants.PHONE_SOUND);
			break;
		default:
			System.out.println(Constants.PARROT_SOUND);

		}

	}
}
