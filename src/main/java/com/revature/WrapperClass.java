package com.revature;

public class WrapperClass {

	public static void main(String[] args) {
		Integer myInt = 10;
		Character myChar = 'Z';
		Double myDouble = 7.05;
		
		
		System.out.println(myInt);
		System.out.println(myChar);
		System.out.println(myDouble);
		
		
		String myString = myInt.toString();
		
		System.out.println(myString.length());
		
		
		
	}

}
