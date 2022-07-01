package logicalPrograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{  //a Ans b addition
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a");
		
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();
		
		int sum=a+b;
		System.out.println("Addition is "+sum);
		

	}

}
