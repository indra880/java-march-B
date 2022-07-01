package arrayStudy;

public class IntArray {

	public static void main(String[] args)
	{
		//1-10
		int number[]=new int[10];//with new keyword
		number[0]=1;
		number[1]=2;//critical way
		
		int ij[]= {1,2,3,4,5,6,7,8};
		System.out.println(ij.length);
		
		for(int i=0; i<=ij.length-1; i++)
		{
			System.out.println(ij[i]);
			
		}
		
		//string type arry
		String city[]= {"pune","mumbai","nagpur"};
		for(int i=city.length-1;i>=0;i--)
		{
			System.out.println(city[i]);
		}
		String name[]= {"indrajit" , "sukhdev" , "jagtap" };
		for(int i=name.length-1;i>=0;i--)
		{
			System.out.print(name[i]+" ");//reverse order
		}
		String name1[]= {"TATA"};
		for(int i=name.length-1;i>0;i--)
		{
			System.out.println((name[i]));
		}
				

	}

}
