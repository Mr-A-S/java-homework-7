package ru.mirea.aas.practice7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Введите число: ");
        int day = scanner.nextInt();

        System.out.print("Введите часы (0-23): ");
        int hours = scanner.nextInt();

        System.out.print("Введите минуты (0-59): ");
        int minutes = scanner.nextInt();

        // 1. Формирование объекта Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes); // month-1, так как месяцы с 0

        // 2. Формирование объекта Date из Calendar
        Date date = calendar.getTime();

        // 3. Вывод результатов для проверки
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy 'года в' HH:mm");
        System.out.println("\nСформированный объект Date: " + formatter.format(date));
    }
}