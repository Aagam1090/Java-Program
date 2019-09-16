/*
Write a Program to Implement MultiThreading Concept in Java
*/ 

import java.util.*;
import java.io.*;

class MultiThreading
{
	public static void main(String args[])
	{
		MultiThread1 t1 = new MultiThread1();
		MultiThread2 t2 = new MultiThread2();
		
		t1.start();
		t2.start();
	}
}

class MultiThread1 extends Thread
{
	public synchronized void run()
	{
		try
		{
			for(int i=1;i<=10;i+=2)
			{
				System.out.println("The Odd Number is " + i);
				Thread.sleep(100);
			}
		}
		catch(Exception e)
		{
			
		}
	}
}

class MultiThread2 extends Thread
{
	public synchronized void run()
	{
		try
		{
			for(int i=0;i<=10;i+=2)
			{
				System.out.println("The Even Number is " + i);
				Thread.sleep(100);
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
// Developed By Aagam Shah