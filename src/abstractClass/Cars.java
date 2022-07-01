package abstractClass;

public class Cars extends Vehical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cars c = new Cars();
		c.start();
		
	}

	@Override
	void start()
	{
		System.out.println("start with key");
		
		
	}

}
