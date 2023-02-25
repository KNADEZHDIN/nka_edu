package com.company;

public class level6 {
    public static void main(String[] args) {
        // array_exam();
        // array_for();
        // array_for2();
        two_dim_array();
    }

    public static void array_exam() {

        int[] v_array_int = new int[] {-1, 2, 3, -4, -5};
        //int[] v_array_int = new int[5];
        // double[] v_array_dob = new double[5];

        v_array_int[0] = 10;
        v_array_int[1] = 20;

        System.out.println(v_array_int[0]);
        System.out.println(v_array_int[1]);
        System.out.println(v_array_int[2]);
        System.out.println(v_array_int[3]);
        System.out.println(v_array_int[4]);
    }

    public static void array_for() {

        //int[] v_array = {-1, 2, 3, -4, -5};
        String[] v_array = { "Січень", "Лютий", "Березень", "Квітень", "Травень", "Червень", "Липень", "Серпень", "Вересень", "Жовтень", "Листопад", "Грудень"};

        for (int i = 0; i < v_array.length; i++) {
            System.out.println(v_array[i]);
        }
    }

    // Заповнення масиву з 10 чисел числами від 1 до 10:
    public static void array_for2() {
        int[] v_array = new int[10];
        for (int i = 0; i < v_array.length; i++) {
            v_array[i] = i;
            System.out.println(v_array[i]);
        }
    }

    // двомірний масив
    public static void two_dim_array() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        for (int i = 0; i < matrix.length; i++) { // кількість рядків
            for (int j = 0; j < matrix[i].length; j++) { // кількість стовпчиків
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
