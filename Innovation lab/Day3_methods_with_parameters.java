package programs;

public class Day3_methods_with_parameters {

	static int rollno;
	static String name;
	static int age;
	
	public static void fun(int roll,String myname,int myage)
	{
		rollno=roll;
		name=myname;
		age=myage;
	}
	
	
	public static void main(String[] args) {
		Day3_methods_with_parameters d=new Day3_methods_with_parameters();
		//System.out.println(d.rollno);
		//System.out.println(d.name);
		
		fun(102,"jeeva",26);
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(age);
	}
}








