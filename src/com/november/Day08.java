package com.november;

import java.util.Scanner;

class Student{
	private int id;
	private String name;
	private int age;
	private String email;
	private String passWord;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}


public class Day08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NO.of Students");
		int n = sc.nextInt();
		Student arr[] = new Student[n];
		for (int i = 0; i<n; i++) {
			Student st = new Student();
			System.out.println("Enter the Student "+(i+1)+"Details");
			System.out.println("Enter the Id");
			st.setId(sc.nextInt());
			System.out.println("Enter the Name");
			st.setName(sc.next());
			System.out.println("Enter the Age");
			st.setAge(sc.nextInt());
			System.out.println("Enter the Email");
			st.setEmail(sc.next());
			//sc.next();
			System.out.println("Enter the Password1");
			st.setPassWord(sc.next());
			arr[i] = st;		
		}
		for(Student arr1 : arr) {
			System.out.println(arr1.getId());
			System.out.println(arr1.getName());
			System.out.println(arr1.getAge());
			System.out.println(arr1.getEmail());
			System.out.println(arr1.getPassWord());
		}

		//System.out.println(st.getId());
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
