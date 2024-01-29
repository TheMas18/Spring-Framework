package Collection;

import java.util.*;
import java.util.Map.Entry;

public class CollectionPractice1 {
	public static void main(String[] args) {

//		Write a program to iterate the HashMap

//		HashMap m = new HashMap();
//		m.put(1, "Mayuresh");
//		m.put("bye", 10);
//		m.put(2, null);
//		m.put(10, null);
//		m.put(1, "op");
//		m.put(null, 110);
//
//		System.out.println(m.entrySet());
//		System.out.println();

//        1. for-each loop
//        for (Object key : m.keySet()) {
//	        System.out.println("key: " + key + " value: " + m.get(key));
//	     

//        2. keyset() iterator

//        	Set s=m.keySet();
//        	Iterator it=s.iterator();
//        	while(it.hasNext()) {
//
//        		Object k=it.next();
//        		System.out.println(k +" ="+ m.get(k));
//        		
//        	}

//        3. entrySet() and for loop

//        Set<Map.Entry> s=m.entrySet();
//    
//        for (Map.Entry entry : s) {
//            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
//        }

//        4. entrySet() and java iterator
//
//		Set<Map.Entry> s = m.entrySet();
//		Iterator<Map.Entry> it = s.iterator();
//		while (it.hasNext()) {
//			Map.Entry k = it.next();
//			System.out.println("key: " + k.getKey() + " value: " + k.getValue());
//		}
	//Sort hasmap
		
//		
//		  HashMap<Integer, String> h = new HashMap<Integer, String>();
//		  
//		    // Adding Key and Value pairs to HashMap
//		    h.put(22,"A");
//		    h.put(55,"B");
//		    h.put(33,"Z");
//		    h.put(44,"M");
//		    h.put(99,"I");
//		    h.put(88,"X");
//		
//		    System.out.println(h);
		    
//		    Set s=h.keySet();
//		    Iterator it=s.iterator();
//		    while(it.hasNext()) {
//		        Map.Entry pair = (Map.Entry)it.next();
//		        System.out.print(pair.getKey() + ": ");
////		        System.out.println(pair.getValue());
//		    	
//		    }
//		   TreeMap t=new TreeMap(h);
//		   System.out.println(t);
//		   Set<Map.Entry> s=t.entrySet();
//		   Iterator<Map.Entry> it=s.iterator();
//		   while(it.hasNext()) {
//			   Map.Entry k=it.next();
//			   System.out.println("key: " + k.getKey() + " value: " + k.getValue());
//		   }
		// sort by values
		    HashMap<Integer, String> h = new HashMap<Integer, String>();
			  
		    // Adding Key and Value pairs to HashMap
		    h.put(22,"A");
		    h.put(55,"B");
		    h.put(33,"Z");
		    h.put(44,"M");
		    h.put(99,"I");
		    h.put(88,"X");
		
		    System.out.println(h);
		    List<Map.Entry<Integer, String>> list = new LinkedList<>(h.entrySet());
		    
		    Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
	            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
	                return o1.getValue().compareTo(o2.getValue());
	            }
	        });
		    
		    LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
	        for (Map.Entry<Integer, String> entry : list) {
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }

	        System.out.println(sortedMap);
		
	
	}


}
