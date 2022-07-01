package finaluse;

public class FinalStudy {

	public static void main(String[] args) 
	{
		int a=65;//default
		System.out.println("initial value of a is "+a);
		a=a+25;
		System.out.println("updated value of a is "+a);
		
		final int b=55;
		System.out.println("value of a is "+b);
		//b=b+85;
		

	}
	public void test()
	{
		System.out.println("i am test method from finalstudy class");
	}
	final public void test1()
	{
		System.out.println("test1 method from finalstudy class");
	}

}
