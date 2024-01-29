package Practice;

public class P3 {
	public static void main(String[] args) {

		/* =================== Area of Circle A=πr^2 =================== */

		// double r = 10;
		// final double val = 3.14d;
		// double area_of_circle = val * r * r;
		// System.out.println(area_of_circle);

		/* =================== Area of Triangle A=0.5* b*h =================== */

		// double b = 20;
		// double h = 40;
		// double area_of_triangle = 0.5 * b * h;
		// System.out.println(area_of_triangle);

		/* =================== Area of Rectangle A=l*b =================== */

		// double l = 10;
		// double b = 20;
		// double area_of_rectangle = l * b;
		// System.out.println(area_of_rectangle);

		/* =================== Area of Isosceles Triangle A=bh/2 =================== */

		// double b = 10;
		// double h = 20;
		// double area_of_isosceles_triangle = (b * h) / 2;
		// System.out.println(area_of_isosceles_triangle);

		/* =================== Area of Parallelogram A=b*h =================== */

		// double b = 10;
		// double h = 12;
		// double area_of_parallelogram = b * h;
		// System.out.println(area_of_parallelogram);

		/* =================== Area of Rhombus A=pq/2 =================== */

		// double p = 10;
		// double q = 10;
		// double area_of_rhombus = (p * q) / 2;
		// System.out.println(area_of_rhombus);

		/* ============= Area of Equilateral Triangle A=0.43*a^2============== */

		// double a = 10;
		// final double val = 0.43d;
		// double area_of_equilateral_triangle = val * a * a;
		// System.out.println(area_of_equilateral_triangle);

		/* =================== Perimeter Of Circle p=2πr =================== */

		// double r = 20;
		// final double val = 3.14d;
		// double perimeter_of_circle = 2 * val * r;
		// System.out.println(perimeter_of_circle);

		/* ============= Perimeter Of Equilateral Triangle p=3a ============== */

		// double a = 20;
		// double perimeter_of_equi_triangle = 3 * a;
		// System.out.println(perimeter_of_equi_triangle);

		/** ================= Perimeter Of Parallelogram p=2(a+b) ================= */

		// double a = 20;
		// double b = 12;
		// double perimeter_of_parallelogram = 2 * (a + b);
		// System.out.println(perimeter_of_parallelogram);

		/*********** While loop ****************/
		// int i = 2;
		// while (i <= 20) {
		// System.out.println(i);
		// i += 2;
		// }
		// int i = 20;
		// while (i >= 2) {
		// System.out.println(i);
		// i -= 2;
		// }

		/* Print 1 to 10 Numbers using FOR LOOP */
		// for (int i = 1; i <= 10; i++) {
		// System.out.println(i);
		// }
		/* Print 10 to 1 Numbers using FOR LOOP */
		// for (int i = 10; i >= 1; i--) {
		// System.out.println(i);
		// }

		// for (int i = 1, j = 2; i <= 10; i++, j++) {
		// System.out.println(i);
		// System.out.println(j);
		// }

		/* Print 1 to 10 even numbers using FOR LOOP */

		// for (int num = 1; num <= 10; num++) {
		// if (num % 2 == 0) {
		// System.out.println(num);
		// }
		// }

		/* Print sum of 1 to 10 numbers using FOR LOOP */
		// int num = 0;
		// for (int i = 1; i <= 10; i++) {
		// num = num + i;

		// }
		// System.out.println(num);

		/* Increment and decrement operator */

		// byte b = 10;
		// short s = 20;
		// int i = 13;
		// long l = 4;
		// float f = 1.1f;
		// double d = 1.123;
		// char ch = 'a';
		// String s1 = "Qspiders";

		// System.out.println(++b + s-- + ++i + s1 + s1 + ++f + d--);
		// System.out.println(++i + l++ + ++ch);
		// System.out.println(b + l + s1 + d + i);

		/* loops */

		/*------------ while -----------*/

		// int i = 1;
		// System.out.println("start");
		// while (i <= 10) {
		// System.out.println(i);
		// }

		// System.out.println("end");

		/*--------------  For Loop  -------------- */

		// for (int i = 10; i >= 1; i++) {
		// System.out.println(i);

		// }

		/*--------------  1-10 even numbers  -------------- */
		// for (int num = 2; num <= 10; num++) {
		// if (num % 2 == 0) {
		// System.out.println(num);
		// }

		// }

		/*-------------- 1-10 odd numbers  -------------- */
		// for (int num = 1; num <= 10; num++) {
		// if (num % 2 == 1) {
		// System.out.println(num);
		// }
		// }

		/*-------------- sum of 1-10  numbers -------------- */

		// int sum = 0;
		// for (int i = 1; i <= 10; i++) {
		// sum = sum + i;

		// }
		// System.out.println(sum);

		/************ Nested Loops ************/
		// for (int i = 1; i <= 10; i++) {
		// for (int j = 1; j <= 10; j++) {
		// System.out.print(i * j + " ");
		// }
		// System.out.println();
		// }
		// int i = 0;
		// while (i <= 5) {
		// i++;
		// int j = 1;
		// while (j <= 10) {
		// System.out.print(i * j + " ");
		// j++;
		// }
		// System.out.println();
		// }s

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j || j >= 4) {
					System.out.print("*" + " ");

				} else {
					System.out.print("_" + " ");
				}
			}
			System.out.println();
		}

	}
}
