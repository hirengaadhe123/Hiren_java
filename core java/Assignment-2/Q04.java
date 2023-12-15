//Write a Java program that accepts an integer (n) and computes the value of 
//n+nn+nnn. Input number: 5 
//5 + 55 + 555 


package com.assignment2;

import java.util.Scanner;

public class Q04 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input Number:");
		String n = in.nextLine();
		int n1 = new Integer(n);
		int n2 = new Integer(n+n);
		int n3 = new Integer(n+n+n);
		int sum = n1+n2+n3;
		System.out.println(n + " + " + n+n + " + " + n+n+n + " = " + sum );
	}
}
