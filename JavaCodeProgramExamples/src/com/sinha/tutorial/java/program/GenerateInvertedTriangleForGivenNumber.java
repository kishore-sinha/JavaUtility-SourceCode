package com.sinha.tutorial.java.program;

public class GenerateInvertedTriangleForGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		
		for (int i = num; i >= 1; i--) {
			StringBuilder builder = new StringBuilder();
			for (int j = i; j >= 1; j--) {
				builder.append(i);
			}
			System.out.println(builder);
		}
	}

}
