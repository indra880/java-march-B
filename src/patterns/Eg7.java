package patterns;

public class Eg7 {

	public static void main(String[] args) 
	{
//		*******
//		 *****
//		  ***
//		   *
		//rows=4 col=7
		int star=7;
		int space=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
	
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star-2;
			space=space+1;
		}

	}

}
