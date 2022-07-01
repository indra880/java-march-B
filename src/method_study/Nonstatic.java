package method_study;

public class Nonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nonstatic n = new Nonstatic();
		n.sub();
		
		Callfromotherclass c = new Callfromotherclass();
		c.mul1();
		
		
		
	}
public void sub()
{
	int a=20;
	int b=40;
	int sub=b-a;
	System.out.println("substraction is "+sub);
	}



	
	

}

