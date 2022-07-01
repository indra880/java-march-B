package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LnledListStudy {

	public static void main(String[] args) 
	{
		LinkedList link=new LinkedList();
		
		link.add("velocity");
		link.add(1324284);
		link.add(null);
		link.add("indra");
		link.add("indra");
		link.add(null);
		link.add(9087);
		link.add("indra");
		
		System.out.println(link);
		
		System.out.println(link.size());
		System.out.println(link.add("india"));
		System.out.println(link);
		link.add(1,545);
		System.out.println(link);
		System.out.println(link.remove(0));
		System.out.println(link);
		System.out.println("==================================");
	// for loop
		for(int i=0;i<=link.size()-1;i++)
		{
			System.out.println(link.get(i));
		}
		System.out.println("=====================================");
		//for each
		for(Object a:link)
		{
			System.out.println(a);
		}
		System.out.println("======================================");
		
		Iterator it = link.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("======================================");
		
		ListIterator itl= link.listIterator();
				while(itl.hasNext())
				{
					System.out.println(itl.next());
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
