package exam;
import java.util.*;
import java.lang.Math.*;
public class SubArray {
	void allSubArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		int maxval=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				for(int k=i;k<=j;k++)
				{
					sum+=a[k];
					System.out.print(a[k]+"\t");
				}
				System.out.println("\n");
				System.out.println(sum);
				maxval=Math.max(maxval,sum);
				sum=0;
				
			}
		}
		System.out.println(maxval);
	
	
	}
	void  kadene()
	{
		//it will store sum of pre and current element in array then display the max sum
		// ex a={1,2,3,4} then a={1,3,9,13} and 13

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int curr=0;
		int maxval=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			curr=curr+a[i];
			a[i]=curr;
			if(curr<0)
			{
				curr=0;
			}
			maxval=Math.max(maxval, curr);
		}
		System.out.println("maxval =  "+maxval);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
			
		
	}
		
		
		void  mcss()
		{
			//sum of any two elements in an array is equal to given number k
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of array");
			int n = sc.nextInt();
			int[] a= new int[n];
			System.out.println("Enter the array element");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int sum=0;
			System.out.println("Enter the sum");
			int k=sc.nextInt();
			//for(int i=0;i<n;i++)
			//{
				//for(int j=i+1;j<n;j++)
				//{
					//sum=a[i]+a[j];
					//if(sum==k)
					//{
						//System.out.println("the 2 element  is  "+a[i]+"\t"+a[j]);
						
					//}
				//	sum=0;
				//}
			//}
			
			
			// FOR reducing the time we can try this code
			
			int low=0;
			int high=n-1;
			while(low<high)
			{
				if((a[low]+a[high])==k)
				{
					System.out.println("The 2 elements is  "+a[low]+"\t"+a[high]);
					System.exit(0);
				}
				else if((a[low]+a[high])>k)
				{
					high--;
				}
				else
				{
					low++;
				}
			}
					
		}
		
		
	

public static void main(String args[])
{
	SubArray s=new SubArray();
	//s.allSubArray();
	//s.kadene();
	s.mcss();
}

}
