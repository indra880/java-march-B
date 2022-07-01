package interfacestudy;

public interface Father
{
	void money();
	void home();
	default void love()
	{
		System.out.println("fathers love");
	}

}
