package controlStatement;

public class NestedIfPractice {

	public static void main(String[] args)
	{
	int  ATMPin=1234;
	int amount=500;
	
	if(ATMPin==1234)
	{
		System.out.println("please enter amount ");
		
		if(amount>=400)
		{
			System.out.println("your transaction is successful");
		}
		else
		{
			System.out.println("insufficint funds");
		}
		
		
	}
	else
	{
		System.out.println("invalid data");
	}
	

	}
		

}
