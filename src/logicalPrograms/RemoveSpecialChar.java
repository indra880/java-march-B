package logicalPrograms;

public class RemoveSpecialChar {

	public static void main(String[] args)
	{
		String a="indrajit@";
		System.out.println(a.replace("@", ""));

	
	
	String s="@%ind$rajit";
	System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
	} 

}
