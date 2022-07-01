package globalAndLocalVariables;

public class GlobalAndLocalVariable {
	int a=10;
	int b=20;
	static int c=30;
	static int d=40;
	

	public static void main(String[] args)
	{
		
GlobalAndLocalVariable gb = new GlobalAndLocalVariable();
gb.addition();
sub();
	}
public void addition()
{
	int sum1=a+b;
	int sum2=c+d;
	System.out.println("addition is "+sum1);
	System.out.println("addition is "+sum2);
}
public static void sub()
{
	int sub2=c-d;
	System.out.println("substaction is "+sub2);
}

}
