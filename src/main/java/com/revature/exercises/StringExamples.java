package com.revature.exercises;

import java.util.ArrayList;
import java.util.Iterator;

public class StringExamples {

	public StringExamples() {
		
	}

	public static void main(String[] args) {
		int numbers = 2468;
		StringBuffer sb = new StringBuffer();
		sb.append(numbers);
		String str3 = sb.toString();
		String res = str3.replace("2468", "Computing");
		System.out.println("A new string contains " + res);

		String str4 = "Programming ";
		String joining2Strings = str4.concat(res);
		System.out.print("Joined Strings are: " + joining2Strings);
		
		//These following Strings need to be separated
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("Ruby");
		list.add("Javascript");
		
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	
	
	
	}

}
