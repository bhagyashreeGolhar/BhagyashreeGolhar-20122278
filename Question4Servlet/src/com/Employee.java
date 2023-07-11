package com;

import java.util.ArrayList;

public class Employee {
	
	
	private int id;
	private String name;
	private ArrayList<String> programmings;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<String> getProgrammings() {
		return programmings;
	}
	public void setProgrammings(ArrayList<String> programmings) {
		this.programmings = programmings;
	}
	
	

}
