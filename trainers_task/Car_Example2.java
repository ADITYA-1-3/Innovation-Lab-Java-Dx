package trainers_task;

public class Car_Example2 {
   
	String brand;
	String model;
	int year;
	
	public Car_Example2(String mybrand,String mymodel,int myyear)
	{
		this.brand=mybrand;
		this.model=mymodel;
		this.year=myyear;
		
		System.out.println(brand);
		System.out.println(model);
		System.out.println(year);
	}
	
	
	
	public static void main(String[] args) {
		
		Car_Example2 car1=new Car_Example2("Audi","Q3",1990);
		Car_Example2 car2=new Car_Example2("Mahindra","Thar",2025);
		
	}
}
