package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String number1 = reader.readLine();
        int nnumber1 = Integer.parseInt(number1);
        String number2 = reader.readLine();
        int nnumber2 = Integer.parseInt(number2);

        System.out.println(name + " получает " + nnumber1 + " через " + nnumber2 + " лет.");
        //напишите тут ваш код

    }
}