package constructor;

public class CS1 {
// with parameter
	int a;
	int b;
	int c;
	
	public CS1() //without parameter constructor
	{
		a=10;
		b=20;
		c=30;
		
	}
	public CS1(int x) //with parameter
	{
		a=x;
	}
	public CS1(int x,int y)
	{
		a=x;
		b=y;
	}
	public CS1(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
		
	}
	
	public static void main(String[] args) 
	{
		CS1 c2 = new CS1();
		c2.sum();
		CS1 c3 = new CS1(100);
		c3.sum();
	CS1 c4 = new CS1(100,200);
		c4.sum();
		CS1 C5 = new CS1(100, 2500, 200);
		C5.sum();
		
				

	}
	public void sum()
	{
		int sum=a+b+c;
		System.out.println("sum is "+sum);
	}

	
}
