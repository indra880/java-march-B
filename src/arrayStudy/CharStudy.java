package arrayStudy;

public class CharStudy {

	public static void main(String[] args)
	{
		//we want store a,b,c,d,e,f
		
		char ar[]=new char[4];
		ar[0]='a';
		ar[1]='b';
		ar[2]='c';
		ar[3]='d';
		//ar[4]='e';
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		
		System.out.println("============================================================================================================");
		for(int i=0; i<=3; i++)    //static coding because we change above char value then we show exception error so we use below method
		{
			System.out.println(ar[i]);
		}
		System.out.println("============================================================================================================");
		for(int i=0; i<=ar.length-1; i++)//Dynamic coding it is depend upon situation it changes with respect to situation
		{
			System.out.println(ar[i]);
		}
	
		System.out.println("============================================================================================================");
	
	
	
	
	}
	
	

}
