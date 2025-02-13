package programs;

public class Day2_String_Discussion {
public static void main(String[] args) {
	
	String name="Abcd";
	String name1=new String("Abcd");

	System.out.println(name==name1.intern());
	System.out.println(name.equals(name1));
	
}
}
