package com.yash.assignment.question6;

public class Vehicle {

	String vehicleName;
	String type;
	Engine engine;
	String mileage;
	double price;
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Vehicle(String vehicleName, String type, Engine engine, String mileage, double price) {
		super();
		this.vehicleName = vehicleName;
		this.type = type;
		this.engine = engine;
		this.mileage = mileage;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleName=" + vehicleName + ", type=" + type + ", engine=" + engine + ", mileage=" + mileage
				+ ", price=" + price + "]";
	}
	
	public void showVehicle() {
		System.out.println("Vehicle Details : ");
		System.out.println("Vehicle Name :" +vehicleName);
		System.out.println("Type of Vehicle:"+type);
		System.out.println("Engine Name : "+engine.getEngineName());
		System.out.println("Engine Power : "+engine.getEnginePower());
		System.out.println("Engine Type : "+engine.getEngineType());
		System.out.println("Mileage : "+mileage);
		System.out.println("Price : "+price);
	}
}
