package interfacestudy;

public interface I1 
{
	void show();
	default void money()
	{
		System.out.println("my money");
	}

}
