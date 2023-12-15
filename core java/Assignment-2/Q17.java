//Create a class with a method that prints "This is a parent class" and its subclass with 
//another method that prints "This is child class". Now, create an object for each of 
//the class and call 1 - method of parent class by object of parent class 2 - method of 
//child class by object of child class 3 - method of parent class by object of child class

package com.assignment2;

class ParentClass
{
    public void printParent() 
    {
        System.out.println("This is a parent class");
    }
}
class ChildClass extends ParentClass
{
    public void printChild() 
    {
        System.out.println("This is a child class");
    }
}
public class Q17
{
	public static void main(String[] args)
	{
		ParentClass p1= new ParentClass();
        p1.printParent();
        ChildClass c1= new ChildClass();
        c1.printChild();
        ParentClass p2 = new ChildClass();
        p2.printParent();
	}
}
