package programs;

public class Day2_Strings {

	public static void main(String[] args) {
		
	/*	String name="google";
		
		System.out.println(name);
		
		name="Yahoo";
		System.out.println(name); */
		
		String name ="google";
		String name1="google";
		String trimword="    google search engine   ";
		
		
		String newname=new String("abcd");
		
		System.out.println(name.length());
		System.out.println(name.substring(1,3));
		System.out.println(name.indexOf('g'));
		System.out.println(name.toUpperCase());
		System.out.println(name.replace('g', 't'));
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.charAt(3));
/*System.out.println(name.split(","));//String Regex
System.out.println(name.split(newname,3).toString());
*/
		
System.out.println(name.concat(newname));
System.out.println(trimword.trim());
System.out.println(name.compareTo(name1));
System.out.println(trimword.contains("search"));
System.out.println();
		
		
		
		
		
		
	}
}
