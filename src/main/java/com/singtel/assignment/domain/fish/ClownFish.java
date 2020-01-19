package com.singtel.assignment.domain.fish;

import com.singtel.assignment.domain.Jokable;
import com.singtel.assignment.util.Color;
import com.singtel.assignment.util.Constants;
import com.singtel.assignment.util.Size;

public class ClownFish extends Fish implements Jokable {

	public ClownFish(){
		this.setColor(Color.ORANGE);
		this.setSize(Size.SMALL);
	}

	@Override public void joke() {
		System.out.println(Constants.JOKING);
	}
}
