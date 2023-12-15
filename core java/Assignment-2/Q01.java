//Write a Java program that reads a positive integer and count the number of digits the 
//number. 
//Input an integer number less than ten billion: 125463 
//Number of digits in the number: 6 


package com.assignment2;

import java.util.Scanner;

public class Q01 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("INPUT AN INTEGER");
		long n = in.nextLong();
		int count = 0;

		while(n > 0)
		{
		n /= 10;
		count++;
		}

		System.out.printf("NUMBER OF DIGITS IS %d", count);
		}
	}

