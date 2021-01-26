package com.narine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(" ----- "); //для красоты

        String myNewInterest; //Объявить переменную типа данных String, название которой состоит из нескольких слов

        final int NUM = 2021; //Создать константу “NUM” типа данных int и задать ей любое значение

        String word = "Geektech"; //Создать переменную “word” типа данных String с любым значением

        myNewInterest = NUM + " " + word;



        /*Задать значение переменной объявленной в самом начале, которое состояло бы
        из результата конкатенации константы “NUM” и переменной “word”*/

        System.out.println(myNewInterest + " " + word); //Вывести на экран значение всех переменных в одну строку//

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }

        /*Добавить только 1 условную конструкцию которая бы выводила на экран следующее: если значение константы
        “NUM” меньше нуля - “Вы сохранили отрицательное число”, если же значение больше нуля -
        “Вы сохранили положительное число”, иначе - “Вы сохранили нуль”*/

        System.out.println(" ----- "); //для красоты

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.println("Привет, " + name);
    }

    
}
