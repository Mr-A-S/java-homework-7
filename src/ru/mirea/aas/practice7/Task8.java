package ru.mirea.aas.practice7;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task8 {
    public static void main(String[] args) {
        // --- Задача 1: Отобразить текущую дату ---
        System.out.println("--- 1. Текущая дата ---");
        // Создаем объект GregorianCalendar для текущего момента
        Calendar calendar = new GregorianCalendar();

        int year = calendar.get(Calendar.YEAR);
        // ВАЖНО: месяцы в Calendar нумеруются с 0 (Январь=0, Февраль=1...).
        // Для понятного вывода добавляем 1.
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.printf("Год: %d, Месяц: %d, День: %d%n", year, month, day);
        System.out.println(); // Пустая строка для разделения

        // --- Задача 2: Отобразить дату для заданного времени ---
        System.out.println("--- 2. Дата для 1234567898765 мс ---");
        // Создаем новый объект. Можно было бы и переиспользовать старый.
        Calendar specificCalendar = new GregorianCalendar();

        // Устанавливаем время в миллисекундах
        specificCalendar.setTimeInMillis(1234567898765L);

        int specificYear = specificCalendar.get(Calendar.YEAR);
        int specificMonth = specificCalendar.get(Calendar.MONTH) + 1;
        int specificDay = specificCalendar.get(Calendar.DAY_OF_MONTH);

        System.out.printf("Год: %d, Месяц: %d, День: %d%n", specificYear, specificMonth, specificDay);
    }
}