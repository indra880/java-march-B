package thisUse;

public class ThisStudy {
	int a=50;
	

	public static void main(String[] args)
	{
		ThisStudy th = new ThisStudy();
		th.test();

	}
	public void test()
	{
		int a=40;
		int sum=a+100;
		System.out.println(sum);
		int sum2=this.a+100;
		System.out.println(sum2);
	}

}
