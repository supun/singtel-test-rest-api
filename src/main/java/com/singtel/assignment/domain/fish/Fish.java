package com.singtel.assignment.domain.fish;

import com.singtel.assignment.domain.Animal;
import com.singtel.assignment.domain.Swimmable;
import com.singtel.assignment.util.Constants;

public class Fish extends Animal implements Swimmable {

	@Override
	public void swim() {
		{
			System.out.println(Constants.SWIMMING);
		}
	}
}
