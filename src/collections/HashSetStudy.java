package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		
		hs.add("jagtap");
		hs.add(455);
		hs.add("jagtap");
		hs.add(null);
		hs.add(null);
		hs.add(87857);
		
		System.out.println(hs);
	// duplicate not accepted,only one null value accept.random insertion
		
		
		System.out.println(hs.size());
		System.out.println(hs.add("indra"));
		System.out.println(hs);
		
		System.out.println("=================================");
		//using for loop
		/*
		 * for(int i=0;i<=hs.size()-1;i++) { System.out.println(hs.get(i)); }
		 */
		System.out.println("======================================");
		//using for each
		for(Object a:hs)
		{
			System.out.println(a);
		}
		System.out.println("======================================");
		//using iterator
		Iterator xy = hs.iterator();
		while(xy.hasNext())
		{
			System.out.println(xy.next());
		}
		
		
		
		
		
		
		
		
	}

}
