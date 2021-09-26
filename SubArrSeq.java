package exam;
import java.util.*;
public class SubArrSeq {
	Scanner sc= new Scanner(System.in);
	void subarray() {
		System.out.println("Enter the size of array");
		int n= sc.nextInt();
		int[] a= new int[n];
		System.out.println("Enter the array element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=i;j<n;j++)
			{
				count=count+a[j];
				System.out.print(a[j]);
				//System.out.println(count);
			}
			System.out.println("\n"+"sum= "+count);
		}
	}
		void recordBreaker()
		{
			/// a[i-1]<a[i]>a[i+1];
			System.out.println("Enter the size of array");
			int n= sc.nextInt();
			int[] a= new int[n];
			System.out.println("Enter the array element");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int min=-1;
			int max=-1;
			
			for(int i=0;i<n;i++)
			{
				
					if(a[i]>min && a[i]>a[i+1])
					{
				
						System.out.println(a[i]);
					
					}
				
				if(a[i]>min)
				{
					min=a[i];
				}
			}
			
			
		}
		void firstrept()
		{
			// return the first repeted value index(position)
			System.out.println("Enter the size");
			int n=sc.nextInt();
			int[] a= new int[n];
			System.out.println("ENter the array elemnt");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(i==j)
					{
						continue;
					}
					else
					{
						if(a[i]==a[j])
						{
							if(i>j)
							{
								System.out.println(j+1);
								System.exit(0);
							}
							else {
									System.out.println(i+1);
									System.exit(0);
							}
						}
					}
				}
			}
		}
		
	public static void main(String args[])
	{
		SubArrSeq s= new SubArrSeq();
		s.subarray();
	//	s.recordBreaker();
		//s.firstrept();
	}

}
