package interfacestudy;

public class MyClass implements MyInterface {

	public static void main(String[] args) {
	MyClass m = new MyClass();
	m.test1();
	m.test2();
	m.test3();
	System.out.println(a);

	}

	@Override
	public void test1() {
	System.out.println("hi this method is completed in implementation class");
		
	}

	@Override
	public void test2() {
		System.out.println("hi this method is completed in implementation class");

		
	}
	
	public void test3()
	{
		System.out.println("This method is from my class");

	}

}
