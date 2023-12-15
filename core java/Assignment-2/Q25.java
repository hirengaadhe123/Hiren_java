//Write a program to print the factorial of a number by defining a method named 
//'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*. 
//*(n-1) *n. E.g.-
//4! = 1*2*3*4 = 24 
//3! = 3*2*1 = 6 
//2! = 2*1 = 2 
//Also, 1! = 1 
//0! = 0

package com.assignment2;
import java.util.Scanner;

public class Q25 
{
	public class FactorialExample 
	{
	    static long calculateFactorial(int n) 
	    {
	        if (n == 0 || n == 1)
	        {
	         return 1;
	        } 
	        else 
	        {
	         return n * calculateFactorial(n - 1);
	        }
	    }

	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to calculate its factorial: ");
	        int num = scanner.nextInt();

	        if (num < 0)
	        {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else 
	        {
	            long factorial = calculateFactorial(num);
	            System.out.println(num + "! = " + factorial);
	        }
	        scanner.close();
	    }
	}
}
