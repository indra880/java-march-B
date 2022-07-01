package inheritance;

public class HierarchicalStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mother m = new Mother();
		m.nature();
		
		Son1 s1 = new Son1();
		s1.nature();
		s1.watch();
		
		Daughter d = new Daughter();
		d.nature();
		d.scooty();                                                      
		}

}
