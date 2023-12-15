//Create an abstract class 'Parent' with a method 'message'. It has two subclasses each 
//having a method with the same name 'message' that prints "This is first subclass" 
//and "This is second subclass" respectively. Call the methods 'message' by creating 
//an object for each subclass


package com.assignment2;

abstract class Parent 
{
    abstract void message();
}

class FirstSubclass extends Parent
{
    @Override
    void message()
    {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Parent
{
    @Override
    void message() 
    {
        System.out.println("This is second subclass");
    }
}

public class Q22
{
	public static void main(String[] args)
	{
        FirstSubclass f1 = new FirstSubclass();
        SecondSubclass s1 = new SecondSubclass();

        f1.message();
        s1.message();
    }

}
