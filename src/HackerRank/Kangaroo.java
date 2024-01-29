package HackerRank;

import java.util.*;

/*
 * If Kangaroo 1 starts behind and jumps slower than Kangaroo 2:

Kangaroo 1 will never catch up to Kangaroo 2.
Example: Kangaroo 1 starts at 0, jumps 2 units at a time; Kangaroo 2 starts at 5, jumps 3 units at a time. Kangaroo 1 can never catch Kangaroo 2.
If Kangaroo 1 starts ahead and jumps faster than Kangaroo 2:

Kangaroo 2 will never catch up to Kangaroo 1.
Example: Kangaroo 1 starts at 0, jumps 5 units at a time; Kangaroo 2 starts at 3, jumps 2 units at a time. Kangaroo 2 can never catch Kangaroo 1.
If Kangaroo 1 starts behind and jumps faster than Kangaroo 2:

We check if the difference in their starting positions is divisible evenly by the difference in their jump distances.
If yes, Kangaroo 1 will catch up to Kangaroo 2.
Example: Kangaroo 1 starts at 0, jumps 3 units at a time; Kangaroo 2 starts at 4, jumps 2 units at a time. They will meet after the first jump (4 - 0 is divisible by 3 - 2).
In code, this logic is implemented by checking (x2 - x1) % (v1 - v2) == 0. If true, they will meet; if false, they won't.
 * */

import java.util.*;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 == v2) {
            return (x1 == x2) ? "YES" : "NO";
        }

        if ((x2 - x1) % (v1 - v2) == 0 && (x2 - x1) / (v1 - v2) >= 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int v1 = scanner.nextInt();

        int x2 = scanner.nextInt();   
        int v2 = scanner.nextInt();

        System.out.println( kangaroo(x1, v1, x2, v2));
    }
}




/**
 * Q You are choreographing a circus show with various animals. For one act, you
 * are given two kangaroos on a number line ready to jump in the positive
 * direction (i.e, toward positive infinity).
 * 
 * The first kangaroo starts at location and moves at a rate of meters per jump.
 * The second kangaroo starts at location and moves at a rate of meters per
 * jump. You have to figure out a way to get both kangaroos at the same location
 * at the same time as part of the show. If it is possible, return YES,
 * otherwise return NO.
 * 
 * Example
 * 
 * 
 * 
 * 
 * After one jump, they are both at , (, ), so the answer is YES.
 * 
 * Function Description
 * 
 * Complete the function kangaroo in the editor below.
 * 
 * kangaroo has the following parameter(s):
 * 
 * int x1, int v1: starting position and jump distance for kangaroo 1 int x2,
 * int v2: starting position and jump distance for kangaroo 2 Returns
 * 
 * string: either YES or NO Input Format
 * 
 * A single line of four space-separated integers denoting the respective values
 * of , , , and .
 * 
 * Constraints
 * 
 * Sample Input 0
 * 
 * 0 3 4 2 Sample Output 0
 * 
 * YES Explanation 0
 * 
 * The two kangaroos jump through the following sequence of locations:
 * 
 * image
 * 
 * From the image, it is clear that the kangaroos meet at the same location
 * (number on the number line) after same number of jumps ( jumps), and we print
 * YES.
 * 
 * Sample Input 1
 * 
 * 0 2 5 3 Sample Output 1
 * 
 * NO Explanation 1
 * 
 * The second kangaroo has a starting location that is ahead (further to the
 * right) of the first kangaroo's starting location (i.e., ). Because the second
 * kangaroo moves at a faster rate (meaning ) and is already ahead of the first
 * kangaroo, the first kangaroo will never be able to catch up. Thus, we print
 * NO.
 * 
 * /
 */