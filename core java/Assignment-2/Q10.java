//W.A.J.P to check whether a given string ends with the contents of another string. 
//"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True 


package com.assignment2;

public class Q10 
{
	public static void main(String[] args) 
	{
		String str1 = "Java Exercises";
		String str2 = "Java Exercise";
 
		String e = "se";
		boolean ends1 = str1.endsWith(e);
		boolean ends2 = str2.endsWith(e);
		System.out.println("'" + str1 + "' ends with " +"'" + e + "' ? " + ends1);
		System.out.println("'" + str2 + "' ends with " + "'" + e + "' ? " + ends2);
	}

}
