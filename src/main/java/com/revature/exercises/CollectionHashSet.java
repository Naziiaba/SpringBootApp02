package com.revature.exercises;
import java.util.*;

public class CollectionHashSet {
	public static void main(String[] args) {
	    
	    // Hashset used for search, insert and delete. 
	    //Hashset is faster than TreeSet.
	    HashSet<String> hashset = new HashSet<String>();
	        hashset.add("Latte");
	        hashset.add("Matcha");
	        hashset.add("Chai");
	    
	    Iterator<String> iter =hashset.iterator();
	    while(iter.hasNext()) {
	      System.out.println(iter.next());
	    }
	      //Getting the hashset size
	      System.out.println(hashset.size()); //3
	      
	      //Checking if the hashset is empty or not
	      System.out.println(hashset.isEmpty());
	      
	      //Cloning hashset to another one
	      HashSet<String> hashset2 = (HashSet<String>)hashset.clone();
	        hashset.add("Coffee");
	        hashset.add("Matcha");
	        hashset.add("Chai");
	        
	      System.out.println(hashset2); 
	      
	      //Creating a new array
	      String[] new_array = new String[hashset.size()];
	      hashset.toArray(new_array);
	      
	      // Displaying Array elements
	      System.out.println("Array elements are: ");
	      for(String e : new_array){
	        System.out.println(e);
	     }
	     
	      //TreeSet keeps sorted data and used for search, insert and delete
	      //Creating a treeset
	      Set<String> toTreeSet = new TreeSet<>(hashset);
	      System.out.println("TreeSet: " + toTreeSet);

	  }
}
