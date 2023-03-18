package com.company;

import java.util.StringTokenizer;

public class level10 {

    public static void main(String[] args) {
        //exam();
        //exam_str();

        /*String path = "/usr/java/jdk1.8/bin";
        String jdk13 = "jdk-13";
        String new_path = changePath(path, jdk13);
        System.out.println(new_path);*/

        //System.out.println(format("Костя", 4000));

        //System.out.println(equal_by_intern("Костя", "Костя"));

        //text_manipulation();
        //StringTokenizer();

        level11 human = new level11("Костя", 32, 12000); // створили людину
        //level11.setName("Петя");
        System.out.println(level11.getName() + " " + level11.getAge() + " " + level11.getSalary());
    }

    public static void exam() {
        //double a = 1.23E2; // 1.23 * 10^2
        //System.out.println(a);

        String text = "Завжди пишіть код так, "
                + "ніби його буде супроводжувати "
                + "схильний до насильства психопат, "
                + "який знає вашу адресу. "
                + "Martin Golding";
        //System.out.println(text);

        String s = "Фільм \"Друзі\" номіновано на \"Оскар\"";
        //System.out.println(s); //  Екранування символів

        // System.out.println("З повагою\nАнонім"); //     \n Символ переведення рядка

        //System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"");
        //System.out.println("It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk-13.0.0\\\\bin\\\"");

        System.out.println("\uD83D\uDD0A"); // смайлік дінаміка в Unicode
    }

    public static void exam_str() {
        String v_str = "Java Developer";
        char c_ch = v_str.charAt(0);
        //System.out.println((c_ch));

        int v_pos = v_str.indexOf("Developer");
        //System.out.println(v_pos);

        String path = "Wava";
        String result = path.replace('W', 'J');
        //System.out.println(result);

        String text = "Костя, привіт";
        System.out.println(text.substring(0, 5));
    }

    // Оновлення шляху
    public static String changePath(String path, String jdk) {
        int firstIndex = path.indexOf("jdk");
        int lastIndex = path.indexOf("/", firstIndex);
        String oldJdk = path.substring(firstIndex, lastIndex);
        return path.replace(oldJdk, jdk);
    }

    public static String format(String name, int salary) {
        String phrase = "Мене звати %s. Я зароблятиму $%d на місяць.";
        return String.format(phrase, name, salary);
        //return "Мене звати "+name+". Я зароблятиму $"+salary+" на місяць."; // аналог перших 2-х рядків
    }

    public static boolean equal_by_intern(String first, String second) {
        String a = new String(first);
        String b = new String(second);
        //return a == b; // false
        return a.equals(b); // true
        //return a.intern() == b.intern(); // true

        // Метод intern() додасть до StringPool два ідентичних рядки і метод поверне однакові посилання.
        // Метод intern(), можно використовувати, якщо мета є економія пам'яті (ОЗУ)
    }

    public static void text_manipulation() {
        /*String v_text = "Mac Book Pro";
        v_text = v_text.substring(0,8);
        System.out.println(v_text);*/

        StringBuilder v_text = new StringBuilder("Улыбок тебе дед Макар");
        v_text.reverse();
        String v_text_str = v_text.toString().toLowerCase();
        System.out.println(v_text_str);
    }

    // використовується для розбиття рядків на підрядки за допомогою розділювачів, наприклад кома
    public static void StringTokenizer() {
        String str = "apple,banana,cherry";
        StringTokenizer st = new StringTokenizer(str, ",");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
