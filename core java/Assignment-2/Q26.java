//We have to calculate the area of a rectangle, a square and a circle. Create an abstract 
//class 'Shape' with three abstract methods namely 'RectangleArea' taking two 
//parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The 
//parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
//side and that of 'CircleArea' is its radius. Now create another class 'Area' containing 
//all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
//area of rectangle, square and circle respectively. Create an object of class 'Area' and 
//call all the three methods. I3. Write a program which will ask the user to enter his/her 
//marks (out of 100). Define a method that will display grades according to the marks 
//entered as below: 
//Marks Grade 
//91-100 AA 
//81-90 AB 
//71-80 BB 
//61-70 BC 
//51-60 CD 
//41-50 DD 
//40 Fail

package com.assignment2;

import java.util.Scanner;

abstract class Shape 
{
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

class Area extends Shape 
{
    @Override
    void RectangleArea(double length, double breadth) 
    {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    void SquareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    @Override
    void CircleArea(double radius) 
    {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
public class Q26 
	{
	    static void displayGrade(int marks) 
	    {
	        if (marks >= 91 && marks <= 100) 
	        {
	            System.out.println("Grade: AA");
	        } 
	        else if (marks >= 81 && marks <= 90)
	        {
	            System.out.println("Grade: AB");
	        } 
	        else if (marks >= 71 && marks <= 80) 
	        {
	            System.out.println("Grade: BB");
	        } 
	        else if (marks >= 61 && marks <= 70) 
	        {
	            System.out.println("Grade: BC");
	        } 
	        else if (marks >= 51 && marks <= 60) 
	        {
	            System.out.println("Grade: CD");
	        } 
	        else if (marks >= 41 && marks <= 50) 
	        {
	            System.out.println("Grade: DD");
	        }
	        else if (marks >= 0 && marks <= 40) 
	        {
	            System.out.println("Grade: Fail");
	        } 
	        else 
	        {
	            System.out.println("Invalid marks entered.");
	        }
	    }

	    public static void main(String[] args) 
	    {
	        Area areaObject = new Area();
	        areaObject.RectangleArea(4, 6);
	        areaObject.SquareArea(5);
	        areaObject.CircleArea(3);

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your marks (out of 100): ");
	        int userMarks = scanner.nextInt();

	        displayGrade(userMarks);

	        scanner.close();
	    }
	}


