package thisUse;

public class B extends A{
	int a=800;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b = new B();
b.sample();
	}
	public void sample()
	{
		int a=10;
		int sum5=a+10;
		int sum6=this.a+10;
		int sum7=super.a+10;
		System.out.println(sum5);
		System.out.println(sum6);
		System.out.println(sum7);
	}

}
