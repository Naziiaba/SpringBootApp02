package com.revature;

import java.util.*;
import java.io.*;


public class CollectionsInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Integer> list = new ArrayList<Integer>(5);
		list.add(18);
		list.add(5);
		list.add(27);
		list.add(11);
		list.add(48);
		
		for (Integer number : list) {
			System.out.println("Number is: " + number);
		}
		
		Collection<Integer> list2 = new ArrayList<Integer>();
		
		list2.addAll(list);
		list2.remove(5);
		System.out.println("Now the new ArrayList = " + list2);
		
		System.out.println(list2.size());
	}

}
