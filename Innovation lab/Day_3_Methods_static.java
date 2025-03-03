package programs;

public class Day_3_Methods_static {
	//access specifier
	//return type
	//static or non-static (optional)
	//method name
	//parameter, or no parameter (optional)
	
	
	//access-specifier[public,private,default,protected]
	public static void fun()//Method Declaration
	{
		 System.out.println("sample static method");//Method Definition
		 
	}
	public  void fun1()//Method Declaration
	{
		 System.out.println("sample non-static method");//Method Definition
	}
public static void main(String[] args) {
	Day_3_Methods_static a=new Day_3_Methods_static();
	fun();//method calling
	a.fun1();//method calling
	
	
	
}
}






