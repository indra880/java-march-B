package logicalPrograms;

public class reversenumber {

	public static void main(String[] args) 
	{
		int a=123;
		String originalString = Integer.toString(a);
		String reverse="";
		
		for(int i=originalString.length()-1;i>=0;i--)
		{
			reverse=reverse+originalString.charAt(i);
			
		}
		System.out.println("reverse string is "+reverse);
		System.out.println(Integer.parseInt(reverse));
	

	}

}
