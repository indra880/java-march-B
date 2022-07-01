package logicalPrograms;

public class ArmStrongnumber {

	public static void main(String[] args)
	{
		int a=417;
		int b=0;
		
		for(int i=a;i>0;i=i/10)
		{
			int m=i%10;
			b=b+(m*m*m);
		}
		System.out.println("orignal no is "+a);
		System.out.println("cube "+b);
		if(b==a)
		{
			System.out.println("given no is armstrong");
		}
		else
		{
			System.out.println("given no is not armstrong");
		}
		

	}

}
