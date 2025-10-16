package ru.mirea.aas.practice7;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Переопределяем toString() для вывода основной информации
    @Override
    public String toString() {
        // Используем средний формат даты для вывода по умолчанию
        return "Студент: " + name + ", дата рождения: " + getFormattedBirthDate(2);
    }

    /**
     * Возвращает строковое представление даты рождения.
     * @param format 1 - короткий, 2 - средний, 3 - полный формат
     * @return отформатированная строка с датой
     */
    public String getFormattedBirthDate(int format) {
        // Указываем русскую локаль для вывода дня недели и месяца на русском
        Locale locale = new Locale("ru", "RU");
        DateFormat formatter;

        switch (format) {
            case 1: // Короткий формат (например, 25.05.04)
                formatter = DateFormat.getDateInstance(DateFormat.SHORT, locale);
                break;
            case 2: // Средний формат (например, 25 мая 2004 г.)
                formatter = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
                break;
            case 3: // Полный формат (например, 25 мая 2004 г., вторник)
                formatter = DateFormat.getDateInstance(DateFormat.LONG, locale);
                break;
            default:
                return "Неверный формат";
        }
        return formatter.format(this.birthDate);
    }
}