//W.A.J.P to create a class Student with attributes roll no, name, age and course. 
//Initialize values through parameterized constructor. If age of student is not in 
//between 15 and 21 then generate user defined exception 
//"AgeNotWithinRangeException". If name contains numbers or special symbols 
//raise exception "NameNotValidException". Define the two exception classes
//

package com.assignment2;

class AgeNotWithinRangeException extends Exception 
{
    public AgeNotWithinRangeException(String message) 
    {
        super(message);
    }
}

class NameNotValidException extends Exception
{
    public NameNotValidException(String message)
    {
        super(message);
    }
}

class Student 
{
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException 
    {
        if (age < 15 || age > 21)
        {
            throw new AgeNotWithinRangeException("AgeNotWithinRangeException: Age should be between 15 and 21.");
        }

        if (!isValidName(name)) 
        {
            throw new NameNotValidException("NameNotValidException: Name should not contain numbers or special symbols.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    private boolean isValidName(String name)
    {
        return name.matches("[a-zA-Z ]+");
    }

    public void displayDetails()
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Q35 
{
	public static void main(String[] args) 
	{
        try 
        {
            Student validStudent = new Student(04, "HIREN", 20, "Computer Science");
            validStudent.displayDetails();

            Student invalidAgeStudent = new Student(010, "ROHIT", 14, "Mathematics");
            invalidAgeStudent.displayDetails(); 
        } 
        catch (AgeNotWithinRangeException | NameNotValidException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
