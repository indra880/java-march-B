package logicalPrograms;

public class ReversenumberWithoutString {

	public static void main(String[] args) 
	{
		int a=123;
		int b=0;
		
		for(int i=a;i>0;i=i/10)
		{
			int rem = i%10;
			b=b*10+rem;
		}
		System.out.println(b);
		

	}

}
