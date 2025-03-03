package programs;

public class Encapsulation_Example {

	private int rollno;
	private String name;
	

	
	public void setrollno(int myroll)
	{
	  this.rollno=myroll;
	}
	
	public void setname(String myname)
	{
	  this.name=myname;
	}
	
	public int getrollno()
	{
		return rollno;
	}
	public String getname()
	{
		return name;
		
		
	}
	
	//POJO CLASS--Plain Old Java Object
	public static void main(String[] args) {
		
		Encapsulation_Example e1=new Encapsulation_Example();
		e1.setrollno(12);
		e1.setname("abcd");
		System.out.println(e1.getrollno());
		System.out.println(e1.getname());
		
	}
}







