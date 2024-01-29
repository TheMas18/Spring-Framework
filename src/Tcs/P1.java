package Tcs;

//Write main method in the Solution class.
//In the main method, read an integer value and print "TRUE" if it contains at least 3 even digits. Else it
//should print "FALSE".
//For example, if the value is 123456 and it contains 3 even digits such as 2,4,6. So it should print "TRUE".
//The output should be in the format of sample output.
//Sample input1:
//123456
//Output:
//TRUE
//Sample input2:
//123
//Output:
//FALSE
//Restricted for circulation outside TCS Xplore 3
//--------------------------------------------------
//Sample code snippet for reference:
//Please use below code to build your solution.
//--------------------------------------------------
//public class Solution
//{
//public static void main(String[] args)
//{
////code to read values
////code to display the result
//}
//}
//-------------------------------------------------

//Solution
import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;

		int no = sc.nextInt();//123456
		while (no > 0) {
			int remainder = no % 10;
			if (remainder % 2 == 0) {
				count++;
			}
			no = no / 10;
		}
		if (count >= 3) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}
}

//Test cases
//Sample input1:
//123456
//Output:
//TRUE
//Sample input2:
//123
//Restricted for circulation outside TCS Xplore 5
//Output:
//FALSE
//Sample input3:
//24680
//Output:
//TRUE
//Sample input4:
//135
//Output:
//FALSE