package logicalPrograms;

public class RandomString {

	public static void main(String[] args) 
	{
		String s = "@@#i$%ndr*&$ajit";
		String name = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(name);
		String n2 = s.substring(3);
		System.out.println(n2);
	
	}

}
