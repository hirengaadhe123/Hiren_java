//Write a Java program to reverse elements in an array list.


package com.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q57 
{
	 public static void main(String[] args)
	 {
	        List<String> arrayList = new ArrayList<>();

	        arrayList.add("One");
	        arrayList.add("Two");
	        arrayList.add("Three");
	        arrayList.add("Four");

	        Collections.reverse(arrayList);

	        System.out.println("Reversed ArrayList:");
	        for (String element : arrayList)
	        {
	            System.out.println(element);
	        }
	    }

}
