//W.A.J. P to create one thread by extending Thread class in another Class.

package com.assignment2;
class thread extends Thread 
{
    @Override
    public void run() 
    {
        System.out.println("Thread is running...");
    }
}

public class Q37
{
	 public static void main(String[] args) 
	 {
	        thread Th1 = new thread();
	        Th1.start();
	        System.out.println("Main thread continues to run...");
	    }
}
