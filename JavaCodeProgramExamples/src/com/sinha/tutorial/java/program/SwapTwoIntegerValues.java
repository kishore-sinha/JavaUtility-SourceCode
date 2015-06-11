package com.sinha.tutorial.java.program;

/**
 * 
 * @author kishore
 *
 */
public class SwapTwoIntegerValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 15;
		
		System.out.println("Before Swapping :- Nummber1 : "+num1 +" & Numbmer2 : "+num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After  Swapping :- Nummber1 : "+num1 +" & Numbmer2 : "+num2);
	}

}
