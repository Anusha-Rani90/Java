package javabasics;

import java.util.Scanner;

public class BubbleSortDesc {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		int[] a=new int[size];
		
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Descending Order:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("The first max element is "  +a[0]);
		System.out.println("The first min element is "  +a[a.length-1]);
		int sum=0;
		for(int i=0;i<2;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println("the sum of first two max numbers : " +sum);
	}

}
