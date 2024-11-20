package com.november;

import java.util.Scanner;

public class OccurenceAll {
	static void occurence(int[] ar){
		int count=1;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]==ar[i+1]) {
				count++;
			}
			else {
				System.out.println(ar[i]+" "+count);
				count=1;
			}
		}
		System.out.println(ar[ar.length-1]+" "+count);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int ar[]=new int[input];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();		
		}
		occurence(ar);
	}


}
