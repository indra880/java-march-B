package logicalPrograms;

public class FindwhiteSpaces {

	public static void main(String[] args) 
	{
		
		String str1="p  u n e";
		int count=0;
		for(int i=0;i<=str1.length()-1;i++)
		{
			char space=' ';
			char mychar=str1.charAt(i);
		
			if(mychar==space)
		
			{
				count++;
			
			}
			
			System.out.println("no of white spaces in given string is "+count);
		}

	}

}
