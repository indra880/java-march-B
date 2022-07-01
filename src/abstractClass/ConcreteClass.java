package abstractClass;

public class ConcreteClass extends Sample {

	
	
	public static void main(String[] args)
	{
	ConcreteClass cc = new ConcreteClass();
	cc.info("indrajit");
	cc.info1();

	}

	@Override
	public void info(String name) {
		
		System.out.println("my name is "+name);
	}

	
		
	}



