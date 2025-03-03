package practice;

import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	
	System.out.println("enter number of values");

	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int a[]= new int[num];
	int b[]=new int[a.length];
	System.out.println(a.length);
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}

	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
	
   
	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i];
	}
	
	
	
}
}
