package stringMethods;

public class Reverse {

	public static void main(String[] args) 
	{
		String s1="indrajit";
		String s2="";
		
		int len = s1.length()-1;
		for(int i=len;i>=0;i--)
		
			s2=s2+s1.charAt(i);
			System.out.println(s2);
		
		

	}

}
