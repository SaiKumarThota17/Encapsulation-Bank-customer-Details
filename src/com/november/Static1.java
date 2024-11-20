package com.november;

class Test{
	static int age;
	static int id;

	static {
		age = 20;
		id = 30;
		System.out.println("Static block");
	}

	static void test() {
		age = 50;
		id = 50;
		System.out.println("Static Method");
	}
		int a=10;
		int b=40;
		//static
		public Test(){
			System.out.println("Constructor");
		}
		void test1(){
			System.out.println("Instance Method");
		}
		
	{
		System.out.println("Instance Block");
	}
}




public class Static1 {

	public static void main(String[] args) {
		
		Test.test();
		Test t=new Test();
		t.test1();
	}

}
