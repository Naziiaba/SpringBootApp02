package com.revature;

import java.util.*;
import java.io.*;


public class CollectionsInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Integer> count = new ArrayList<Integer>(5);
		count.add(18);
		count.add(5);
		
		
		for (Integer number : count) {
			System.out.println("Number is: " + number);
		}
		
		Collection<Integer> count2 = new ArrayList<Integer>();
		
		count2.addAll(count);
		System.out.println("Now the new ArrayList = " + count2);
		
	}

}
