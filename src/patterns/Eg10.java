package patterns;

public class Eg10 {

	public static void main(String[] args) 
	{
		
		int star=4;
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
			star--;
			space++;
	

	}

}
}
