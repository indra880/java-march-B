package generalization;

public class Airtel implements TRAI
{
// simcard=simcard+20;
	@Override
	public void call()
	{
		System.out.println("airtel call rate=50p/m");
		
	}

	@Override
	public void msg() 
	{
		System.out.println("airtel msg=200/d");
	
		
	}

	@Override
	public void data() 
	{
		System.out.println("airtel data rate 1.5gb/d");
	
		
	}
	public void airtelbank()
	{
		System.out.println("airtel bank free for user");
	}
	

}
