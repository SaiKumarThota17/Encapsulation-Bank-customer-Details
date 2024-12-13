package com.abstractclass;

import java.util.Scanner;

class Square1 {

	float side;
	float area;

	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of side");
		side = sc.nextFloat();
	}

	void calcArea() {

		area = side * side;
	}

	void dispArea() {

		System.out.println(area);
	}

}

class Rectangle {

	private float length;
	private float breadth;
	private float area;

	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of length");
		length = sc.nextFloat();
		System.out.println("Enter the Value of breadth");
		breadth = sc.nextFloat();
	}

	void calcArea() {

		area = length * breadth;
	}

	void dispArea() {

		System.out.println(area);
	}
}

class Circle1 {
	float pi = 3.142f;
	float radius;
	float area;

	void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of radius");
		radius = sc.nextFloat();
	}

	void calcArea() {

		area = pi * radius * radius;
	}

	void dispArea() {

		System.out.println(area);
	}

}

public class Day02 {

	public static void main(String[] args) {
		Square1 s1 = new Square1();
		s1.acceptInput();
		s1.calcArea();
		s1.dispArea();

		Rectangle r1 = new Rectangle();
		r1.acceptInput();
		r1.calcArea();
		r1.dispArea();
		Circle1 c1=new Circle1();
		c1.acceptInput();
		c1.calcArea();
		c1.dispArea();

	}

}
