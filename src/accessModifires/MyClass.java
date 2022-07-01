package accessModifires;

public class MyClass {

	public static void main(String[] args) 
	{
		PrivateUse pu1 = new PrivateUse();
		pu1.test();
	//	pu1.test1(); we can't call private members from another class
		System.out.println(pu1.a);
	//	System.out.println(pu1.b); can't call
		
		
	}

}
