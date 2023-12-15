//Write a Java program to check whether a map contains key-value mappings (empty) 
//or not.

package com.assignment2;

import java.util.HashMap;
import java.util.Map;

public class Q64 
{
	public static void main(String[] args)
	{
        Map<String, String> myMap = new HashMap<>();
        boolean isEmpty = myMap.isEmpty();
        if (isEmpty) 
        {
            System.out.println("The map is empty.");
        } 
        else
        {
            System.out.println("The map is not empty.");
        }
    }

}
