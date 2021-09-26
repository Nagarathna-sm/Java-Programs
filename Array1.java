package exam;
import java.util.*;

public class Array1 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of  array");
		int n=sc.nextInt();
		int[] a= new int[n];
		System.out.println("Enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Enter the index number to access the array element");
		int k=sc.nextInt();
		System.out.println(a[k]);
		System.out.println("Enter the element to search");
		int s= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==s)
			{
				System.out.println(i);
				System.exit(0);
			}
			else if (i==n-1)
			{
				 
						System.out.println("Doesnot existst");
					
			}
			
			}
		}
	}


