package arrayStudy;

public class MultidiamentionalArray {

	public static void main(String[] args) 
	{
		//row column   see in notebook
		int ar[][]= {{1,2},{3,4}};
		System.out.print(ar[0][0]+" ");
		System.out.print(ar[0][1]+" ");
		System.out.println();
		System.out.print(ar[1][0]+" ");
		System.out.print(ar[1][1]+" ");
		System.out.println();
		System.out.println("================================================");
		
		//use of nested for loop
		for(int i=0;i<=ar.length-1;i++)//outer for loop for row
		{
			for(int j=0;j<=ar.length-1;j++)//inner for loop for column
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}

	}

}
