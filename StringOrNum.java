/*
Write a Program to find if the number is Char or Number
*/
import java.util.*;

class StringOrNum
{
	public static void main(String[] args) 
	{
		String sentence;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		sentence = sc.next();
		if(sentence.charAt(0)>='A'&&sentence.charAt(0)<='Z')
		{
			sentence = sentence.toLowerCase();
			System.out.println(sentence.charAt(0));
		}
		else if(sentence.charAt(0)>='a'&&sentence.charAt(0)<='z')
		{
			sentence = sentence.toUpperCase();
			System.out.println(sentence.charAt(0));
		}
		else
		{
			int no = Integer.parseInt(sentence);
			System.out.println("The Number is " + no);
		}
	}
}
// Developed By Aagam Shah