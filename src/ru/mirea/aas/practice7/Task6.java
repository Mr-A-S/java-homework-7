package ru.mirea.aas.practice7;

import java.util.Date;

public class Task6 {
    public static void main(String[] args) {
        // Массив значений времени в миллисекундах, прошедших с 1 января 1970 года
        long[] timestamps = {
                10000L,
                100000L,
                1000000L,
                10000000L,
                100000000L,
                1000000000L,
                10000000000L,
                100000000000L
        };

        System.out.println("--- Отображение дат для разных временных меток ---");

        // Создаем один объект Date, который будем переиспользовать
        Date date = new Date();

        // Проходим по всем временным меткам в массиве
        for (long ts : timestamps) {
            // Устанавливаем новое время для объекта Date
            date.setTime(ts);
            // Выводим результат с помощью метода toString()
            System.out.println("Время для " + ts + " мс: " + date);
        }
    }
}