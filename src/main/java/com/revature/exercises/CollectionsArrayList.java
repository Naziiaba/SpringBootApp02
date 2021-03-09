package com.revature.exercises;

import java.util.*;

public class CollectionsArrayList {

	public static void main(String[] args) {
		String arr[] = {
				"Blue",
				"Purple",
				"Red",
				"Green",
				"White"
		};
	List<String> colors = new ArrayList<String>();
	for (int i = 0; i < 5; i++) {
		colors.add(arr[i]);
	System.out.println(colors + " This Array size " + colors.size());
	}
	ListIterator<String> itr = colors.listIterator();
	System.out.println("\n Iterating colors:\n");
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	}
}
