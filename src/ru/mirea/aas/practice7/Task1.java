package ru.mirea.aas.practice7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        // 1. Укажите вашу фамилию
        String developerLastName = "Соловьев";

        // 2. Дата и время получения задания
        // Для примера, установим ее на 16 октября 2025 года, 12:00
        // (Вы можете изменить это значение, если нужно)
        Date assignmentReceivedDate = new Date(1760540400000L);

        // 3. Дата и время сдачи задания (текущее время)
        Date assignmentSubmittedDate = new Date(); // Это то же самое, что и new Date(System.currentTimeMillis())

        // Форматируем дату для красивого вывода
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy 'в' HH:mm:ss");

        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + formatter.format(assignmentReceivedDate));
        System.out.println("Дата и время сдачи задания: " + formatter.format(assignmentSubmittedDate));
    }
}