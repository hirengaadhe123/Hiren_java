//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 
//5 units by creating a class named 'Triangle' without any parameter in its constructor. 

package com.assignment2;
import java.lang.Math;

class Triangle 
{
    private double side1, side2, side3;

    public Triangle() 
    {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }

    public void calculateArea() 
    {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area of Triangle: " + area);
    }

    public void calculatePerimeter()
    {
        double perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of Triangle: " + perimeter);
    }
}

public class Q20 
{
	 public static void main(String[] args) 
	 {
	        Triangle t1 = new Triangle();
	        t1.calculateArea();
	        t1.calculatePerimeter();
	    }
}
