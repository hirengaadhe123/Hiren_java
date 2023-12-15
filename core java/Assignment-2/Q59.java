//Write a Java program to compare two array lists.

package com.assignment2;

import java.util.ArrayList;
import java.util.List;

public class Q59 
{
	public static void main(String[] args)
	{
        List<String> arrayList1 = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();

        arrayList1.add("One");
        arrayList1.add("Two");
        arrayList1.add("Three");

        arrayList2.add("One");
        arrayList2.add("Two");
        arrayList2.add("Four");

        boolean isEqual = arrayList1.equals(arrayList2);

        System.out.println("ArrayList1: " + arrayList1);
        System.out.println("ArrayList2: " + arrayList2);

        if (isEqual) 
        {
            System.out.println("The two ArrayLists are equal.");
        } 
        else
        {
            System.out.println("The two ArrayLists are not equal.");
        }
    }

}
