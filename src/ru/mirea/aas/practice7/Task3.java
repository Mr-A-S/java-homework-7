package ru.mirea.aas.practice7;

import java.util.Date;
import java.util.GregorianCalendar;

public class Task3 {
    public static void main(String[] args) {
        // Создаем дату рождения (25 мая 2004)
        // ВАЖНО: месяцы в Calendar считаются с 0, поэтому май - это 4-й месяц
        Date birthDate = new GregorianCalendar(2004, 4, 25).getTime();
        Student student = new Student("Алексей Соловьев", birthDate);

        System.out.println("--- Стандартный вывод toString() ---");
        System.out.println(student);
        System.out.println(); // Пустая строка для разделения

        System.out.println("--- Вывод даты в разных форматах ---");
        System.out.println("Короткий формат: " + student.getFormattedBirthDate(1));
        System.out.println("Средний формат:  " + student.getFormattedBirthDate(2));
        System.out.println("Полный формат:   " + student.getFormattedBirthDate(3));
    }
}