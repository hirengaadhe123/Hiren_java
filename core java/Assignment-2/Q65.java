//Write a Java program to increase the size of an array list.

package com.assignment2;

import java.util.ArrayList;

public class Q65 
{
	public static void main(String[] args)
	{
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println("Original ArrayList: " + arrayList);

        increaseSizeUsingEnsureCapacity(arrayList, 5);

        System.out.println("ArrayList after increasing size using ensureCapacity: " + arrayList);

        increaseSizeByAddingElements(arrayList, 8);

        System.out.println("ArrayList after increasing size by adding elements: " + arrayList);
    }

    private static void increaseSizeUsingEnsureCapacity(ArrayList<Integer> list, int newSize) 
    {
        list.ensureCapacity(newSize);
    }

    private static void increaseSizeByAddingElements(ArrayList<Integer> list, int newSize) 
    {
        while (list.size() < newSize) 
        {
            list.add(0);
        }
    }

}
