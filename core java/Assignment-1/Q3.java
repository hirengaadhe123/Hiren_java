//Write a Java program that takes a year from user and print whether that year is a leap
//year or not. B19. Write a program in Java to display the first 10 natural numbers
//using while loop. 

package com.assignment1;

public class Q3 
{
	public static void main(String[] args) 
	{
		int year=2002;
		if (year%4==0)
		{
			System.out.println("Year is leap year.."+year);
		}
		else
		{
			System.out.println("Year is not an leap year"+year);
		}
		
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
	}
	

}
