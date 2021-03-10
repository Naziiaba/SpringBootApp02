package com.revature.exercises;
import java.util.*;

public class CollectionsLinkedList {

	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<String>();
	    cities.add("Austin");
	    cities.add("Mumbai");
	    cities.add("Seattle");
	    cities.add("London");
	    cities.add("Istanbul");
	    System.out.println("The original list " + cities);
	    
	    Object first_element = cities.getFirst();
	    System.out.println("The First Element: " + first_element);
		
		//For removing 1st element
		//Object first_element = cities.removeFirst(); 
	    //System.out.println("The First Element removed: " + first_element); //The First Element removed: Austin
	    
	    Object last_element = cities.getLast();
	    System.out.println("The Lastst Element: " + last_element);
	    
	    //To remove all elements, we use .clear() method for LinkedList
	    cities.clear();
	    System.out.println("Final list " + cities);   //Final list []

	}

}
