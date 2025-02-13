package programs;

import java.util.Scanner;

public class Day2_Else_if_Ladder {

	public static void main(String[] args) {
		
		System.out.println("Enter your Total mark");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		
		
		
		if(marks>40)
		{
			System.out.println("You have passed");
			if(marks>=45 &&marks <=60)
			{
				System.out.println("Average mark");
			}
			else if(marks >60 && marks <=80)
			{
				System.out.println("Good");
			}
			else if(marks >80 && marks <=90)
			{
				System.out.println("Excellent");
				
			}
			else
			{
				System.out.println("Outstanding");
			}
		}
		else
		{
			System.out.println("you failed");
		}
			
	}
}
