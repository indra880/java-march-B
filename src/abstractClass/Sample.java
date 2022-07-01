package abstractClass;

public abstract class Sample {

	public static void main(String[] args) 
	{
		//Sample s=new Sample();can't create object of abstract class we create concrete class
		

	}
	public abstract void info(String name);
	
	public void info1()
	{

		String name="indrajit Jagtap";
		String place="Shirala";
		String DOB="15/10/1998";
		System.out.println("my name is "+name);
		System.out.println("place "+place);
		System.out.println("my date of birth is "+DOB);
	}
	
	

}
