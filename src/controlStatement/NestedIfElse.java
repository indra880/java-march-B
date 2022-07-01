package controlStatement;

public class NestedIfElse {

	public static void main(String[] args)
	{
		//if UN is correct -->enter password,else please check UN
		//If passwords correct-->login success,else invalid password
		String Un="velocity";
		String password="indra@123";
		if("velocity"==Un)
		{
			System.out.println("user name is correct please enter password");
			
			if("indra@123"==password)
			{
				System.out.println("login successful");
			}
			else
			{
				System.out.println("invalid password");
			}
			
		}
		else
		{
			System.out.println("plese insert correct username");
		}
	
		

	}

}
