//Write a Java program to get the number of elements in a hash set.


package com.assignment2;

import java.util.HashSet;
import java.util.Set;

public class Q54 
{
	public static void main(String[] args)
	{
        Set<String> hashSet = new HashSet<>();

        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");

        int size = hashSet.size();
        System.out.println("Number of elements in the hash set: " + size);
    }

}
