package com.yash.assignment.question6;
//Create A class Engine and it will have following fields engine type, engine power, and 
//engine name. You have to create vehicle class on the basis of engine type inject the 
//engine class object in different type of vehicle. For example. Four-wheeler will have 
//different type of engine and two-wheeler will have different type of engine and
//capacity. ( Vehicle class will have following fields: - vehicle name, vehicle type(four, 
//two, three), vehicle engine object, vehicle mileage and price.
//Now print all type of vehicles on the basis of four, two and three wheels
public class Engine {
	
	String engineType;
	String enginePower;
	String engineName;
	public Engine(String engineType, String enginePower, String engineName) {
		super();
		this.engineType = engineType;
		this.enginePower = enginePower;
		this.engineName = engineName;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getEnginePower() {
		return enginePower;
	}
	public void setEnginePower(String enginePower) {
		this.enginePower = enginePower;
	}
	public String getEngineName() {
		return engineName;
	}
	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", enginePower=" + enginePower + ", engineName=" + engineName + "]";
	}
	
	public void showEngine() 
	{
		System.out.println("Engine Type is "+engineType);
		System.out.println("Engine Power is "+enginePower);
		System.out.println("Engine Name is "+engineName);
	}

}
