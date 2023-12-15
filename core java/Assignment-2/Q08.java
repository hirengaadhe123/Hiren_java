//W.A.J.P to concatenate a given string to the end of another string. 


package com.assignment2;

import java.util.Scanner;

public class Q08 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your first name: ");
		String str1 = input.nextLine();
		System.out.println("Please enter your surname: ");
		String str2 = input.nextLine();
		String str3 = str1.concat(str2);
		System.out.println(str3);
	}

}
