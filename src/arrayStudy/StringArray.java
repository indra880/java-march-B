package arrayStudy;

public class StringArray {

	public static void main(String[] args)
	{
		//i want store name of 5 students
		
		String name[] = new String[5];
		
		name[0]="velocity";
		name[1]="corporate";
		name[2]="training";
		name[3]="centre";
		name[4]="pune";
		//System.out.println(name);
		for (int i=0;i<=4;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
		
				
		
		//i want store grades of 3 students
		
		char grade[] = new char[3];
		
		// i want to store salary of staff
		
		int salary[]= new int[5];
		System.out.println("==================");
		String s1 = "indrajit";
		String s2 ="";
		for(int i=s1.length()-1;i>=0;i--)
		
			s2=s2+s1.charAt(i);
			System.out.println(s2);
		
		
		

	}

}
