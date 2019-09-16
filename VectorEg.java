/*
Write a Program to Implement Shopping Cart Using Vector Concept in Java
 */
import java.util.*;

class VectorEg
{
	public static void main(String[] args)
	{
		Vector <String> v = new Vector();
		int ch = 1;
		Scanner sc = new Scanner(System.in);
		while(ch!=4)
		{ 
		System.out.println("1.Add Element");
		System.out.println("2.Delete Element");
		System.out.println("3.Display Element");
		System.out.println("Exit");
		System.out.println("Enter the Choice");
		ch = sc.nextInt();
		switch(ch)
			{
				case 1:
					System.out.println("Enter the name");
					String name;
					name = sc.next();
					if(v.contains(name))
					{
						System.out.println("Element Already Exists");
					}
					else
					{
						v.addElement(name);
					}
					break;
				case 2:
					System.out.println("Enter the name to delete");
					String del;
					del = sc.next();
					if(v.contains(del))
					{v.removeElement(del);
					System.out.println("Element Removed Succesfully");}
					else
						System.out.println("Wrong Name");
				break;
				case 3:
				System.out.println(v);
				break;
				case 4:
				System.out.println("Thank You");
				break;
			}
		}		
	}
}
// Developed By Aagam Shah