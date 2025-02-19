package programs;

public class Day3_methods_with_parameters_nonstatic {

	 int rollno;
	 String name;
	 int age;
	
	public  void fun(int roll,String myname,int myage)
	{
		rollno=roll;
		name=myname;
		age=myage;
	}
	
	
	public static void main(String[] args) {
		Day3_methods_with_parameters_nonstatic d=new Day3_methods_with_parameters_nonstatic();
		Day3_methods_with_parameters_nonstatic d1=new Day3_methods_with_parameters_nonstatic();
		//System.out.println(d.rollno);
		//System.out.println(d.name);
		
		d.fun(102,"jeeva",26);
		d1.fun(100, "aravind",10);
		System.out.println(d1.rollno);
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d.rollno);
		System.out.println(d.name);
		System.out.println(d.age);
	}
}








