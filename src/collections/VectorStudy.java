package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add("inrajit");
		v.add(200);
		v.add(true);
		v.add("pune");
		v.add(1024.44);
		v.add(null);
		v.add(null);
		v.add("pune");
		
		v.add(4, "india");
		System.out.println(v);
		
		
		v.remove("india");
		System.out.println(v);
		
		v.remove(3);
		System.out.println(v);
		
		System.out.println(v.size());
		
		System.out.println("=================================");
		
		//for each loop
		for(Object x:v)
		{
			System.out.println(x);
		}
		System.out.println("=================================");
		
		//using iterator
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=================================");
		
		//using listiterator
		
		ListIterator itl = v.listIterator();
		while(itl.hasNext())
		{
			System.out.println(itl.next());
		}
		System.out.println("=================================");
		
		//using enumerator
		Enumeration el = v.elements();
		while(el.hasMoreElements())
		{
			System.out.println(el.nextElement());
		}



	}

}
