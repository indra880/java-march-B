package logicalPrograms;

public class ReverseMiddlestring {

	public static void main(String[] args)
	{
		String a="abc pqr xyz";
		String[] ar = a.split(" ");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			if(i%2==0)
			{
				String s = ar[i];
				ar[i]=revestring(s);
				System.out.println(ar[i]);
			}
			else
			{
				
				System.out.println(ar[i]);
			}
		}
	

	}
	public static String revestring(String inp)
	{
		String b="";
		for(int i=inp.length()-1;i>=0;i--)
		{
			b=b+inp.charAt(i);
		}
		
		return b;
	}

}
