//Create a class named 'Shape' with a method to print "This is this is shape". Then 
//create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both 
//having a method to print "This is rectangular shape" and "This is circular shape" 
//respectively. Create a subclass 'Square' of 'Rectangle' having a method to print 
//"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the 
//object of 'Square' class.

package com.assignment2;

class A// A=shape
{
    void display() 
    {
        System.out.println("This is shape");
    }
}

class B extends A// B=Rectengular
{
    void display()
    {
        System.out.println("This is rectangular shape");
    }
}

class C extends A //C=circle
{
    void display()
    {
        System.out.println("This is circular shape");
    }
}

class D extends B //D=Square
{
    void displayD() 
    {
        System.out.println("Square is a rectangle");
    }
}

public class Q27
{
	public static void main(String[] args) 
	{
        D s1 = new D();
        s1.display();
        s1.displayD();
    }

}
