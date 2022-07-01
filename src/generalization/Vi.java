package generalization;

public class Vi implements TRAI {

	@Override
	public void call() {
		System.out.println("vi call rate 120p/m");
		
	}

	@Override
	public void msg() {
     System.out.println("vi msg 50/d");
		
	}

	@Override
	public void data() {
		System.out.println("vi data 500mb/d");
		
	}
	public void callertune()
	{
		System.out.println("vi own method caller tune free");
	}

}
