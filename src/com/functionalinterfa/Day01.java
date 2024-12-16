package com.functionalinterfa;
@FunctionalInterface
interface Demo1{
	
	void disp();
}



public class Day01 {

	public static void main(String[] args) {
	
		Demo1 d1=new Demo1() {
			@Override
			public void disp() {
			System.out.println("Anonymus lass");
				
			}
	};
	d1.disp();
	}
}
