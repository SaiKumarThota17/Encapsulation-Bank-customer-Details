package com.november;

import java.util.Scanner;

public class Day01 {

	static boolean primeNumber(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				return true;
			}
			else
			{
				return false;
		}
	}
			static void primeNumberList(int n1,int n2)
			{
				for(int i=2;i<=n2;i++)
				{
					if(primeNumber(i))
					{
						System.out.println(i);
					}
				}
			}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	primeNumberList(n1,n2);
	//System.out.println();
	}

}
