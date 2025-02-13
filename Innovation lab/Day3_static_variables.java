package programs;

public class Day3_static_variables {
     
     int a=90;
 
	public static void main(String[] args) {
		Day3_static_variables p1=new Day3_static_variables();
		Day3_static_variables p2=new Day3_static_variables();
		Day3_static_variables p3=new Day3_static_variables();
		Day3_static_variables p4=new Day3_static_variables();
		Day3_static_variables p5=new Day3_static_variables();
		
		p1.a=455;
		p1.a=23;
		p2.a=100;
		p3.a=800;
		p4.a=100000;
		
		p1.a=003;
		System.out.println("p1 value"+p1.a);
		System.out.println("p2 value"+p2.a);
		System.out.println("p3 value"+p3.a);
		System.out.println("p4 value"+p4.a);
		System.out.println("p5 value"+p5.a);
		
		
		
		
		
				
	}
}
