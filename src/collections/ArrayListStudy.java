package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) 
	{
		//create object of arraylist class
		// specific array list we want then
				//ArrayList<String> as = new ArrayList<String>();//specific type of array
				
		
		
		ArrayList al = new ArrayList();//generic  type of array
		al.add("indrajit");
		al.add("8766549493");
		al.add(989.09);
		al.add("indrajit");
		al.add(null);
		al.add(null);
		System.out.println(al);
		
		System.out.println(al.get(5));
		System.out.println(al.get(2));
		
		
		
		al.add(1, "velocity");
		System.out.println(al);
		
		
		
		al.remove(2);
		System.out.println(al);
		al.remove("velocity");
		System.out.println(al);
		
		
		
		System.out.println(al.size());
		
		
		System.out.println(al.contains("indrajit"));
		System.out.println("================================");
		
		for(int i=0; i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("================================");
		///moving through list using curser-->iterator
	    Iterator it = al.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
		
	    System.out.println("================================");
		///moving through list using curser-->listiterator
	    
	    ListIterator itl = al.listIterator();
	    while(itl.hasNext())
	    {
	    	System.out.println(itl.next());
	    }
	    System.out.println("================================");
		///moving through list usinng for each loop
	    for(Object b:al)   // b=refrence variable
	    {
	    	System.out.println(b);
	    }

		
		
		
		
		

	}

}
