package controlStatement;

public class elseIfStudy {

	public static void main(String[] args)
	{
		//if marks greater than or equal to 75-->distinction
		//if marks are greater than or equal to 66-->1st class
		//if marks are greater than or equal to 40-->pass
		//if marks are less than 40-->fail
		
		int marks=67;
		if(marks>=75)
		{
			System.out.println("you are in distinction");
		}
		else if (marks>=66)
		{
			System.out.println("you are in 1st class");
		}
		else if (marks>=40)
		{
			System.out.println("you are pass");
		}
		else
		{
			System.out.println("you are fail");
		}

	}

}
