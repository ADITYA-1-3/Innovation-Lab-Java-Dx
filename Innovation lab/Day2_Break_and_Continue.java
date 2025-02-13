package programs;

public class Day2_Break_and_Continue {

	public static void main(String[] args) {
	
		for(int i=0;i<20;i++)
		{
			if(i==8)
			{
				continue;
				
			}
			System.out.println("i value "+i);
		}
		
		/*
		 * for(int i=0;i<20;i++)
		{
			if(i==8)
			{
				break;
				
			}
			System.out.println("i value "+i);
		}
		 */
		
	}
}
