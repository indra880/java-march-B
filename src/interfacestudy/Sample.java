package interfacestudy;

public class Sample implements Son {

	public static void main(String[] args)
	{
		Sample s = new Sample();
		s.money();
		s.home();
		s.mobile();
		s.bike();
		
	}

	@Override
	public void money()
	{
		System.out.println("money-->fathers property");
		
	}

	@Override
	public void home() 
	{
		System.out.println("home-->fathers property");		
	}

	@Override
	public void bike()
	{
		System.out.println("bike-->son property");
		
	}

	@Override
	public void mobile() 
	{
		System.out.println("mobile-->son property");
	}

	

	

}
