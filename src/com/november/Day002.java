package com.november;

import java.util.Scanner;

public class Day002 {

	public static int secondLargest(int[] ar) {
		int max = Integer.MIN_VALUE;
		int secondMax = 0;
		//int thirdMax = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				secondMax = max;
				max = ar[i];
			}
			else if(ar[i]>secondMax && ar[i]!=max)
			{
				secondMax=ar[i];
			}
		}
		return secondMax;
		return-1;

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] ar=new int[N];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int res=secondLargest(ar);
		System.out.println(res);

	}

}
