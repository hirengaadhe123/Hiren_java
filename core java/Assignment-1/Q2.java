//Write a Java program that takes the user to provide a single character from the 
//alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
//is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
//message.


package com.assignment1;

import java.util.Scanner;

public class Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);//scanner class
		System.out.println("Enter Character From Alphabet :");
		String h=sc.nextLine();
		
		char ch=h.charAt(0);//get char
		
		if (h.length()!=1)//string length does not equals to more than one.
		{
			System.out.println("Error:please enter Alphabet");
		}
		else
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') //vowel
			{
				System.out.println(ch+" is vowel");
			}
			else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='z')//consonat
			{
				System.out.println(ch+" is consonat");
			}
			else
			{
				System.out.println("Error");
			}
		}
	}

}
