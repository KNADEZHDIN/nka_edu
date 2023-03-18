package com.company;

//Конструктори використовуються для ініціалізації об'єктів та встановлення початкових значень їхніх властивостей

/*
Конструктор - це спеціальний метод класу, який викликається автоматично при створенні нового об'єкту даного класу.
Конструктор використовується для ініціалізації полів класу та для виконання будь-яких необхідних дій під час
створення об'єкту. Конструктор має той самий ім'я, що і клас, до якого він належить, і не має типу повернення.
 */

// Конструктор та клас повинен називатися однаково

//level11 типу human
public class level11 {
    private static String name;
    private static int age;
    private static int salary;

    // це конструктор для створення людини
    public level11(String p_name, int p_age, int p_salary) {
        name = p_name;
        age = p_age;
        salary = p_salary;
    }

    // це конструктор для створення людини з ЗП по заумовченням=1000
    public level11(String p_name, int p_age) {
        level11 human = new level11(p_name, p_age, 1000);
    }

    public static void main(String[] args) {
        level11 human = new level11("Петя", 31); // створили людину
        System.out.println(human.name + " " + human.age + " " + human.salary);
    }

    //Гетер для поля name
    public static String getName() {
        return name;
    }

    //Гетер для поля age
    public static int getAge() {
        return age;
    }

    //Гетер для поля age
    public static int getSalary() {
        return salary;
    }

    //Сетер для name
    public static void setName(String p_name) {
        name = p_name;
    }

    //Сетер для Age
    public static void setAge(int p_age) {
        age = p_age;
    }

    //Сетер для Salary
    public static void setSalary(int p_salary) {
        salary = p_salary;
    }
}
