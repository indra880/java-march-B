package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListint {

	public static void main(String[] args) {

	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(12);
	al.add(15);
	al.add(10);
	
	
	for(Integer k:al)
	{
		System.out.println(k);
	}
	System.out.println("===========================");
	
	Iterator<Integer> it = al.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("===========================");
	ListIterator<Integer> itl = al.listIterator();
	while(itl.hasNext())
	{
		System.out.println(itl.next());
		
	}
	
	
		
	}

}
