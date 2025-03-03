package practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		System.out.println("Enter A NUMBER");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int count=0;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
			
		}
		

		if(count==1)
		{
			System.out.println("its a prime");
		}
		else
		{
			System.out.println("not a prime");
		}
	}
}
