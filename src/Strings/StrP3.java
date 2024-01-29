package Strings;

//ramesh
//suresh
//suraj
//rakesh
//
//print name which end with esh use endswith method
public class StrP3 {
public static void main(String[] args) {
	String []s = {"ramesh","rakesh","mayuresh","om","suraj"};
	for (int i = 0; i < s.length; i++) {
		if (s[i].length()<4) {
			System.out.println("Invalid name:" + s[i]);
		} else {
			if(s[i].endsWith("esh")) {
				System.out.println(s[i]);
			}
		}
		
	}
	
}
}
