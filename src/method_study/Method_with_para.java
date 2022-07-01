package method_study;

public class Method_with_para {

	public static void main(String[] args)
	{
		Method_with_para mp = new Method_with_para();
		mp.batchinfo("sourabh patil", "sangli", "civil", 25, 85.23f);
		mp.batchinfo("om sonar", "karad", "mechanical", 11, 70.24f);
		
		mathsoperations(23,21);
		mathsoperations(24,15);
		
		mp.operations(95, 75);

	}

	public void batchinfo(String name,String district,String branch,int rollno,float percentage)
	{
	System.out.println("!!!!!!!! METHOD WITH PARAMETER !!!!!!!");
	System.out.println("STUDENT NAME = "+name);
	System.out.println("DISTRICT = "+district);
	System.out.println("BRANCH = "+branch);
	System.out.println("ROLL No. = "+rollno);
	System.out.println("PERCENTAGE = "+percentage);
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	public static void mathsoperations(int a,int b)
	{
		int sum=a+b,sub=a-b,mul=a*b,div=a/b;
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("@@@@@@@@@@@@ MATHS OPERATIONS @@@@@@@@@@@");
		System.out.println("ADDITION = "+sum);
		System.out.println("SUBSTRACTION = "+sub);
		System.out.println("MULTIPLICATION = "+mul);
		System.out.println("DIVISION = "+div);
		System.out.println("****************************************");
		
	}
	public void operations(int x, int y)
	{
		int sum=x+y;
		int sub=x-y;
		System.out.println("addition is "+sum);
		System.out.println("substraction is "+sub);
	}
}
