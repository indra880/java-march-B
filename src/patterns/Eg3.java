package patterns;

public class Eg3 {

	public static void main(String[] args) 
	{  
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
		// rows=5 col=5
		int star=1;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;
		}
	

	}

}
