package com.company;

public class level7 {

    public static final int DISPLAY_WIDTH = 1024; // пишемо великими літерами, а роздільник слів - знак підкреслення
    public static final int DISPLAY_HEIGHT = 768; // пишемо великими літерами, а роздільник слів - знак підкреслення

    public static void main(String[] args) {
        // signIn("Костя");
        // level6.array_sort(); // викликати метод із іншого класу
        // int[] array = {15,64,9,51,42}; printSqrt(array);
        hard_logic();
    }

    public static void signIn(String username){
        if (username.equals("user")){
            return;
        }
        System.out.println("Ласкаво просимо, " + username);
        System.out.println("Дуже скучили за Вами, " + username);
    }

    // Метод виводить квадратний корінь із кожного елемента масиву, переданого в метод.
    public static void printSqrt(int[] array) {
        String elementSqrt = "Квадратний корінь із числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt_res = Math.sqrt(element); // квадратний корінь
            System.out.println(elementSqrt + element + " дорівнює " + elementSqrt_res);
        }
    }

    // Функція яка повертає імʼя тім ліда
    public static String get_team_lead_name() {
        return "Костя";
    }

    // Функція яка повертає зарплату тім ліда
    public static int get_team_lead_salary() {
        return 17500;
    }

    public static void hard_logic() {
        String v_name = get_team_lead_name();
        int v_salary = get_team_lead_salary();
        System.out.println("Тім лід = " + v_name + ", зарплата тім ліда = " + v_salary);
    }
}
