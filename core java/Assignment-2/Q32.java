//W.A.J. P to demonstrate try catch block, take two numbers from the user by 
//Command line argument and perform the division operation and handle Arithmetic 
//O/PException in thread main java. Lang. Arithmetic Exception:/ by zero


package com.assignment2;

public class Q32 
{
	public class DivisionDemo 
	{
	    public static void main(String[] args)
	    {
	        try 
	        {
	            if (args.length != 2)
	            {
	                System.out.println("Please provide two numbers as command line arguments.");
	                return;
	            }

	            double num1 = Double.parseDouble(args[0]);
	            double num2 = Double.parseDouble(args[1]);

	            double result = num1 / num2;
	            System.out.println("Result of division: " + result);
	        } 
	        catch (ArithmeticException e) 
	        {
	            System.out.println("Error: Division by zero is not allowed.");
	            e.printStackTrace();
	        } 
	        catch (NumberFormatException e)
	        {
	            System.out.println("Error: Please provide valid numbers as command line arguments.");
	            e.printStackTrace();
	        }
	    }
	}


}
