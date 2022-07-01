package interfacestudy;

public interface Mother
{
	void look();
	void nature();
	default void love()
	{
		System.out.println("mothers love");
	}

}
