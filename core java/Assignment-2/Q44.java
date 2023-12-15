//Write a Java program to retrieve an element (at a specified index) from a given array 
//list.

package com.assignment2;

import java.util.ArrayList;

public class Q44 
{
	public static void main(String[] args)
	{
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        int indexToRetrieve = 2;

        if (indexToRetrieve >= 0 && indexToRetrieve < fruits.size()) 
        {
            String retrievedFruit = fruits.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedFruit);
        } 
        else 
        {
            System.out.println("Invalid index");
        }
    }
}
