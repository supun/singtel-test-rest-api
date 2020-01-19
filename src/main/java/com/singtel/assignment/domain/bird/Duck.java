package com.singtel.assignment.domain.bird;

import com.singtel.assignment.domain.Singable;
import com.singtel.assignment.domain.Swimmable;
import com.singtel.assignment.domain.Walkable;
import com.singtel.assignment.util.Constants;

public class Duck extends Bird implements Walkable, Singable, Swimmable {

	public Duck(){
	}

	@Override
	public void sing() {
		System.out.println(Constants.DUCK_SOUND);
	}

	@Override public void swim() {
		System.out.println(Constants.SWIMMING);
	}
	@Override
	public void walk(){
		System.out.println(Constants.WALKING);
	}
}
