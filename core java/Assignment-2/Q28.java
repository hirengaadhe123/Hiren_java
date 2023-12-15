//W.A.J. P to demonstrate try catch block,

package com.assignment2;
import java.util.Scanner;

public class Q28
{
	public class TryCatchExample
	{
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        try {
	            System.out.print("Enter a number: ");
	            int number1 = scanner.nextInt();

	            System.out.print("Enter another number: ");
	            int number2 = scanner.nextInt();

	            int result = divideNumbers(number1, number2);
	            System.out.println("Result of division: " + result);
	            } 
	        catch (ArithmeticException e)
	        {
	            System.out.println("Error: Cannot divide by zero. Please provide a non-zero number2.");
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
