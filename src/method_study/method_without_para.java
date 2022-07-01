package method_study;

public class method_without_para {

	public static void main(String[] args)
	{
		method_without_para mp = new method_without_para();
		mp.batchinfo();
		
		batchinfo1();
		mp.mathsoperations();
		
		mathsoperations1();
		
		mp.sum();
		sub();
		

	}
public void batchinfo()
{
	String name="vishal patil";
	String district="kolhapur";
	String branch ="civil";
	int rollno=12;
	float percentage= 90.25f;
	System.out.println("*#*#*#*# METHOD WITHOUT PARAMETER *#*#*#*#" );
	System.out.println("STUDENT NAME : "+name);
	System.out.println("DISTRICT : "+district);
	System.out.println("BRANCH : "+branch);
	System.out.println("ROLL NO. : "+rollno);
	System.out.println("PERCENTAGE : "+percentage);
	System.out.println("********************************************");
	
	}

public static void batchinfo1()
{
	String name="sanket gaikwad";
	String district="sangli";
	String branch="civil";
	int rollno=35;
	float percentage=92.65f;
	System.out.println("*********************************************");
	System.out.println("STUDENT NAME : "+name);
	System.out.println("DISTRICT : "+district);
	System.out.println("BRANCH : "+branch);
	System.out.println("ROLL NO. : "+rollno);
	System.out.println("PERCENTAGE : "+percentage);
	System.out.println("**********************************************");
	
}



public void mathsoperations()
{
	int a=54;
	int b=25;
	int sum=a+b;
	int sub=a-b;
	int mul=a*b;
	int div=a/b;
	System.out.println("*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#");
	System.out.println("_$_$_$_$_ MATHEMATICAL OPERATIONS _$_$_$_$_");
	System.out.println("ADDITION IS "+sum);
	System.out.println("SUBSTRACTION IS "+sub);
	System.out.println("MULTIPLICATION IS "+mul);
	System.out.println("DIVISION IS "+div);
	System.out.println("************************************************");
}
public static void mathsoperations1()
{
	int a=68,b=24,sum=a+b,sub=a-b,mul=a*b,div=a/b;
	System.out.println("**************************************************");
	System.out.println("ADDITION IS "+sum);
	System.out.println("SUBSTRACTION IS "+sub);
	System.out.println("MULTIPLICATION IS "+mul);
	System.out.println("DIVISION IS "+div);
	System.out.println("____________________________________________________");
}
public void sum()
{
	int x=25;
	int y=35;
	int z=54;
	int add=x+y+z;
	System.out.println("addition is "+add);
	
}
public static void sub()
{
	int p=847;
	int q=364;
	int sub=p-q;
	System.out.println("substraction is "+sub );
}

	
}
