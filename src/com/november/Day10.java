package com.november;

class Charger {
	private String brand;
	private float voltage;

	public Charger(String brand, float voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}

	public String getBrand() {
		return brand;
	}

	public float getVoltage() {
		return voltage;
	}

}

class Os {
	private String name;
	private String size;

	public Os(String name, String size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

}


class Mobile{
	
	Os os=new Os("Android","4Gb");
	void has_A(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}



public class Day10 {

	public static void main(String[] args) {
		Charger c=new Charger("Samsung",55.5f);
		Mobile mb=new Mobile();
		System.out.println(mb.os.getName());
		System.out.println(mb.os.getSize());
		mb.has_A(c);
		
		
		
	}

}
