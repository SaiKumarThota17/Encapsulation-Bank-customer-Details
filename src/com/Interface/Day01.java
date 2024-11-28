package com.Interface;

import java.util.Scanner;

interface Calculator1{
	
	public void add() ;
		
	public void sub();
}


class Calculator2 implements Calculator1{
	@Override
	public void add() {
		
		System.out.println(100+200);
	}
	@Override
	public void sub() {
		System.out.println(100-200);
	}
}

class Calculator3 implements Calculator1{
	
	@Override
	public void add() {
		int n1=100;
		int n2=400;
		int n3=n1+n2;
		System.out.println(n3);
	}
	@Override
	public void sub() {
		int n1=100;
		int n2=500;
		int n3=n1-n2;
		System.out.println(n3);
	}
	
}

class Calculator4 implements Calculator1{
	
	@Override
	public void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n Value");
		int n=sc.nextInt();
		System.out.println("Value"+n);
				
			}
	@Override
	public void sub() {
		int n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n Value");
		n2=sc.nextInt();
		System.out.println("Value"+n2);
		
	}
}
class Geometry{
	void calculate(Calculator1 ref) {
		ref.add();
		ref.sub();
		
	}
}

public class Day01 {

	public static void main(String[] args) {
		Calculator2 c1=new Calculator2();
		Calculator3 c2=new Calculator3();
		Calculator4 c3=new Calculator4();
		Geometry g=new Geometry();
			g.calculate(c1);
			System.out.println("---------------");
			g.calculate(c2);
			System.out.println("---------------");
			g.calculate(c3);
			System.out.println("---------------");
			
	}

}
