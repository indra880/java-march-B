package generalization;

public class TelecomOperator {

	public static void main(String[] args) 
	{
		Airtel a = new Airtel();
		Jio j = new Jio();
		Vi v = new Vi();
		
		a.call();
		a.msg();
		a.data();
		a.airtelbank();
	//	Airtel.simcard=Airtel.simcard+10; we cant change final variable value
		System.out.println((Airtel.simcard));
		System.out.println("===========================================================");
		
		j.call();
		j.msg();
		j.data();
		j.jiotv();
		System.out.println(Jio.simcard);
		System.out.println("=============================================================");
		
		
		v.call();
		v.msg();
		v.data();
		v.callertune();
		System.out.println(Vi.simcard);
		System.out.println("*****************************************************************");


	}

}
