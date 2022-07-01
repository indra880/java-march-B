package polymorphism;

public class MethodOverloading {

	public static void main(String[] args)
	{
MethodOverloading mo=new MethodOverloading();
mo.add();
mo.add(25.32f, 444.220f);
mo.add(122,5580);
	}
	public void add()
	{
		int a=56;
		int b=74;
		int sum=a+b;
		System.out.println("addition is "+sum);
		
	}
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("addtion is "+sum);
	}
	public void add(float a,float b)
	{
		double sum=a+b;
		System.out.println("sum is "+sum);
	}

}
