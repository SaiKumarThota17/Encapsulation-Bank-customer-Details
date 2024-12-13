package com.Interface;

interface SeaAnimals {

	void eat();

	void swim();

	default void communicate() {
		System.out.println("Sea Animals Are Communicate");
	}
}

class Shark implements SeaAnimals {
	@Override
	public void eat() {
		System.out.println("Shark eats Humans");
	}

	@Override
	public void swim() {
		System.out.println("Shark swims UnderWater");
	}
}

class Dolphin implements SeaAnimals {
	@Override
	public void eat() {
		System.out.println("Dolphin eats fishes");

	}

	@Override
	public void swim() {
		System.out.println("dolphin swims beautiful");

	}
}

public class Day03 {

	public static void main(String[] args) {
		Shark shark = new Shark();
		shark.eat();
		shark.swim();
		shark.communicate();
		Dolphin dolphin = new Dolphin();
		dolphin.eat();
		dolphin.swim();
		dolphin.communicate();

	}
}
