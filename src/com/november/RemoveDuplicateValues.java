package com.november;

import java.util.Scanner;

public class RemoveDuplicateValues {
	public static void uniqueCount(int[] ar) {
		int count=1;
		int uniqueCount=0;
		for(int i=0;i<ar.length-1;i++) {
			
			if(ar[i]==ar[i+1]) {
				count++;
				
			}
			else {
				if(count==1) {
					uniqueCount++;
				}
				count=1;
			}
		}
		if(count==1) {
			uniqueCount++;
		}
		System.out.println(uniqueCount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] ar = new int[input];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		uniqueCount(ar);
	}

}
