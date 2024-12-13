package com.Interface;

interface Demo {
	static int COUNT=2;
	static void studentDetails() {
		redandant();
		System.out.println(COUNT);
	}
	static void professional() {
		redandant();
	}
	private static void redandant() {
		System.out.println("Student Details");
	}
}
class Demo22 implements Demo{
	
}

	

public class PracticeModule {
	public static void main(String []sai) {
		Demo22 d22=new Demo22();
			Demo.professional();
			Demo.studentDetails();
	
	}

}
