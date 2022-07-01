package logicalPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("please enter string value");
//		String s1 = sc.next();
//		System.out.println("given string is "+s1);
//		
//		//reverse string
//		String s2 = "";
//		
//		for(int i=s1.length()-1;i>=0;i--)
//		{
//			s2=s2+s1.charAt(i);
//			
//		}
//		System.out.println(s2);
//		
		
		
		
		
		Scanner sc1=new Scanner(System.in);
		String s3 = sc1.next();
		String s4 = "";
		for(int i=s3.length()-1;i>=0;i--)
		{
			s4=s4+s3.charAt(i);
		}
		System.out.println(s4);

	}

}
