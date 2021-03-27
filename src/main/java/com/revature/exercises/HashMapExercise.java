package com.revature.exercises;

import java.util.*;

public class HashMapExercise {
    public static void main(String[] args) {

        HashMap<Integer, String> heroes = new HashMap<Integer, String>();
        heroes.put(1, "Spider Man");
        heroes.put(2, "Iron Man");
        heroes.put(3, "Wonder Woman");
        heroes.put(4, "X-Man");

        HashMap<Integer, String> villains = new HashMap<Integer, String>();
        villains.put(1, "Red Skull");
        villains.put(2, "Magneto");
        villains.put(3, "Galactus");
        villains.put(4, "Ultron");

        for (Map.Entry i:villains.entrySet()) {
            System.out.println("Key: " + i.getKey() + " Name: " +i.getValue());
        }
        //To find number of items
        System.out.println("Size of the hash map: " + heroes.size());

        //to copy hashmap to another
        villains.putAll(heroes);
        System.out.println("\nThis is copied hashmap: " + villains);

        //To remove all of the mappings from a map
        villains.clear();
        System.out.println("Emptied map " + villains);

        //To check if the map is empty or not
        boolean result = villains.isEmpty();
        System.out.println("is it empty? " + result);
    }

}
