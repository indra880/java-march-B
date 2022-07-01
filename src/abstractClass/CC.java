package abstractClass;

public class CC extends Test {

	public static void main(String[] args) {
		
CC c = new CC();
c.test();
c.test1();
	}

	@Override
	public void test() {
		
		System.out.println("test method of abstract class");
	}

}
