//• Create a class named 'Member' having the following members: 
//1. Data members 
//2. Name 
//3. Age 
//4. Phone number 
//5. Address 
//6. Salary

package com.assignment2;

class Member 
{	  
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;  
    public Member(String name, int age, String phoneNumber, String address, double salary)
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getAddress()
    {
        return address;
    }

    public double getSalary() 
    {
        return salary;
    }
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}

public class Q18 
{
	    public static void main(String[] args)
	    {
	        Member m1 = new Member("Hiren",21,"9724490887","Gir somnath",50000);
	        m1.display();
	    }
}
	



