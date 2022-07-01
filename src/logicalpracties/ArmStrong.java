package logicalpracties;

public class ArmStrong {

	public static void main(String[] args) 
	{
		int a=420;
		int b=0;
		for(int i=a;i>0;i=i/10)
		{
			int rem = i%10;
			b=b+(rem*rem*rem);
		}
		System.out.println(a);
		System.out.println(b);
		if(a==b)
		{
			System.out.println("given no is armstrong");
		}
		else
		{
			System.out.println("given no is not armstrong");
		}
		
		

	}

}
