package Collection.LearnLinkedList;

import java.util.LinkedList;

public class LearnLinkList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
//		System.out.println(list);
		list.addFirst("a");
		list.addFirst("is");
		
		System.out.println(list);
		list.addFirst("this");
		list.addLast("List");
		list.add("program"); // by default this will add element at last position
		System.out.println(list);

		System.out.println("Size of the list is : " + list.size());
	
			
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "-->");
		}
		System.out.println("Null");
		
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
	
	}
}
