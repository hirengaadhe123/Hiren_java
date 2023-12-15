//Write a Java program to get a collection view of the values contained in this map.

package com.assignment2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q69 
{
	  public static void main(String[] args) 
	  {
	        Map<String, Integer> map = new HashMap<>();
	        map.put("One", 1);
	        map.put("Two", 2);
	        map.put("Three", 3);

	        Collection<Integer> values = getValuesCollectionView(map);

	        System.out.println("Values Collection: " + values);
	    }

	    private static Collection<Integer> getValuesCollectionView(Map<String, Integer> map)
	    {
	        return map.values();
	    }

}
