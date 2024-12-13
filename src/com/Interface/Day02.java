package com.Interface;


interface Calculator10 {
void add();
void mul();

}
class MyCalculate implements Calculator10{
	
	@Override
	public void add() {
		System.out.println("First Menthod");
		
	}
	@Override
	public void mul() {
		System.out.println("mUL");
		
	}
	void sub() {
		System.out.println("Sub");
	}
	
	
}
public class Day02 {

	public static void main(String[] args) {
			MyCalculate mc=new MyCalculate();
			
			Calculator10 ref;
			ref=mc;
			ref.add();
			ref.mul();
			((MyCalculate)(ref)).sub();
	}
}
