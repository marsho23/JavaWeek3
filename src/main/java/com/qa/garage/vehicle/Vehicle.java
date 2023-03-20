package com.qa.garage.vehicle;

public abstract class Vehicle {

	private int numWheels;

	private String colour;

	private int id;
	public static int count;
	private int idFinal;

	public int getIdFinal() {
		return idFinal;
	}

	public void setIdFinal(int idFinal) {
		this.idFinal = idFinal;
	}

	public Vehicle(int numWheels, String colour) {
		super();
		this.numWheels = numWheels;
		this.colour = colour;
		count++;
		this.idFinal = count;
		//this.idFinal = idFinal;
	}

	public abstract int calcBill();

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumWheels() {
		return this.numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vehicle [numWheels=" + this.numWheels + ", colour=" + this.colour + ", id=" + this.idFinal + "]";
	}

}
