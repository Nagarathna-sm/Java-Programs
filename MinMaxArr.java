package exam;
import java.util.*;
public class MinMaxArr {

void  minMax()
{
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	int[] a= new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int min=a[0];
	int max=a[0];
	for(int i=0;i<n;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
		else if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("minimun= "+min+"\n maximum=  "+max);
	
	
}
	void reverse()
	{
		//------------pro3
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		String b="";
		for(int i=n-1;i>=0;i--)
		{
			b +=a[i];
		}
		System.out.println("the array is "+b);
		//for(int i=0;i<n;i++)
		//{
			//System.out.print(b[i]);
		//}
		
		
		
	}
	void strToArr()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		char[] str1=new char[str.length()];
		for(int i=0;i<str1.length;i++)
		{
			str1[i]=str.charAt(i);
		}
		System.out.println("Elements");
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}
		
	}
	
public static void main(String args[])
{
	MinMaxArr obj1=new MinMaxArr();
	//obj1.minMax();
	//obj1.reverse();
	obj1.strToArr();
	
}
}
