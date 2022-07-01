package thisUse;

public class A {
	
	int a=490;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a = new A();
a.test();
	}
	public void test()
	{
		int a=90;
		int sub1 =900-a;
		int sub4 =900-this.a;
		System.out.println(sub1);
		System.out.println(sub4);
	}

}
