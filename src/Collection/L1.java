package Collection;

import java.util.*;

public class L1 {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(2, "B");
		m.put(5, "E");
		m.put(1, "A");
		m.put(3, "C");
		m.put(4, "D");

//		for (Object o : m.keySet()) {
//			System.out.println("key: " + o + " " + "," + "value: " + m.get(o));
//		}
		
//		Set s=m.entrySet();
//		Iterator i=s.iterator();
//		while(i.hasNext()) {
//			
//			System.out.println(i.next());
//		}
		
		Set s=m.keySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Object k=i.next();
			System.out.println("key: " +k + " " + "," + "value: " + m.get(k) );
			
		}
	}

}
