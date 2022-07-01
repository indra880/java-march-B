package method_study;

public class Methodwithoutparameter {

	public static void main(String[] args) 
	{

Methodwithoutparameter m = new Methodwithoutparameter();
m.result();

m.studentinfo();
	}
public void result()
{
	int sub1=89;
	int sub2=15;
	int sub3=25;
	int total=sub1+sub2+sub3;
	int avg=total/3;
	System.out.println("my result is "+avg);
}
	
public void studentinfo() //name,rollno,mob,age,batch,gender
{
	String name= "indrajit jagtap";
	int rollno= 112;
	String mobno= "7038379351";
	float age=24.3f;
	int batch= 12;
	char gender = 'M';
	String dateofbirth = "15/10/1998";
	System.out.println("**************************************");
	System.out.println("my name is "+name);
	System.out.println("my roll no is "+rollno);
	System.out.println("my mob no is "+mobno);
	System.out.println("my age is "+age);
	System.out.println("my batch is "+batch);
	System.out.println("my gender is "+gender);
	System.out.println("my date of birth is "+dateofbirth);
	System.out.println("****************************************");
	
}
	
}
