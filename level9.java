package com.company;

import java.util.concurrent.TimeUnit;

public class level9 {
    public static void main(String[] args) throws InterruptedException {  // Обробляжмо помилки
        //Countdown();
        mat_exam();
    }

    public static void Countdown() throws InterruptedException { // Обробляжмо помилки
        for (int i = 5; i > 0; i--)
        {
            System.out.println(i);
            //Thread.sleep(1000); // 1000 мілісекунд=1 секунді
            TimeUnit.SECONDS.sleep(1); // теж саме через клас TimeUnit, де є MINUTES, HOURS, DAYS...
        }
        System.out.println("По-їхалииии!");
    }

    public static void mat_exam() {
        int x = 9;
        // System.out.println(Math.sqrt(x)); // квадратний корінь
        System.out.println( (int) (Math.random() * 6 + 1) ); // рандомні числа від 1 до 6 (int - це так округлили)
    }
}
