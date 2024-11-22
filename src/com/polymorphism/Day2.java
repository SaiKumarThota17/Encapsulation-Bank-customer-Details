package com.polymorphism;

class Plane1 {

	void fly() {
		System.out.println("Fly flies on Sky");

	}
}

class CargoPlane1 extends Plane1 {

	void fly() {
		System.out.println("Fly flies on small range");

	}
}

class PassengerPlane1 extends Plane1 {

	void fly() {
		System.out.println("Fly flies on medium range");

	}
}

class FighterPlane1 extends Plane1 {

	void fly() {
		System.out.println("Fly flies on High range");

	}
}

class Airport {

	void permit(Plane1 ref) {
		ref.fly();
	}
}

public class Day2 {

	public static void main(String[] args) {
		Airport ap = new Airport();
		CargoPlane1 cp = new CargoPlane1();
		PassengerPlane1 pp = new PassengerPlane1();
		FighterPlane1 fp = new FighterPlane1();
		ap.permit(cp);
		ap.permit(pp);
		ap.permit(fp);

	}

}
