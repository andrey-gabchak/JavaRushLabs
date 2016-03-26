package com.javarush.test.level05.lesson12.home01;

/* Три класса
По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака).
Подумай, что должен возвращать метод toString в классах Cat и Dog?
В методе main создай по два объекта каждого класса и выведи их на экран.
Объекты класса Duck уже созданы и выводятся на экран.
*/

public class Solution
{

    public static void main(String[] args)
    {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Cat catMursik = new Cat();
        Cat catBursik = new Cat();
        System.out.println(catMursik);
        System.out.println(catBursik);

        Dog dogBars = new Dog();
        Dog dogRex = new Dog();
        System.out.println(dogBars);
        System.out.println(dogRex);
    }

    public static class Duck
    {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat {

        public String toString() {
            return "Cat";
        }
    }

    public static class Dog {

        public String toString() {
            return "Dog";
        }
    }
}
