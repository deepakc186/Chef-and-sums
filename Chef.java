package chef;

import java.util.Scanner;

public class Chef {

{
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	int size;
	int T;                        
	System.out.println("enter the number of test cases");		
	T=scan.nextInt();                                                                 		 //reading no. of test cases
 
	int[] pre=new int[T];				          		//pre array													
	int suff[]=new int[T];

		
	int i;
	int k;
	
	System.out.println("Enter the size of array");
	
	size=scan.nextInt();						//size of array
	
	int a[]=new int[size];						//array intialized with size
		System.out.println("enter the elements of array");
		for(i=0;i<size;i++)
		{
			a[i]=scan.nextInt();				//array elements entererd
		}

	int z[]=new int[T];						//numbers from where test should perform
	
	System.out.println("enter the number from which you wanna calc prefix and suffix");
	for(i=0;i<T;i++)
	{
		z[i]=scan.nextInt();
	}
	
	int sum[]=new int[T];

	for(i=0;i<T;i++)
	{
	pre[i]=prefixSum(z[i],a);
	suff[i]=suffixSum(z[i],a);
	}

	System.out.println("sum of prefixes is:");
	for(i=0;i<T;i++)
	{
		System.out.println(pre[i]);
	}

	System.out.println("sum of suffixes is:");
	for(i=0;i<T;i++)
	{
		System.out.println(suff[i]);
	} 							
	
	
	
	
	sum=sum(pre,suff,T);
	
		System.out.println("sum of prefix and suffix is:");
		for(i=0;i<T;i++)
	{
		System.out.println(sum[i]);			//Sum of suffixed and prefixes are displayed
	} 							
	

	min(sum,T);						//call made to min()
	
	}

	public static int prefixSum(int j,int b[])
	{
		int presum=0;
		for(int i=0;i<j;i++)
		{
		presum=presum+b[i];
		}
		return presum;
	}

	public static int suffixSum(int j,int b[])
	{
		int suffixsum=0;
		for(int i=j+1;i<b.length;i++)
		{
		suffixsum=suffixsum+b[i];
		}
		return suffixsum;
	}

	public static int[] sum(int[] l,int[] p,int T)
	{
		int sum[]=new int[T];
		for(int i=0;i<T;i++)
		{
		sum[i]=l[i]+p[i];
		}
		
		return sum;                                                                            //return sum of prefix+suffix
	}

	public static void min(int sum[],int T)
	{
		int min;
		min=sum[0];
		for(int i=0;i<T;i++)
		{
			if(min>sum[i])
			min=sum[i];
			
		}
		System.out.println("minimum among them is: "+min);                       //minimum number is displayed
	}
	

    }
    
}
