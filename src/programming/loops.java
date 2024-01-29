package programming;

public class loops {
    public static void main(String[] args) {
        /*-----------------------------------------While Loop----------------------------------------- */
        /* Print sum of 1-10 numbers */

        // int i = 1, sum = 0;
        // while (i <= 10) {
        // sum = sum + i;
        // i++;
        // }
        // System.out.println(sum);

        /* Print 10-1 numbers */

        // int i = 1;
        // while (i <= 10) {
        // System.out.println(i);
        // i++;
        // }

        /* Print 10-1 numbers in reverse */

        // int i = 10;
        // {
        // while (i >= 1) {
        // System.out.println(i);
        // i--;
        // }
        // }

        /* Print 2's multiplication table */

        // int i = 1;
        // while (i <= 10) {
        // System.out.println(2 + "*" + i + "=" + (2 * i));
        // i++;
        // }

        /* Print 2's multiplication table in reverse */

        // int i = 10;
        // while (i >= 1) {
        // System.out.println(2 + "*" + i + "=" + (2 * i));
        // i--;
        // }

        /* print 1-10 tables using nested while */

        // int i = 1;
        // while (i <= 10) {
        // int j = 1;
        // while (j <= 10) {
        // System.out.print(i * j + " ");
        // j++;
        // }
        // System.out.println();
        // i++;
        // }

        /* print 1-10 tables in reverse order using nested while */

        // int i = 10;
        // while (i >= 1) {
        // int j = 10;
        // while (j >= 1) {
        // System.out.print(i * j + " ");
        // j--;
        // }
        // System.out.println();
        // i--;
        // }

        /*-----------------------------------------do While Loop----------------------------------------- */
        /* Print 2's multiplication table */

        // int i = 1;
        // do {
        // System.out.println(2 + "*" + i + "=" + 2 * i);
        // i++;
        // } while (i <= 10);

        /* Print 2's multiplication table in reverse */

        // int i = 10;
        // do {
        // System.out.println(2 + "*" + i + "=" + 2 * i);
        // i--;
        // } while (i >= 1);

        /* print 1-10 tables in reverse order using nested do while */

        // int i = 1;
        // do {
        // int j = 1;
        // do {
        // System.out.print(i * j + " ");
        // j++;
        // } while (j <= 10);
        // System.out.println();
        // i++;
        // } while (i <= 10);

        /* print 1-10 tables in reverse order using nested do while */

        // int i = 10;
        // do {
        // int j = 10;
        // do {
        // System.out.print(i * j + " ");
        // j--;
        // } while (j >= 1);
        // System.out.println();
        // i--;
        // } while (i >= 1);

        /*-----------------------------------------For Loop----------------------------------------- */

        /* Print 1-10 numbers */

        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i);

        // }

        /* Print 1-10 numbers in reverse */

        // for (int i = 10; i >= 1; i--) {
        // System.out.println(i);

        // }

        /* Print 1-10 even numbers */

        // for (int num = 2; num <= 10; num++) {

        // if (num % 2 == 0) {
        // System.out.println(num);
        // }
        // }

        /* Print 1-10 even numbers in reverse */

        // for (int num = 10; num >= 2; num--) {

        // if (num % 2 == 0) {
        // System.out.println(num);
        // }
        // }

        /* Print sum of 1-10 numbers */

        // int sum = 0;
        // for (int i = 1; i <= 10; i++) {
        // sum = sum + i;
        // }
        // System.out.println(sum);

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 4; j++) {
        // System.out.print("(" + i + "," + j + ")");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 4; j++) {
        // if (i == j) {
        // System.out.print("*" + " ");
        // } else {
        // System.out.print("-" + " ");
        // }
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 4; j++) {
        // if (i + j == 5) {
        // System.out.print("*" + " ");
        // } else {
        // System.out.print("-" + " ");
        // }
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= 4; j++) {
        // if (i == j || i + j == 5) {
        // System.out.print("*" + " ");
        // } else {
        // System.out.print("-" + " ");
        // }
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if (i == j || i + j == 6) {
        // System.out.print("*" + " ");
        // } else {
        // System.out.print("-" + " ");
        // }
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}