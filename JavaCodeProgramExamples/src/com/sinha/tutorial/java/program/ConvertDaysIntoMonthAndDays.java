package com.sinha.tutorial.java.program;

public class ConvertDaysIntoMonthAndDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int givenDaysNum = 78;
		
		int days = givenDaysNum%30;
		int months = givenDaysNum/30;
		
		System.out.println("Given Number of Days : "+givenDaysNum +", converted as "+months+" Months and "+days+" Days.");
	}

}
