package com.sinha.tutorial.java.program;

public class SwapTwoStringValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ABCD";
		String s2 = "XYZ";
		
		System.out.println("Before Swapping :- String1 : "+s1 +" & String2 : "+s2);
		
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println("After  Swapping :- String1 : "+s1 +" & String2 : "+s2);
	}

}
