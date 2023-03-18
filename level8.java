package com.company;

public class level8 {
    public static void main(String[] args) {
        test();
        // test2();
    }
    public static String name; // Змінна String name має значення за замовчуванням: null
    public static int age; // Змінна int age має значення за замовчуванням: 0
    //
    public static void test() {
        System.out.println(0.0 / 0.0); // Not a Number
        // System.out.println(0 / 0); // ArithmeticException: / by zero
        System.out.println( 100.0 / 0.0 ); // додатна нескінченність
        System.out.println( -100.0 / 0.0 ); // від'ємна нескінченність.

        int x = (4 & 5);
        System.out.println(x);
    }

    public static void test2() {
        double v_num = 1.1;
        int v_num2 = (int) v_num;
        System.out.println(v_num);
        System.out.println(v_num2);
    }
}
