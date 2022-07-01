package finaluse;

public class A extends FinalStudy {
public void test()//override
{
	System.out.println("hi i am testmethod from A class");
}
//public void test1() we cannot override final method
//{
	//System.out.println();
	
//}
	public static void main(String[] args)
	{
		A a=new A();
		FinalStudy fs= new FinalStudy();
		fs.test();
		a.test();

	}

}
