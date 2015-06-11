package com.sinha.tutorial.java.program;

/**
 * Program which will print number between 1 to 100. But
 * Multiple of 3 will be replaced by Fizz,
 * Multiple of 5 will be replaced by Buzz, and 
 * Multiple of 3 & 5 will be replaced by FizzBuzz.
 * 
 * @author kishore
 *
 */
public class FizzBuzzProblem {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			
			if(i % (3*5) == 0)
				System.out.println("FizzBuzz");
			else if(i % 5 == 0)
				System.out.println("Buzz");
			else if(i % 3 == 0)
				System.out.println("Fizz");
			else 
				System.out.println(i);
		}
	}
}
