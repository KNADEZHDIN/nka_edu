package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Level13 {

    static ArrayList<String> person = new ArrayList<String>();

    public static void main(String[] args) {

        person.add("Костя");
        person.add("Катя");
        person.add("Денис");
        person.add("Андрій");
        print_person(person);

    }

    public static void print_person(ArrayList<String> p_list) {

        for (int i = 0; i < p_list.size(); i++)
        {
            if ( p_list.get(i) == "Костя" || p_list.get(i) == "Катя" )  {
                 System.out.println("Привіт " + p_list.get(i) + ", можете проходити");
            } else {
                 System.out.println("До побачення " + p_list.get(i) + ", Вас нема в списку");
            }

        }
    }
}
