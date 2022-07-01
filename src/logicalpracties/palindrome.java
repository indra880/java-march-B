package logicalpracties;

public class palindrome {

	public static void main(String[] args) 
	{
		String a="mom";
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println(b);
		if(b.equals(a))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
		

	}

}
