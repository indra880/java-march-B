package accessModifires;

public class PrivateUse {
	public int a=10;// nonstatic global variable
	private int b=20;
	
	

	public static void main(String[] args)
	{
	PrivateUse pu=new PrivateUse();
	pu.test();
	pu.test1();
	System.out.println(pu.a);
	System.out.println(pu.b);

	}
	public void test()
	{
		System.out.println("this is public test method");
	}
	private void test1()
	{
		System.out.println("this is private test method");
	}

}
