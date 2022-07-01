package interfacestudy;

public class Test implements I1,I2
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.show();
		t.money();
	}

	@Override
	public void show() 
	{
		System.out.println("1");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void money() {
		// TODO Auto-generated method stub
		I1.super.money();
		I2.super.money();
	}

}
