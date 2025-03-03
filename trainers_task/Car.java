package trainers_task;

public class Car {
   
	String brand;
	String model;
	int year;
	
	
	public void displayDetails(String mybrand,String mymodel,int myyear)
	{
		this.brand=mybrand;
		this.model=mymodel;
		this.year=myyear;
		
		
		System.out.println(brand);
		System.out.println(model);
		System.out.println(year);
	}
	
	public static void main(String[] args) {
		
		Car car1=new Car();
		Car car2=new Car();
		car1.displayDetails("BMW","M4",1989);
		car2.displayDetails("Rolls Royce","Ghost", 1955);
	}
}
