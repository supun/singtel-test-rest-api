package com.singtel.assignment.domain;

import com.singtel.assignment.util.Color;
import com.singtel.assignment.util.Constants;
import com.singtel.assignment.util.Size;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "animal")
public class Animal implements IAnimal, Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "name")
	private String name;
	private boolean male;
    private Size size;
    private Color color;
    private String languageCode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	void walk(){
		System.out.println(Constants.WALKING);
	}
}
