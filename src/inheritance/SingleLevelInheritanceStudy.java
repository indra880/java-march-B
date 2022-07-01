package inheritance;

public class SingleLevelInheritanceStudy {

	public static void main(String[] args) 
	{
		Father f = new Father();
		f.home();
		f.love();
		//f.bike(); you cannot call child class property using super class object
		
		Son s = new Son();
		s.bike();
		s.home();
		s.love();
		
	

	}

}
