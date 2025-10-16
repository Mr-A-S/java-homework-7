package ru.mirea.aas.practice7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Устанавливаем формат, в котором пользователь будет вводить дату
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Введите дату в формате (дд.мм.гггг):");
        String userInput = scanner.nextLine();

        try {
            // Пытаемся преобразовать строку пользователя в объект Date
            Date userDate = formatter.parse(userInput);
            // Получаем текущую дату
            Date currentDate = new Date();

            // Сравниваем даты с помощью метода compareTo()
            // compareTo возвращает:
            // < 0 если userDate раньше currentDate
            // > 0 если userDate позже currentDate
            // = 0 если даты равны
            int comparison = userDate.compareTo(currentDate);

            if (comparison < 0) {
                System.out.println("Введенная дата раньше текущей.");
            } else if (comparison > 0) {
                System.out.println("Введенная дата позже текущей.");
            } else {
                System.out.println("Введенная дата совпадает с текущей.");
            }

        } catch (ParseException e) {
            System.err.println("Ошибка! Неверный формат даты. Пожалуйста, используйте формат дд.мм.гггг");
        }
    }
}