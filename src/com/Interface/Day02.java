package com.Interface;

interface Calculator{
	
	public void add();
	public void sub();
}

class Calculator20 implements Calculator{
	
	@Override
	public void add() {
		
		System.out.println("Add Method");
	}
	@Override
	public void sub() {
	
		System.out.println("sub Method");
		
	}
	public void mul() {
		System.out.println("mul Method");
		
	}
}









public class Day02 {

	public static void main(String[] args) {
		Calculator20 c1=new Calculator20();
		Calculator ref;
		ref=c1;
		ref.add();
		ref.sub();
		((Calculator20)(ref)).mul();
	}

}
