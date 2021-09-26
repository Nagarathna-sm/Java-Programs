package exam;
import java.util.*;
public class Sorting {
	Scanner sc= new Scanner(System.in);
	void selectionSort1(){
		System.out.println("Enter the size of array");
		int n= sc.nextInt();
		int[] a= new int[n];
		System.out.println("Enter the array element");
		for( int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Selection sort begine");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("sorted element is");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
	}
	void bubblesort()
	{
		System.out.println("Entr the array size");
		int n= sc.nextInt();
		System.out.println("Enter the array element");
		int[] a= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int counter=1;
		while(counter<n)
		{
			for(int i=0;i<n-counter;i++)
			{
				if(a[i]>a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			counter++;
		}
		System.out.println("sorted elemnt");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	void insertionsort()
	{
		System.out.println("Size of array");
		int n= sc.nextInt();
		int[] a= new int[n];
		System.out.println("Eter the array element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			int current=a[i];
			int j=i-1;
			while((j>=0)&&(a[j]>current))
			{
				a[j+1]=a[j];
				j--;
				
			}
			a[j+1]=current;
		}
		
		System.out.println("the sorted element is");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		
	
		}
	}
public static void main(String argd[])
{
	Sorting s=new Sorting();
	//s.selectionSort1();
	//s.bubblesort();
	s.insertionsort();
}
}
