package com.sinha.tutorial.java.program;

/**
 * Print JAVAJ2EE in below format.
 * J
 * JA
 * JAV
 * JAVA
 * .....
 * JAVAJ2EE
 * @author kishore
 *
 */
public class PrintJavaJ2EE {

	public static void main(String[] args) {

		String toPrint = "JAVAJ2EE";
		
		printUsingToCharArray(toPrint);
		printWithoutToCharArray(toPrint);
	}
	
	public static void printUsingToCharArray(String str) {
		
		char [] c = str.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(c[j]);
			}
			System.out.println();
		}
	}

	public static void printWithoutToCharArray(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
}
