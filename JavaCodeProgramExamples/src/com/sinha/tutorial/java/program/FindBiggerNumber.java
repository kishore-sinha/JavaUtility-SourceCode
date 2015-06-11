package com.sinha.tutorial.java.program;

import java.util.Scanner;

/**
 * Accept Two numbers from user.
 * Find which number is bigger by 2 or more.
 * else print "Inconclusive".
 * 
 * @author kishore
 *
 */
public class FindBiggerNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter Second Number");
		int n2 = scanner.nextInt();
		
		if(n1 > n2 && n1-n2 >= 2)
			System.out.println(n1+" is Bigger");
		else if(n2 > n1 && n2-n1 >= 2)
			System.out.println(n2+" is Bigger");
		else
			System.out.println("INCONCLUSIVE");
	}

}
