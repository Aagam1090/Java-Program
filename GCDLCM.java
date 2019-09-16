/*
Write a Program to Implement GCD and LCM in Java
*/ 
import java.util.*;

class GCDLCM
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the 2 Numbers");
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		int gcd_res = gcd(a,b);
		int lcm_res = lcm(a,b);
		System.out.println("The Gcd is " + gcd_res);
		System.out.println("The Lcm is " + lcm_res);
		
	}
	public static int lcm(int no1,int no2)
	{
		int res = (no1*no2)/gcd(no1,no2);
		return res;
	}
	public static int gcd(int no1 ,int no2)
	{
		if(no2==0)
		{
			return no1;
		}
		else
		{
			return gcd(no2,no1%no2);
		}
	}
}
// Developed By Aagam Shah