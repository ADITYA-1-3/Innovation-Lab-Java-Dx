package practice;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		
		System.out.println("Enter a Name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		
		char word[]=new char[name.length()];
		
		for(int i=0;i<name.length();i++)
		{
			word[i]=name.charAt(i);
		  System.out.println(word[i]);
		}
		
		
		
		
	}
	
}
