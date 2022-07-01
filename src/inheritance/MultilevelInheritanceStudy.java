package inheritance;

public class MultilevelInheritanceStudy {

	public static void main(String[] args) {
		Father f = new Father();
		f.home();
		f.love();
		
		Son s = new Son();
		s.bike();
		s.home();
		s.love();
		
		Grandson gs = new Grandson();
		gs.cycle();
		gs.bike();
		gs.home();
		gs.love();

	}

}
