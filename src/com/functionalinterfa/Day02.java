package com.functionalinterfa;
@FunctionalInterface
interface Demo {

	void disp(int a);

	static void disp2() {
		redandantCode();
		
	}
	static void disp3() {
		redandantCode();
	}
	static void redandantCode() {
		System.out.println("WE Can use This Code inside Static Methods");
	}

}
public class Day02 {

	public static void main(String[] args) {
		Demo d = (int a) -> { // Lambda Expression;
			System.out.println(a);
		};
		Demo d1 = (a) -> {
			System.out.println("2ND Method");
		};
		Demo d2 = a -> {

			System.out.println("3rd Method");
		};
		d.disp(10);
		d1.disp(0);
		d2.disp(0);
		Demo.redandantCode();
		Demo.disp2();
		Demo.disp3();
	}

}
