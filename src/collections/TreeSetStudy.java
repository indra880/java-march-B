package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args)
	{
		TreeSet t = new TreeSet<>();
		
		t.add(145);
		t.add(22);
		t.add(1545);
		t.add(5);
		t.add(644);
		t.add(44);
		t.add(4);
		t.add(41);
		//t.add('w');
		// we can store only homogeneous data
		//class cast exception
		System.out.println(t);
		System.out.println(t.pollFirst());
		System.out.println(t);
		System.out.println(t.pollLast());
		System.out.println(t);
		System.out.println(t.size());
		System.out.println("==================================");
		
		Iterator it = t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("==================================");
		for(Object a:t)
		{
			System.out.println(a);
		}
		System.out.println("==================================");
		



	}

}
