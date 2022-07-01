package globalAndLocalVariables;

public class GlobalAndLocalVariables1 {
	int p=20;
	int q=30;
	static int r=40;
	 
			

	public static void main(String[] args) 
	{
		GlobalAndLocalVariables1 g = new GlobalAndLocalVariables1 ();
		g.test();
test1();
System.out.println("value of p is "+g.p);//calling non static global variables from same class
System.out.println(g.q);//calling non static global variables from same class
System.out.println("value of r is "+r);//calling  static global variables from same class

Sample.display1();//calling static method from another class----->classname.method name
Sample s = new Sample();//created object of sample class
s.display();//calling non static method from another class
System.out.println("value of m is "+s.m);//calling non static global variables from another class
System.out.println("value of n is "+Sample.n);//calling static global variables from another class
int sub=100-s.m;//using non static varible from another class
int mul=10*Sample.n;//using static varible from another class
System.out.println("substarctio is "+sub);
System.out.println("multiplication is "+mul);

	}
public void test()
{
	int mul=p*q;
	System.out.println("multiplication is "+mul);
	
}
public static void test1 ()
{
	int sum=10+r;
	System.out.println("addition is "+sum);
}
}
