package com.sinha.tutorial.java.program;

public class GenerateTriangleForGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 4;
		
		for (int i = 1; i <= num; i++) {
			StringBuilder builder = new StringBuilder();
			for (int j = 1; j <= i; j++) {
				builder.append(i);
			}
			System.out.println(builder);
		}
	}

}
