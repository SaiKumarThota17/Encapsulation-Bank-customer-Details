package com.november;

import java.util.Scanner;

public class OnlyPractice {

	public static int largestElement(int[] ar) {
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				secondMin = min;
				min = ar[i];
			} 
			else if (ar[i] < secondMin && ar[i] != min) {
				secondMin = ar[i];
			}
		}
		return min + secondMin;
	}

	static int largest(int[] ar) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				secondMax = max;
				max = ar[i];
			}
			else if (ar[i] < secondMax && ar[i] != max) {
				secondMax = ar[i];
			}
		}
		return max+secondMax;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int res = largestElement(ar);
		int res1 = largest(ar);
		System.out.println(res+res1);
	}

}
