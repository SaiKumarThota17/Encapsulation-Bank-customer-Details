package com.november;
class Animal{
	void breathe() {
		System.out.println("Animals are breathing ");
	}
	void eat() {
		System.out.println("Plane fly");
	}
	
}
class Deer extends Animal{
	void eat() {
		System.out.println("Dear eats Grass");
	}
	void sleeps() {
		System.out.println("Deers sleeps at Morning");
	}
	
}

class Tiger extends Animal{
	void eat() {
		System.out.println("Tiger eats Animals");
	}
	void sleeps() {
		System.out.println("Tiger sleeps at morning");
	}
}
class Monkey extends Animal{
	void eat() {
		System.out.println("Monkey eats Bannana's");
		
	}
	void sleeps() {
		System.out.println("Monkey sleeps on trees");
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		Deer cp = new Deer();
		cp.breathe();
		cp.eat();
		cp.sleeps();
		System.out.println("-----------------------");
		Tiger pp = new Tiger();
		pp.breathe();
		pp.eat();
		pp.sleeps();
		System.out.println("-----------------------");
		Monkey fp = new Monkey();
		fp.breathe();
		fp.eat();
		fp.sleeps();
		System.out.println("-----------------------");
	}

}
