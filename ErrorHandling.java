/*
Write a Program to Implement Divide By Zero Exception Handling in Java
*/
import java.util.Scanner;

class DivideByZeroException extends Exception
{
	DivideByZeroException(String msg)
	{
		super(msg);
	}
}

class ErrorHandling
{
	public static void main(String[] args)
	{
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of a,b,c,d");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();	
		try
		{
			verify(b,d);
			int res = ((a*d)+(b*c)/(d*b));
			System.out.println("The result is "+ res);
		} 
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void verify(int b,int d)throws DivideByZeroException
	{
		if(b*d==0)
		{
			throw new DivideByZeroException("Denominator is becoming Zero ");
		}
	}
}
//Developed By Aagam Shah