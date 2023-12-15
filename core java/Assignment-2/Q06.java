//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 
//and by both. 

package com.assignment2;

public class Q06
{
	public static void main(String[] args)
	{
		System.out.println("Divided by 3 & 5:");
		for(int i = 1; i <= 100; i++)
		{
		if(i % 3 == 0 && i % 5 == 0)
		{
		System.out.print(i + ",");
	    }
		}
	}
	
}
	
