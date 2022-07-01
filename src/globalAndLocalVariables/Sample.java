package globalAndLocalVariables;

public class Sample {
	int m=120;
	static int n=140;
	
	public void display()
	{
		System.out.println("I am non static method (display) from sample class");
	}
public static void display1()
{
	System.out.println("I am static method (display1) from sample class");
}
}
