//Create a class named 'Print Number' to print various numbers of different data types 
//by creating different methods with the same name 'printn' having a parameter for 
//each data type

package com.assignment2;

class PrintNumber
{
		 public int print(int a)
		    {
		        System.out.println(a);
		        return a;
		    }
		     public float print(float b)
		    {
		        System.out.println(b);
		        return b;
		    }
	         public double print(double c)
		    {
		        System.out.println(c);
		        return c;
		    }
		     public String print(String d)
		    {
		        System.out.println(d);
		        return d;
		    }
}
		     
public class Q14 
{
		public static void main(String[] args) 
		{   
		PrintNumber a1= new PrintNumber();
		PrintNumber b= new PrintNumber();
		a1.print("Hiren");
		a1.print(65.87);
		a1.print(1.111);
		a1.print(28);
        }
}


