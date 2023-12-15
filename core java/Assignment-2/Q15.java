//Create a class to print an integer and a character with two methods having the same 
//name but different sequence of the integer and the character parameters. For 
//example, if the parameters of the first method are of the form (int n, char c), then 
//that of the second method will be of the form (char c, int n).

package com.assignment2;

class PrintInteger
{
    public void print(int num, char ch) 
    {
        System.out.println("Integer: " + num + ", Character: " + ch);
    }
    
    public void print(char ch, int num) 
    {
        System.out.println("Character: " + ch + ", Integer: " + num);
    }
}
public class Q15 
{
	public static void main(String[] args) 
	{
		 PrintInteger p1= new PrintInteger();
		 p1.print(10, 'A');
	     p1.print('B', 20);
	}

}
