package com.sinha.tutorial.java.program;

import java.util.Scanner;

/**
 * Accept Two Numbers from user.
 * 
 * And find which number is nearest to 100.
 * 
 * @author kishore
 *
 */
public class FindNearestNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter Second Number");
		int n2 = scanner.nextInt();
		
		System.out.println("Nearest Number to 100 is : "+getNumberNearestTo100(n1, n2));
	}
	
	public static int getNumberNearestTo100(int n1, int n2) {
		
		int diff1 = Math.abs(100-n1);
		int diff2 = Math.abs(100-n2);
		
		if(diff1>diff2)
			return n2;
		else
			return n1;
	}
}
