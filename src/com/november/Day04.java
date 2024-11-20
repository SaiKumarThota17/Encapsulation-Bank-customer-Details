package com.november;

import java.util.Scanner;

class Bank {
	private int id;
	private String name;
	private long AccNo;
	private String ifsc;
	private String Address;
	
	
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

	public long getAccNo() {
		return AccNo;
	}

	public void setAccNo(long l) {
		AccNo = l;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

}

public class Day04 {

	//private static Bank[] bankArr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Bank bankArr[] = new Bank[n];
		for (int i = 0; i < n; i++) {
			Bank bank = new Bank();
			System.out.println("Enter the Bank Details");
			System.out.println("Enter the"+" "+(i+1)+" "+"id");
			bank.setId(sc.nextInt());
			System.out.println("Enter the Name");
			bank.setName(sc.next());
			System.out.println("Enter the AccountNo");
			bank.setAccNo(sc.nextLong());
			System.out.println("Enter the IfscCode");
			bank.setIfsc(sc.next());
			 sc.nextLine();
			System.out.println("Enter the Address");
			bank.setAddress(sc.nextLine());
			bankArr[i] = bank;
		}
		for (Bank bankArr1 : bankArr) {
			System.out.println(bankArr1.getId());
			System.out.println(bankArr1.getName());
			System.out.println(bankArr1.getAccNo());
			System.out.println(bankArr1.getIfsc());
			System.out.println(bankArr1.getAddress());
		}

	}
		
		
//		System.out.println(bank1.getId()+" "+bank1.getName() + " " + bank1.getAccNo() + " " + bank1.getIfsc() + " "
//				+ bank1.getAddress());
//	System.out.println("----------------------");
		
	}


