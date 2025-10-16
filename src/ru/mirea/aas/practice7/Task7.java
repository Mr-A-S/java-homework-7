package ru.mirea.aas.practice7;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        // Создаем объект Random с начальным значением (seed) 1000
        // Это значит, что последовательность чисел всегда будет одинаковой
        // при каждом запуске программы.
        Random randomGenerator = new Random(1000);

        System.out.println("--- Первые 50 случайных чисел (от 0 до 100) ---");

        // Генерируем и выводим 50 случайных чисел
        for (int i = 1; i <= 50; i++) {
            // nextInt(100) генерирует число от 0 (включительно) до 100 (исключительно)
            int randomNumber = randomGenerator.nextInt(100);

            // Выводим число. printf используется для красивого форматирования
            // "%4d" означает, что под число выделяется 4 символа для выравнивания
            System.out.printf("%4d", randomNumber);

            // После каждого 10-го числа делаем перенос строки для читаемости
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}