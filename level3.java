package com.company;

import java.util.Scanner;

public class level3 {
    public static void main(String[] args) {
        // temperature();
        // militaryCommissar();
        // school_or_institute();
        // what_level_in_school();
        // level_salary();
        // three_numbers();
        // cat();
        // work_or_not_work();
        // high_comparison();
        // text_comparison();
        text_comparison_tern();
    }

    // Тепло чи холодно
    public static void temperature() {
        String cold = "на вулиці холодно";
        String warm = "на вулиці тепло";
        Scanner console = new Scanner(System.in);
        int v_temperature = console.nextInt();
        if (v_temperature < 0)
            System.out.println(cold);
        else
            System.out.println(warm);
    }

    // Призовна кампанія
    public static void militaryCommissar() {
        String militaryCommissar = ", з'явіться до військкомату";
        Scanner console = new Scanner(System.in);
        String v_name = console.nextLine();
        int v_age = console.nextInt();
        if (v_age >= 18 && v_age <= 26)
        {
            System.out.println("hello");
            System.out.println(v_name + militaryCommissar);
        }
    }

    // Школа чи інститут
    public static void school_or_institute() {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
            if (age >= 6)
                System.out.println("треба ходити до школи");
            else
                System.out.println("треба ходити до садику");
        } else
            System.out.println("час до інституту");

    }

    // Рівень в школі в залежності від того в якому ти класі
    public static void what_level_in_school() {
        Scanner scanner = new Scanner(System.in);
        int v_clas_school = scanner.nextInt();
        if (v_clas_school < 4) {
            System.out.println("Малолетки");
        } else if (v_clas_school < 10) {
            System.out.println("Середняки");
        } else if (v_clas_school < 12) {
            System.out.println("Старшоки");
        } else System.out.println("Всього 11 класів!");

    }

    // Рівень зарплати
    public static void level_salary() {
        Scanner scanner = new Scanner(System.in);
        int v_salary = scanner.nextInt();
        boolean v_low_salary = v_salary <=2000;
        boolean v_avg_salary = v_salary > 2000 && v_salary <=8000;
        boolean v_high_salary = v_salary>8000 && v_salary<=15000;

        if (v_low_salary) {
            System.out.println("Маленька зарплата");
        } else if (v_avg_salary) {
            System.out.println("Середня зарплата");
        } else if (v_high_salary) {
            System.out.println("Велика зарплата");
        } else System.out.println("Зарплата рівень боженька");
    }

    // Три числа
    public static void three_numbers() {
        Scanner scanner = new Scanner(System.in);
        int v_num1 = scanner.nextInt();
        int v_num2 = scanner.nextInt();
        int v_num3 = scanner.nextInt();

        if (v_num1 == v_num2 && v_num2 == v_num3) {
            System.out.println(v_num1 + " " + v_num2 + " " + v_num3);
        } else if (v_num1 != v_num2 && v_num2 == v_num3) {
            System.out.println(v_num2 + " " + v_num3);
        } else if (v_num1 == v_num2 && v_num2 != v_num3) {
            System.out.println(v_num1 + " " + v_num2);
        } else if (v_num1 == v_num3 && v_num2 != v_num3 && v_num2 != v_num1) {
            System.out.println(v_num1 + " " + v_num3);
        } else System.out.println("Немає рівних чисел");
    }

    // Чи можно покормити кота
    public static void cat() {
        int mouse = 0; // число мышек
        int weight = 4500; // вес кота в граммах

        if (mouse != 0 && weight / mouse < 1000) { // якщо поставити один & буде помилка, бо буде перевірятися два вирази, а на 0 ділити не можно
            System.out.println("Можно кормить кота");
        } else System.out.println("Нельзя кормить кота");
    }

    // Працювати чи не працювати — отаке питання
    public static void work_or_not_work() {
        Scanner scanner = new Scanner(System.in);
        int v_age = scanner.nextInt();

        if (v_age >= 20 && v_age <= 60) {
            // System.out.println("Працювати!");
        } else  System.out.println("можна не працювати");
    }

    // Висока точність порівняння чисел
    public static void high_comparison() {
        Scanner scanner = new Scanner(System.in);
        double v_num1 = scanner.nextDouble();
        double v_num2 = scanner.nextDouble();

        if ( Math.abs(v_num2 - v_num1) < 0.000001 )
            System.out.println("числа рівні");
        else
            System.out.println("числа не рівні");
    }

    // порівняння тексту через if/else
    public static void text_comparison() {
        Scanner scanner = new Scanner(System.in);
        String v_str1 = scanner.nextLine();
        String v_str2 = scanner.nextLine();

        if (v_str1.equalsIgnoreCase(v_str2)) { // порівнюються сами тексти (ігноруючи регістр) який в змінних
        //if (v_str1.equals(v_str2)) { // порівнюються сами тексти який в змінних
        //if (v_str1 == v_str2) { // порівнюються їх координати в памяті, так як зміні різні, то координати також різні
            System.out.println("рядки однакові");
        } else {System.out.println("рядки різні");
        }
    }

    // порівняння тексту через тернарний оператор (аналог if/else)
    public static void text_comparison_tern() {
        Scanner scanner = new Scanner(System.in);
        String v_str1 = scanner.nextLine();
        String v_str2 = scanner.nextLine();

        // результат тернарного оператора, можно присвоити змінній
        String v_result = v_str1.equals(v_str2) ? "рядки однакові" : "рядки різні";
        System.out.println(v_result);
    }
}
