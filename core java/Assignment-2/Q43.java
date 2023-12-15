//Write a Java program to insert an element into the array list at the first position.

package com.assignment2;

import java.util.ArrayList;

public class Q43 
{
	 public static void main(String[] args)
	 {
	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("ArrayList before insertion: " + colors);

	        colors.add(0, "Purple");

	        System.out.println("ArrayList after insertion: " + colors);
	    }
	}


