import java.util.*;
public class Main {
  public static void main(String[] args) {
    
    TreeMap<Integer, String> heroes = new TreeMap<Integer, String>();
        heroes.put(1, "Spider Man");
        heroes.put(2, "Iron Man");
        heroes.put(3, "Wonder Woman");
        heroes.put(4, "X-Man");
     for (Map.Entry<Integer, String> entry : heroes.entrySet())
     {
       System.out.println(entry.getKey() + " : " + entry.getValue());   
  }
	//To copy map to another
    TreeMap<Integer, String> new_map = new TreeMap<Integer, String>();
        new_map.putAll(heroes);
        System.out.println(new_map);
		
       //to get keys 
       for(Map.Entry e : new_map.entrySet()) {
         System.out.println(e.getKey());
       }
  }
}
