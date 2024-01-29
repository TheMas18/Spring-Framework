package Strings;

public class StrP1 {
//Q	Calculate first unique character 
public static void main(String[] args) {
	String s = "calculate";
	
	char[] ch = s.toCharArray();
	boolean[] b = new boolean[ch.length]; //ffftfffff
	boolean flag = true;
	for (int i = 0; i < ch.length; i++) {// calculate

		if (b[i] == false) {
			int count = 1;//2
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					b[j] = true;

				}
			}
			if (flag == true && count == 1) {
				System.out.println(ch[i] + " " + count);
				flag = false;
			}
		}

	}
}
}
