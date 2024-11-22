package com.polymorphism;

class Plane{

	void fly() {
		System.out.println("Fly flies on Sky");
	}

}

class CargoPlane extends Plane{

	void fly() {
		System.out.println("Fly flies on small range");

	}
	void code() {
		System.out.println("CHild1");
	}

}

class PassengerPane extends Plane{

	void fly() {
		System.out.println("Fly flies on medium range");

	}
	void code() {
		System.out.println("CHild2");
	}

}

class FighterPlane extends Plane{

	void fly() {
		System.out.println("Fly flies on High range");

	}
	void code() {
		System.out.println("CHild3");
	}
}

public class Day01 {

	public static void main(String[] args) {

		Plane ref;
		CargoPlane cp = new CargoPlane();
		PassengerPane pp = new PassengerPane();
		FighterPlane fp = new FighterPlane();

		ref = cp;
		ref.fly();
		((CargoPlane)(ref)).code();
		ref = pp;
		ref.fly();
		((PassengerPane)(ref)).code();
		ref = fp;
		ref.fly();
		((FighterPlane)(ref)).code();
		

	}

}
