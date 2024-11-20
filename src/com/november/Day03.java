package com.november;

import java.util.Scanner;

class Customer {
	private String name;
	private int age;
	private String email;
	private String password;

//	public Customer(String name, int age, String email, String password) {
//
//		this.name = name;
//		this.age = age;
//		this.email = email;
//		this.password = password;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

public class Day03 {

	public static void main(String[] args) {
		Customer c1=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the CustName");
		c1.setName(sc.nextLine());
		System.out.println("Enter the Age");
		c1.setAge(sc.nextInt());
		System.out.println("Enter the Email");
		c1.setEmail(sc.next());
		System.out.println("Enter the pass");
		c1.setPassword(sc.next());
		//c1.setPassword(sc.nextLine());
		//System.out.println(c1.getName()+""+c1.getAge()+""+c1.getEmail()+""+c1.getPassword());	
		Customer[] custArr=new Customer[2];
		custArr[0]=c1;
		System.out.println(custArr[0].getName()+" "+custArr[0].getAge()+" "+custArr[0].getEmail()+" "+custArr[0].getPassword());
	}

}
