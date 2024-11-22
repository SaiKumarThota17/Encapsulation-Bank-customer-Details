package com.arrays;

import java.util.Scanner;

public class LargestRepeating {
	public static int largestRepeatingElement(int[] ar) {
		int max = Integer.MIN_VALUE;
		for (int i = ar.length - 3; i >= 0; i--) {

			if (ar[i] > max) {

				max = ar[i];
			}

			// System.out.println(ar[i]);
		}
		return max;
	}
	
	public static void occurrenceAll(int[] ar) {
		int count = 1;
		for (int i = 0; i < ar.length - 1; i++) {

			if (ar[i] == ar[i + 1]) {
				count++;
				
			} else {
				
				System.out.println(ar[i] + " " + count);
				count = 1;
			}
		}
		System.out.println(ar[ar.length - 1] + " " + count);
	}
	
	public static void removeDuplicates(int[] ar) {
		int count = 1;
		for (int i = 0; i < ar.length - 1; i++) {

			if (ar[i] == ar[i + 1]) {
				count++;
				
			} else {
				
				System.out.println(ar[i]);
				count = 1;
			}
		}
		System.out.println(ar[ar.length - 1]);
	}
	public static void removeRepeatingElements(int[] ar) {
		int count = 1;
		for (int i = 0; i < ar.length - 1; i++) {
			
			if(ar[i]==ar[i+1]) {
				count++;			
			}
			else {
				if(count==1) {
					System.out.println(ar[i]);
				}
				count=1;
			}
			
		}
			if(count==1) {
				
				System.out.println(ar[ar.length - 1]);
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int ar[]=new int[input];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int res=largestRepeatingElement(ar);
		System.out.println(res);
		
			System.out.println("______________________");
		
			removeDuplicates(ar);
		System.out.println(res);
		
		System.out.println("______________________");
		
		removeRepeatingElements(ar);
		System.out.println("______________________");
	}


}
