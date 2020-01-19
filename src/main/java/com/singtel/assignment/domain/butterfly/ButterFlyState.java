package com.singtel.assignment.domain.butterfly;

import com.singtel.assignment.domain.Flyable;
import com.singtel.assignment.util.Constants;

public class ButterFlyState extends Butterfly implements Flyable {
	@Override public void fly() {
		System.out.println(Constants.FLYING);
	}
}
