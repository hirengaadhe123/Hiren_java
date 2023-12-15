//Create a class to print the area of a square and a rectangle. The class has two methods 
//with the same name but different number of parameters. The method for printing 
//area of a rectangle has two parameters which are length and breadth respectively 
//while the other method for printing area of square has one parameter which is side 
//of square.

package com.assignment2;
class AreaCalculator 
{
    public void calculateArea(int side)
    {
        int area = side * side;
        System.out.println("Area of square with side " + side + ": " + area);
    }
    public void calculateArea(int length, int breadth)
    {
        int area = length * breadth;
        System.out.println("Area of rectangle with length " + length + " and breadth " + breadth + ": " + area);
    }
}
public class Q16 
{
	public static void main(String[] args) 
	{
		AreaCalculator c1 = new AreaCalculator();
        c1.calculateArea(5);
        c1.calculateArea(4, 6);
		
	}

}
