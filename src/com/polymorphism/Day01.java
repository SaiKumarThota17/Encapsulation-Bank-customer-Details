package com.polymorphism;

class Plane {

	void fly() {
		System.out.println("Fly flies on Sky");
	}

}

class CargoPlane extends Plane {

	void fly() {
		System.out.println("Fly flies on small range");

	}

}

class PassengerPane extends Plane {

	void fly() {
		System.out.println("Fly flies on medium range");

	}

}

class FighterPlane extends Plane {

	void fly() {
		System.out.println("Fly flies on High range");

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
		ref = pp;
		ref.fly();
		ref = fp;
		ref.fly();

	}

}
