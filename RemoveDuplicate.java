/*
Write a Program to Remove Duplicate From Array
*/
import java.util.*;

class RemoveDuplicate
{
	public static void main(String[] args) 
	{
		int n,i,j,k=0,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Array elements");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}	
		int tarr[] = new int[n];
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(arr[i] == tarr[j])
				{
					flag = 1;
					break;
				}
			}
			if(flag==0)
			{
				tarr[k] = arr[i];
				k++;
			}
			flag = 0;
		}
		for(i=0;i<k;i++)
		{
			System.out.print(tarr[i]+ " ");
		}
	}
}
// Developed By Aagam Shah