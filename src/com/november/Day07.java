package com.november;

import java.util.Scanner;

public class Day07 {
	public static boolean primeNumber(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void allPrimes(int n1, int n2) {
		for (int i = 2; i <= n2; i++) {
			if (primeNumber(i)) {
				System.out.println(i);
			}
		}
	}
	public static int even(int n) {
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
			}
			return i;
		}
		return 0;
	}

	public static void maxPair(int[] ar, int k) {
		int n3=0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 1; j < ar.length; j++) {
				//n3=ar[i]+ar[j];
				if (even(ar[i]+ar[j]==k)) {

					System.out.println(ar[i] + " " + ar[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
	//	int n2 = sc.nextInt();

		int ar[] = new int[n1];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		int k = sc.nextInt();
		maxPair(ar, k);
		//allPrimes(n1, n2);
	}

}
