package com.revature.exercises;
import java.util.*;

public class CollectionTreeSet {

	public static void main(String[] args) {
	    
	    TreeSet<String> ts = new TreeSet<String>();
	        ts.add("CNN");
	        ts.add("BBC");
	        ts.add("National Geographic");
	     System.out.println("Original list: " + ts);
	     
	    //The second TreeSet
	    TreeSet<String> tstwo = new TreeSet<String>();
	        tstwo.add("CNN");
	        tstwo.add("BBC");
	     System.out.println("Second list: " + tstwo);
	     
	    //Retrieving the first element
	    Object ts2 = ts.first();
	    System.out.println(ts2);
	    
	    Object tsLast = ts.last();
	    System.out.println(tsLast);
	    
	    //counting the number of elements
	    System.out.println(ts.size());
	    
	    //Comparing two sets of TreeSets
	    HashSet<String>result = new HashSet<String>();
	    for (String a : ts) {
	      System.out.println(tstwo.contains(a) ? "Yes" : "No");
	    }
	  }
}

