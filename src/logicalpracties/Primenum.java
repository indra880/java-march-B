package logicalpracties;

public class Primenum {

	public static void main(String[] args)
	{
		int a=67;
		int b=0;
		for(int i=2;i<=a-1;i++)
		{
			if(a%i==0)
			{
				b++;
			}
			
		}
		if(b>0)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}

	}

}
