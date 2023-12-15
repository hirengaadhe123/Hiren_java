//Write a Java program to count the number of key-value (size) mappings in a map.


package com.assignment2;

import java.util.HashMap;
import java.util.Map;

public class Q56 
{
	 public static void main(String[] args)
	 {
	        Map<String, Integer> myMap = new HashMap<>();

	        myMap.put("One", 1);
	        myMap.put("Two", 2);
	        myMap.put("Three", 3);
	        myMap.put("Four", 4);

	        int mapSize = myMap.size();
	        System.out.println("Number of key-value mappings in the map: " + mapSize);
	 }

}
