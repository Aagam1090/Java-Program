/*
Write a Program to Implement Divide By Zero Exception Handling in Java
*/
import java.io.*;

class NegativeNumberException extends Exception
{
	NegativeNumberException(String msg)
	{
		super(msg);
	}
}
class ErrorHandling2
{
	public static void main(String[] args)throws Exception
	{
		int no;
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number to Find Factorial");
		try
		{
			no = Integer.parseInt(br.readLine());
			validate(no);
			int res =Factorial(no);
			System.out.println("The Factorial is "+ res);
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void validate(int no)throws NegativeNumberException
	{
		if(no < 0)
		{
			throw new NegativeNumberException("Cannot Calculate Factorial for NegativeNumber");
		}
	}
	public static int Factorial(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return n*Factorial(n-1);
		}
	}
}
//Developed By Aagam Shah