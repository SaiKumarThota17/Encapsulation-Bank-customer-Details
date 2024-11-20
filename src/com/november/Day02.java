package com.november;

import java.util.Scanner;

public class Day02 {

	public static int maxValue(int[] ar)
	{
		int max=Integer.MIN_VALUE;
		for(int i=ar.length-1;i>=0;i--)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		return max;
		//System.out.println(max);
	}
	public static int minValue(int[] ar)
	{
		int min=Integer.MAX_VALUE;
		for(int i=ar.length-1;i>=0;i--)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		return min;
		//System.out.println(min);
	}
	public static int sum(int[]ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
		}
		return sum;
	}
	
	
	
	public static int[] productN_1(int[]ar){
		int product=1;
		for(int i=0;i<ar.length;i++)
		{
			product*=ar[i];
		}
		
		int[] result=new int[ar.length];
		for(int i=0;i<result.length;i++)
		{
		result[i]=product/ar[i];
		}
		return result;
	}
	
	
	
	
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
			int ar[]=new int[n];
			for(int i=0;i<ar.length;i++)
			{
				ar[i]=sc.nextInt();
			}
			int[]result=productN_1(ar);
			for(int i=0;i<ar.length;i++)
			{			
				System.out.print(result[i]+" ");
			}
			//int k=sc.nextInt();
			/*
			 * int max=maxValue(ar); int min=minValue(ar); int sum=sum(ar);
			 * System.out.println(sum-max); System.out.println(sum-min);
			 */
			 
			//System.out.println(res);
	}

}
