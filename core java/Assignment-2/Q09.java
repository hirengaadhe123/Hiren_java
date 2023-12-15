//W.A.J.P to compare a given string to the specified character sequence. Comparing 
//topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false


package com.assignment2;

public class Q09 
{
	public static void main(String[] args) 
	{
		String str1 = "example.com";
		String str2 = "Example.com";
		String comparing_st ="example.com";
		System.out.println("Comparing "+str1+" and "+comparing_st+": " + str1.equals(comparing_st));
		System.out.println("Comparing "+str2+" and "+comparing_st+": " + str2.equals(comparing_st));
	}

}
