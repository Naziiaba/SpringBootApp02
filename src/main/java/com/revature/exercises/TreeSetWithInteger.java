package com.revature.exercises;
import java.util.*;

public class TreeSetWithInteger {
	public static void main(String[] args) {
	    
	    TreeSet<Integer> ts = new TreeSet<Integer>();
	    TreeSet<Integer> treeheadset = new TreeSet<Integer>();
	        ts.add(4);
	        ts.add(13);
	        ts.add(6);
	        ts.add(7);
	        ts.add(27);
	        ts.add(9);
	        
	      treeheadset = (TreeSet)ts.headSet(7);
	      
	    //Creating an iterator
	    Iterator iterator;
	    iterator = treeheadset.iterator();

	    System.out.println("TreeSet data: ");    
	    while(iterator.hasNext()) {
	       System.out.println(iterator.next() + " ");
	    }
	    //Retrieving specific elements
	    System.out.println("Greater than 14: " + ts.floor(14));
	    System.out.println("Strictly greater than 6: " + ts.higher(6));
	    
	    System.out.println("Removing the first element " + ts.pollFirst());
	    
	    System.out.println("Removing 6: " + ts.remove(6));
	}
}
