package com.sinha.tutorial.java.program;

/**
 * 
 * @author kishore
 *
 */
public class CheckPalindromForNumberOrString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkPalindromeForNumber(12521);
	}
	
	public static void checkPalindromeForNumber(int number) {
		
		int localNum = number;
		int reverse = 0, remainder;
		
		while(number > 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		
		if(localNum == reverse)
			System.out.println(localNum +" is Palindrome Nummber");
		else
			System.out.println(localNum +" is NOT a Palindrome Nummber");
	}

}
