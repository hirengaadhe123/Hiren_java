//• W.A.J. P to create one thread by implementing Runnable interface in 
//Class.
package com.assignment2;

class MyRunnable implements Runnable 
{
    @Override
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class Q36 
{
	public static void main(String[] args)
    {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}


