package Collection;

import java.util.*;

//class Employee{
//	int id;
//	String name;
//	double sal;
//	public Employee(int id,String name,double sal) {
//		this.id=id;
//		this.name=name;
//		this.sal=sal;
//	}
//	public String toString() {
//		return id+ " "+name+" "+sal;
//	}
//
//}

public class LearnC {
	public static void main(String[] args) {

//		List<Employee> a=new ArrayList<>();
//		a.add(new Employee(1,"Mas",15000));
//		
//		System.out.println(a);

//		List a=new ArrayList();
//		a.add(10);
//		a.add("hi");
//		a.add(20.5);
//		
//		
//		ListIterator l=a.listIterator();
//		while (l.hasNext()) {
//			System.out.println(l.next()+ " ");
//		}
//		for (Object o : a) {
//			System.out.println(o+ " ");
//		}

//		String [] s= {"java","Sql","webtech"};
//		List<String>a=Arrays.asList(s);
//		System.out.println(a);

//		Set s=new HashSet();
//		s.add(10);
//		s.add("hi");
//		s.add(20.5);
//		s.add("hi");
//		s.add(null);
//		s.add(null);

//		Set s=new LinkedHashSet();
//		s.add(10);
//		s.add("hi");
//		s.add(20.5);
//		s.add("hi");
//		s.add(null);
//		s.add(null);

//		TreeSet s=new TreeSet();
//		s.add(10);
//		s.add(20);
//		s.add(15);
//		s.add(5);
//		s.add(30);
//		
//
//		System.out.println(s);

//		
//		List s=new ArrayList();
//		s.add(10);
//		s.add(20);
//		s.add(15);
//		s.add(5);
//		s.add(30);
//		s.add(30);
//		System.out.println(s);
//		
//		Set as= new TreeSet(s);
//		System.out.println(as);
//		
//		TreeSet<Integer> t=new TreeSet<>();
//		t.add(10);
//		t.add(10);
//		t.add(20);
//		t.add(40);
//		t.add(30);
//		
//		System.out.println(t);
//		
//		LinkedList<Integer> l=new LinkedList<>(t);
//		System.out.println(l);
//		
//		String[] s= {"A","A","B","D","C","Z","E","E"};
//		
//		List<String> l=Arrays.asList(s);
//		ArrayList al=new ArrayList(l);
//		System.out.println(l);
//		al.remove(1);
//		System.out.println(al);

		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(1, "A");
		m.put(1, "A");
		m.put(3, "C");
		m.put(5, "D");
		m.put(4, "B");
		System.out.println(m.keySet());

//		
//		List<Integer> s=new ArrayList<>();
//		s.add(10);
//		s.add(20);
//		s.add(15);
//		s.add(5);
//		s.add(30);
//		s.add(30);
//		System.out.println(s);
//		ListIterator l=s.listIterator();
//		while(l.hasPrevious()) {
//			System.out.println(l.previous());
//		}
		
	
	}
}
