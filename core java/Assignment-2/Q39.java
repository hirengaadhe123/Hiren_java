//W.A.J.P to start the same Thread twice by calling start () method twice. Test 
//ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();

package com.assignment2;

class TestThreadTwice1 extends Thread
{
    @Override
    public void run() 
    {
        System.out.println("Thread is running...");
    }
}

public class Q39 
{
	 public static void main(String[] args)
	 {
	        TestThreadTwice1 t1 = new TestThreadTwice1();
	        t1.start();

	        try
	        {
	            Thread.sleep(1000);
	        }
	        catch (InterruptedException e)
	        {
	            e.printStackTrace();
	        }

	        t1.start(); 
	    }
}
