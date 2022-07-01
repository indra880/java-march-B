package method_study;

public class Methodwithparameter {

	public static void main(String[] args) 
	{
		
Methodwithparameter m = new Methodwithparameter();
m.addition(20, 30);
m.addition(50, 51);

m.studentinfo("indrajit", 20, "7038379351", 24.2f, 12, 'm');
m.studentinfo("vishal", 55, "125478965", 24.5f, 13, 'm');
	}
public void addition(int a,int b)
{

	int sum=a+b;
	System.out.println("addition is "+sum);
	
	
}
	
public void studentinfo(String name,int rollno,String mob,float age,int batch,char gender)
{
	System.out.println("my name is "+name);
	System.out.println("my roll no is "+rollno);
	System.out.println("my mob no is "+mob);
	System.out.println("my age is "+age);
	System.out.println("my batch is "+batch);
	System.out.println("my gender is "+gender);
}
}
