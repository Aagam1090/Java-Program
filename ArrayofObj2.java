/*
Write a Program to Implement Array of Object with Constructor
*/ 
import java.util.*;

class ArrayOfObj2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Student");
		int n = sc.nextInt();
		Student obj [] = new Student[n];
		int rollno;
		String name;
		int noSub;
		int i;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the Name rollno and no of Subject");
			name = sc.next();
			rollno = sc.nextInt();
			noSub = sc.nextInt();
			obj[i] = new Student(rollno,name,noSub);
			obj[i].getMarks();
		}
		for(i=0;i<n;i++)
		{
			obj[i].display();
		}
	}
}
class Student
{ 
	int rollno,i;
	String name;
	int noSub;
	int per;
	Student(int rollno,String name,int noSub)
	{
		this.rollno = rollno;
		this.name = name;
		this.noSub = noSub;
	}
	
	Scanner sc = new Scanner(System.in);
	public void getMarks()
	{
		int sum=0;
		int marks[] = new int [noSub];
		System.out.println("Enter the marks in Subject");
		for(i=0;i<noSub;i++)
		{
			marks[i] = sc.nextInt();
			sum += marks[i];
		}
		per = sum/this.noSub;
	}
	public void display()
	{
		System.out.println("The Name is " + this.name);
		System.out.println("The Roll no is " + this.rollno);
		System.out.println("The no of Subject is "+ this.noSub);
		System.out.println("The Percentage is "+ per);
	}
}
//Developed by Aagam Shah