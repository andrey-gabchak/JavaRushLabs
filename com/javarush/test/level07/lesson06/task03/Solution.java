package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(i, scanner.next());
        }

        String minLengthString = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (minLengthString.length() > list.get(i).length())
                minLengthString = list.get(i);
        }

        ArrayList<String> sortedList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (minLengthString.length() >= list.get(i).length())
                sortedList.add(list.get(i));
        }

        for (String s : sortedList) {
            System.out.println(s);
        }
    }
}
