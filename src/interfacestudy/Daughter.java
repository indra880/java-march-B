package interfacestudy;

public class Daughter implements Father, Mother {

	public static void main(String[] args) 
	{
	Daughter d = new Daughter();
	d.look();
	d.nature();
	d.home();
	d.money();
	d.love();

	}

	@Override
	public void look() {
		System.out.println("mothers look");
		
	}

	@Override
	public void nature() {
		System.out.println("mothers nature");
		
	}

	@Override
	public void money() {
		System.out.println("fathers money");
		
	}

	@Override
	public void home() {
		System.out.println("fathers home");
		
	}

	@Override
	public void love() {
		// TODO Auto-generated method stub
		Father.super.love();
		Mother.super.love();
	}

	

}
