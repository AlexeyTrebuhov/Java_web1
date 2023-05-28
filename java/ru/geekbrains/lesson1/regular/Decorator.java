package ru.geekbrains.lesson1.regular;

/**
 * Декоратор дополняет итоговый результат своими украшениями.
 */


public class Decorator {

    public static  String decorate (int a) {
        /**
         * Метод декорирует число, добавляя к нему строку
         * при помощи функции декорирования строк
         */
        return String.format("what's your name what's your game what's your number: %d", a);
    }
}
