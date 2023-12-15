//Write a Java program to copy one array list into another.

package com.assignment2;

import java.util.ArrayList;

public class Q50
{
	public static void main(String[] args) 
	{
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Orange");

        ArrayList<String> destinationList = new ArrayList<>();

        for (String element : sourceList) 
        {
            destinationList.add(element);
        }

        System.out.println("Source ArrayList: " + sourceList);
        System.out.println("Destination ArrayList: " + destinationList);
    }

}
