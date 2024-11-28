package com.abstractclass;

import java.util.Scanner;

abstract class Shape {

	float area;

	abstract void acceptInput();

	abstract void calcArea();

	void dispArea() {
		System.out.println(area);
	}
}

abstract class Square extends Shape {

	float side;

	@Override
	void acceptInput() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of side");
		side = sc.nextFloat();
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	void calcArea() {
		
		area = side * side;

	}

	public float getSide() {
		return side;
	}

}

abstract class Recatanle extends Shape {
	float length;
	float breadth;

	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of length");
		length = sc.nextFloat();
		System.out.println("Enter the Value of breadth");
		breadth = sc.nextFloat();
	}

	@Override
	void calcArea() {
		area = length * breadth;

	}

}

abstract class Circle extends Shape {

	float pi;
	float radius;

	@Override
	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of radius");
		radius = sc.nextFloat();

	}

	@Override
	void calcArea() {
		area = 3.142f * radius * radius;

	}

}

class Geomentry {

	void maths(Shape ref) {
		ref.acceptInput();
		ref.calcArea();
		ref.dispArea();
	}
}

public class AllOpps {

	public static void main(String[] args) {

	
		
	}

}
