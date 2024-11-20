package com.november;

import java.util.Scanner;

class Loan {
	float p;
	float t;
	static float r=2.5f;
	float si;

	@Override
	public String toString() {
		return "";
	}

	void acceptInput() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal Amount");
		p = sc.nextFloat();
		System.out.println("Enter the Time");
		t = sc.nextFloat();
		// r = 5.0f;
	}

	void calculate() {
		//int b;
		si = p * t * r / 100;
	}

	void amount() {
		System.out.println("The Intrest of amount" + si);
	}
}

public class Day06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Customers");
		int n=sc.nextInt();
		
		Loan ar[]=new Loan[n];
		for(int i=0;i<n;i++)
		{
			Loan l=new Loan();
			l.acceptInput();
			l.calculate();
			l.amount();
			ar[i]=l;
		}
		for(Loan ar1 : ar) {
			System.out.println(ar1);
		}
	}

}
