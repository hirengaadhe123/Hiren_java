//W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero 
//exception and another one is to handle 
//ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0; 

package com.assignment2;

public class Q30 
{
	public class MultipleCatchExample 
	{
	    public static void main(String[] args)
	    {
	        try 
	        {
	            int[] a = new int[5];
	            a[5] = 30 / 0;
	        } 
	        catch (ArithmeticException e)
	        {
	            System.out.println("Arithmetic Exception: " + e.getMessage());
	        } 
	        catch (ArrayIndexOutOfBoundsException e)
	        {
	            System.out.println("Array Index Out Of Bounds Exception: " + e.getMessage());
	        } 
	        catch (Exception e)
	        {
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        } 
	        finally
	        {
	            System.out.println("Finally block executed.");
	        }
	    }
	}


}
