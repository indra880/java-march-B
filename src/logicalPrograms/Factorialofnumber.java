package logicalPrograms;

public class Factorialofnumber {

	public static void main(String[] args)
	{
		int a=15;
		int b=1;
		
		for(int i=a;i>0;i--)
		{
			b=i*b;
		}
		System.out.println("factorial of "+a+" is "+b);
		

	}

}
