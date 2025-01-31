package programs;

public class Day1_Operators {

	public static void main(String[] args) {
		
		//Arithmetic Operators  --comment Line
		
		int a=100;
		int b=3;
		int c=15;
		
	/* two Operands perform an action which result in
	addition or subtraction or multiplication or division or moduls
	known as Arithmetic operation 
		
		 the above is multiple comment line
		
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);  
		
	
		
		//************************************************
		//Assignment Operator
		
		a+=10;  //a=a+10
		System.out.println(a);  //20
		
		a-=2;
		System.out.println(a);  //18
		
		a*=5;
		System.out.println(a); //90
		
		a/=3;                   
		System.out.println(a);  //30
		
		a%=10;
		System.out.println(a); //0  
		
		
		
		//***********************************
		
		//Relational Operators
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=c);
		System.out.println(a<=c);
		System.out.println(a!=b);
		System.out.println(a==b);  
		
		
		//****************************************
		//Logical Operator
		
		//&& ||  !
		
		System.out.println(a>b && a>c);
		System.out.println(a>b || a>c);
		System.out.println(!(a>b));  
		
		
		//*****************************************
		//Bitwise Operator
		
		//AND  OR  NOT        EXCLUSIVE OR
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~-5); //-(n+1)
		
		//******************************************
		//Shift Operator
		
		System.out.println(a>>3);
		System.out.println(a<<2);
		//Signed Integer
		//Unsigned Integer
		//Signed right shift
		//Unsigned right shift 
		//Signed left shift 
		//Unsignd left shift     */
		
		
		//*****************************
		//Ternary Operator
		
String result=((a>b)&&(a>c))?"A is Greater":((b>a)&&(b>c))?"B is greater":"C is greatest";
		System.out.println(result);
		
		
		
	  
		
		
		
		
		
		
		
		
	}
}
