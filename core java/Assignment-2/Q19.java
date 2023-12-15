//• Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
//two methods to print the area and perimeter of the rectangle respectively. Its 
//constructor having parameters for length and breadth is used to initialize the length 
//and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
//constructor having a parameter for its side (suppose s) calling the constructor of its 
//parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.


package com.assignment2;

class Rectangle 
{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea()
    {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    public void calculatePerimeter()
    {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

class Square extends Rectangle 
{
    public Square(double side)
    {
        super(side, side);
    }
}
public class Q19 
{
	 public static void main(String[] args) 
	 {
	        Rectangle r1 = new Rectangle(4, 6);
	        r1.calculateArea();
	        r1.calculatePerimeter();
	        System.out.println();
	        Square s1 = new Square(5);
	        s1.calculateArea();
	        s1.calculatePerimeter();
	 }
}
