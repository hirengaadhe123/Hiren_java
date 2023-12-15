//Write a Java program to join two array lists.


package com.assignment2;

import java.util.ArrayList;
import java.util.List;

public class Q61 
{
	public static void main(String[] args) 
	{
        List<String> arrayList1 = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();

        arrayList1.add("One");
        arrayList1.add("Two");
        arrayList1.add("Three");

        arrayList2.add("Four");
        arrayList2.add("Five");
        arrayList2.add("Six");

        List<String> joinedArrayList = new ArrayList<>(arrayList1);
        joinedArrayList.addAll(arrayList2);

        System.out.println("Joined ArrayList: " + joinedArrayList);
    }

}
