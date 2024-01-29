package Collection.PriorityQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQ2 {
	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		p.add(3);
		p.add(1);
		p.add(2);
		p.add(4);
		p.add(0);
		System.out.println(p);
		p.offer(10);
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
		
//		Queue  q=new LinkedList();
//		q.offer(1);
//		q.offer(3);
//		q.offer(2);
//		q.offer(0);
//		q.offer(null);
//		q.offer(1);
//		
//		System.out.println(q);
//		
//		System.out.println(q.remove());
//		System.out.println(q);
		

	}
}
