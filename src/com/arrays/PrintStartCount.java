package com.arrays;

import java.util.Scanner;

public class PrintStartCount {
	public static void pattren(int n) {
		for (int i = 1; i <= n; i++) {

			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				
					
					System.out.print("*"+" ");
				
				
			}
			System.out.println("");
		}
		for (int i = n; i >= 1; i--) {

			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				
					System.out.print("*"+" ");
				
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		pattren(n);
	}

}
