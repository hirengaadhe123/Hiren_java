//Write a Java program to associate the specified value with the specified key in a 
//Hash Map.


package com.assignment2;

import java.util.HashMap;
import java.util.Map;

public class Q55 
{
	 public static void main(String[] args) 
	 {
	        Map<String, Integer> hashMap = new HashMap<>();

	        String key = "exampleKey";
	        int value = 42;
	        hashMap.put(key, value);

	        System.out.println("Contents of the hash map:");
	        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) 
	        {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	    }

}
