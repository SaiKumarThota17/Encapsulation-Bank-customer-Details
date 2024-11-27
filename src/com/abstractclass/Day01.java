package com.abstractclass;

abstract class Bird {
	abstract void fly();

	abstract void eat();

}

abstract class Eagle extends Bird {

	@Override
	void fly() {

		System.out.println("Eagle flies High Range");

	}

}

class SergentEagle extends Eagle {

	public void eat() {
		System.out.println("Sergent Eagle Eats snakes");
	}
}

class GoldenFish extends Eagle {

	@Override
	void eat() {
		System.out.println("Golden fish eats Fishes");
	}
}
class BirdFamily{
	void family(Bird ref) {
		ref.fly();
		ref.eat();
	}
}
	
public class Day01 {

	public static void main(String[] args) {
		SergentEagle se=new SergentEagle();	
		GoldenFish gf=new GoldenFish();
		BirdFamily b1=new BirdFamily();
		b1.family(se);
			b1.family(gf);
	}

}
