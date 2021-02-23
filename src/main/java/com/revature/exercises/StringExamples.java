package com.revature.exercises;

public class StringExamples {

	public StringExamples() {
		
	}

	public static void main(String[] args) {
		int numbers = 2468;
		StringBuffer sb = new StringBuffer();
		sb.append(numbers);
		String str3 = sb.toString();
		System.out.println("A new string contains " + str3);

		String str4 = "Programming ";
		String joining2Strings = str4.concat(str3);
		System.out.print("Joined Strings are: " + joining2Strings);
	}

}
