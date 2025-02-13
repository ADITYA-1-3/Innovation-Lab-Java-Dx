package programs;

import java.util.Scanner;

public class Day2_Switch {

	public static void main(String[] args) {
		
		System.out.println("enter vowels");
		Scanner sc=new Scanner(System.in);
		char myalphabet=sc.nextLine().charAt(0);
		
		switch(myalphabet)
		{
		case 'a':
		{
			System.out.println("Its a vowel");
			break;
		}
		case 'e':
		{
			System.out.println("Its a vowel");
			break;
		}
		case 'i':
		{
			System.out.println("Its a vowel");
			break;
		}
		case 'o':
		{
			System.out.println("Its a vowel");
			break;
		}
		case 'u':
		{
			System.out.println("Its a vowel");
			break;
		}
		default:
		{
			System.out.println("Not a vowel");
			break;
		}
		
		}
		
		//Task 2 Allocated --check vowels using switch 
		//  Use Case Sensitive(Upper and lower case)
		//Upload as Day 2 Trainer point
		
	}
	
}
