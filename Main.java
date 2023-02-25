package com.company;

import java.util.Scanner;

public class Main {

    // головний метод main
    public static void main(String[] args) {
        // division_see_remainder();
        // incr_decr();
        str_to_num();
        // input_by_keyboard();
    }

    // побачити остаток від поділу
    public static void division_see_remainder() {
        double number = 546.5;
        double lastDigit = number % 10;
        //lastDigit++;
        System.out.println(lastDigit);
    }

    // инкремент и декремент
    public static void incr_decr() {
        int v_num = 1;
        v_num++; // инкремент +1
        v_num++; // инкремент +1
        v_num--; // декремент -1
        System.out.println(v_num);
    }

    // конвертувати текст в число
    public static void str_to_num() {
        String bigAmount = "500";
        String greatAmount = "100000";
        int hugeAmount = Integer.parseInt((Integer.parseInt(greatAmount)/1000) + bigAmount);
        System.out.println(hugeAmount);
        // System.out.println("Костя".length());
    }

    // вивести на екран дані с клавіатури
    public static void input_by_keyboard()
    {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt(); //nextLine - приняти текст
        int b = console.nextInt();
        System.out.println(a + b);
    }
};