package collections;

import java.util.PriorityQueue;

public class PriorityqueueStudy {

	public static void main(String[] args)
	{
		PriorityQueue p = new PriorityQueue<>();
		/*
		 * p.add("velocity"); p.add(412); p.add(45.5); p.add('d');
		 * System.out.println(p);
		 */
		p.add("velocity");
		p.add("corporate");
		p.add("training");
		p.add("centre");
		System.out.println(p);
		System.out.println(p.element());
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);

	}

}
