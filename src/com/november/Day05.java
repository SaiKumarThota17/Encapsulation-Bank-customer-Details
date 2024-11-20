package com.november;

import java.util.Scanner;

class Menu{
	private int id;
	private String name;
	private float price;
	private String description;
	/*
	 * public Menu(int id, String name, float price, String description) {
	 * //super(); this.id = id; this.name = name; this.price = price;
	 * this.description = description;
	 */}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
public class Day05 {

	public static void main(String[] args) {
		Menu menu=new Menu();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Customer Details");
		System.out.println("Customer id");
		menu.setId(sc.nextInt());
		System.out.println("Customer name");
		menu.setName(sc.next());
		System.out.println("Customer Price");
		menu.setPrice(sc.nextFloat());
		String ar[]=s.split(",");
		System.out.println("Customer Description");
	//	bank.setD
	}
	}

}
