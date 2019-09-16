/*
Write a Program to Implement Array of Objects Concept in Java
*/
import java.util.*;

class ArrayOfObj
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.println("Enter the no of Employee");
		n = sc.nextInt();
		Employee e[] = new Employee[n];
		Employee temp = new Employee();
		for(i=0;i<n;i++)
		{
			e[i] = new Employee();
		}
		for(i=0;i<n;i++)
		{
			e[i].getDetails();
		}
		for(i=0;i<n;i++)
		{
			e[i].displayDetails();
		}
		int Max = e[0].Age;
		temp = new Employee();
		for(i=0;i<n;i++)
		{
			if(e[i].Age>Max)
			{
				temp = e[i];
				Max = temp.Age;
			}
		}
		System.out.println("The Eldest Employee is");
		System.out.println(temp.Name);
		System.out.println(temp.Age);
		System.out.println(temp.Dept);
	}
}
class Employee
{
	String Name;
	int Age;
	String Dept;
	Scanner sc = new Scanner(System.in);
	public void getDetails()
	{
		System.out.println("Enter the Name");
		this.Name = sc.next();
		System.out.println("Enter the Age");
		this.Age = sc.nextInt();
		System.out.println("Enter the Department");
		this.Dept = sc.next();
	}
	public void displayDetails()
	{
		System.out.println("The name is " + this.Name);
		System.out.println("The Age is "+ this.Age);
		System.out.println("The Department is " + this.Dept );
	}
}
//Developed By Aagam Shah