/*
Write a Program for String Manipulation
*/
import java.util.*;
import java.io.*;

class StringManipulation
{
	public static void main(String[] args) {
		String s1;
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		s1 = sc.next();
		for(i=0;i<s1.length();i++)
		{
			char temp = s1.charAt(i);
			for(j=i+1;j<s1.length();j++)
			{
				if(temp == s1.charAt(j))
				{
					s1 = charRemoveAt(s1,j);
				}
			}
		}
		System.out.println("The Cleaned String is " + s1);
	}
	 public static String charRemoveAt(String str, int p)
	  {  
           return str.substring(0, p) + str.substring(p + 1);  
      }  
}
//Developed By Aagam Shah