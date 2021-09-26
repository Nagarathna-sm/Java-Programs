package exam;
import java.util.*;
import java.io.*;
public class BinarySearch {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n= sc.nextInt();
		int[] arr1= new int[n];
		System.out.println("Enter the array element");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search");
		int k=sc.nextInt();
		//Binary seacrch //10 20 30 50 90 //50
		int s=0;//0
		int e=n;//4
		while(s<=e)//1--
		{
			int mid=(int) ((s+e)/2);//1---2

			if(arr1[mid]==k)//1---30-50
			{
				System.out.print("The element is present at position "+mid);
				System.exit(0);
			}
			 if(k>arr1[mid])
			{
				s=mid+1;

			}
			else
			{

				e=mid-1;
				 

			}
			
			
		}
	}

}
