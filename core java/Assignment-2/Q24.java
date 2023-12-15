//We have to calculate the percentage of marks obtained in three subjects (each out of 
//100) by student A and in four subjects (each out of 100) by student B. Create an 
//abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two 
//other classes 'A' and 'B' each having a method with the same name which returns the 
//percentage of the students. The constructor of student A takes the marks in three 
//subjects as its parameters and the marks in four subjects as its parameters for student 
//B. Create an object for each of the two classes and print the percentage of marks for 
//both the students.

package com.assignment2;

abstract class Marks 
{
    abstract double getPercentage();
}

class Student1 extends Marks
{
    private int subject1, subject2, subject3;

    public Student1 (int subject1, int subject2, int subject3) 
    {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getPercentage() 
    {
        return (subject1 + subject2 + subject3) / 3.0;
    }
}

class Student2 extends Marks 
{
    private int subject1, subject2, subject3, subject4;

    public Student2 (int subject1, int subject2, int subject3, int subject4) 
    {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() 
    {
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}


public class Q24 
{
	public static void main(String[] args) 
	{
         Student1 S1= new Student1(85, 90, 78);
         Student2 S2= new Student2(75, 80, 92, 88);

        System.out.println("Percentage of Student A: " + S1.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + S2.getPercentage() + "%");
	}

}
