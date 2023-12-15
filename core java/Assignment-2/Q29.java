//Take two numbers from the user and perform the division operation and handle 
//Arithmetic Exception. O/P- Enter two numbers: 10 0 
//Exception in thread main java.lang.ArithmeticException:/ by zero

package com.assignment2;

import java.util.Scanner;

public class Q29
{
	public class DivisionWithExceptionHandling
	{
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        try 
	        {
	            System.out.print("Enter the number1: ");
	            int number1 = scanner.nextInt();

	            System.out.print("Enter the number2: ");
	            int number2 = scanner.nextInt();

	            int result = divideNumbers(number1, number2);
	            System.out.println("Result of division: " + result);
	        } 
	        catch (ArithmeticException e) 
	        {
	            System.out.println("Exception in thread main " + e);
	        } 
	        catch (Exception e) 
	        {
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        } 
	        finally
	        {
	            System.out.println("Finally block executed.");
	            scanner.close();
	        }
	    }

	    static int divideNumbers(int number1, int number2) 
	    {
	        return number1 / number2;
	    }
	}


}
