package com.company;

import java.util.Scanner;

public class level4 {
    public static void main(String[] args) {
        // exam_while();
        // sum_number();
        // exam_while_break();
        // while_sum_num();
        // for_15();
        // for_triangle();
        // do_while_and_not_do();
        // while_more();
        // pi();
        share_a_coke();
        // math_exam();
    }

    // 5 рязів показти фразу "Hello World"
    public static void exam_while() {
        int  n = 1;
        while (n <= 5)
        {
            System.out.println("Hello World");
            n++;
        }
    }

    // Підсумовування чисел
    public static void sum_number() {
        Scanner scanner = new Scanner(System.in);

        int v_sum = 0;
        boolean isExit = false;
        while (!isExit) {
            if (scanner.hasNextInt()) {
                int v_num = scanner.nextInt();
                v_sum = v_sum + v_num;
            } else if (scanner.hasNextLine()) {
                String v_line = scanner.nextLine();
                if (v_line.equals("ENTER")) {
                    isExit = true;
                }
            }
        }
        System.out.println(v_sum);
    }

    // Вводимо дані з клавіатури й одразу виводимо їх на екран, доки не буде введено слово "enough"
    public static void exam_while_break() {

        Scanner console = new Scanner(System.in);
        while (true)
        {
            String v_text = console.nextLine();
            if (v_text.equals("enough"))
                break;
            System.out.println(v_text);
        }

    }

    // Вивести на екран суму чисел від 1 до 100 включно, які не кратні 3.
    public static void while_sum_num() {
        int sum = 0;
        int number = 0;
        while (number <= 100)
        {
            if (number % 3 == 0) {
                number++;
                continue;
            }
            sum = sum + number;
            number++;
        }
        System.out.println(sum);
    }

    // виводяться на екран числа від 1 до 15.
    public static void for_15() {

        for (int i = 1; i <= 15; i++)
        {
            System.out.println(i);
        }

    }

    // програму малює на екрані трикутник: у 1-му рядку виводить 10 зірочок, у другому — 9 зірочок, потім 8 і т. д.
    public static void for_triangle() {
        for (int i = 0; i < 10; i++)
        {
            int starCount = 10 - i;
            for (int j = 0; j < starCount; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // Програма вводить рядки з клавіатури, доки не буде введено слово exit
    public static void do_while_and_not_do() {

        Scanner console = new Scanner(System.in);
        String s;

        while (true) {
            System.out.println("Привіт");
            s = console.nextLine();
            if (s.equals("exit"))
                break;
        }

        /*do
        {
            System.out.println("Привіт");
            s = console.nextLine();
        }
        while (!s.equals("exit"));*/
    }

    // Програма виводить рядок на екран number разів (максимум до 10 разів)
    public static void while_more() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number = scanner.nextInt();

        do {
            System.out.println(string);
            number--;
        } while (number > 0 && number < 10);

        /*for (int i = 0; i < number; i++)
        {
            if (number > 0 && number < 10) {
                System.out.println(string);
            } else {
                System.out.println(string);
                break;}

        }*/
    }

    // Площа круга
    public static void pi() {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        double pi = 3.14;
        int square = (int) (pi * radius * radius); // явно в int перетворили (без дробової частити)

        System.out.println(square);
    }

    // Поділити ящик кока-коли на кабінет програмістів
    public static void share_a_coke() {
        Scanner scanner = new Scanner(System.in);
        int v_cnt_bank = scanner.nextInt();
        int v_cnt_emp = scanner.nextInt();
        double v_res = (double) v_cnt_bank / v_cnt_emp; // особливість, треба мінімум одному із чисел сказати що він double

        System.out.println(v_res);
    }

    //
    public static void math_exam() {
        // округлення
        // int x = (int) Math.round(4.9); // треба явно вказати, що результат буде ціло чісло

        // округлення до більшого цілого
        // int x = (int) Math.ceil(4.3);

        // округлення до меньшого цілого
        // int x = (int) Math.floor(4.9);
        int x = (int) 4.9; // проще так зробити floor
        System.out.println(x);

    }

}


