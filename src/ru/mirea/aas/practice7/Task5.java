package ru.mirea.aas.practice7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        // --- ArrayList ---
        List<Integer> arrayList = new ArrayList<>();
        System.out.println("--- Тестирование ArrayList ---");
        measurePerformance(arrayList, "ArrayList");

        System.out.println("\n===================================\n");

        // --- LinkedList ---
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("--- Тестирование LinkedList ---");
        measurePerformance(linkedList, "LinkedList");
    }

    private static void measurePerformance(List<Integer> list, String listType) {
        long startTime, endTime;
        int elementsCount = 150000; // Количество элементов для теста

        // 1. Вставка в конец (add)
        startTime = System.nanoTime();
        for (int i = 0; i < elementsCount; i++) {
            list.add(i);
        }
        endTime = System.nanoTime();
        System.out.printf("%-12s: Вставка в конец %d элементов заняла %,d нс%n", listType, elementsCount, (endTime - startTime));

        // 2. Вставка в начало (add at index 0) - очень медленная для ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) { // Используем меньше элементов, чтобы не ждать вечность
            list.add(0, -1);
        }
        endTime = System.nanoTime();
        System.out.printf("%-12s: Вставка в начало 1000 элементов заняла  %,d нс%n", listType, (endTime - startTime));

        // 3. Удаление из середины (remove from middle)
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.remove(list.size() / 2);
        }
        endTime = System.nanoTime();
        System.out.printf("%-12s: Удаление из середины 1000 элементов заняло %,d нс%n", listType, (endTime - startTime));

        // 4. Поиск (доступ по индексу - get)
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) { // Достаточно 10000 итераций для показательной разницы
            list.get(i);
        }
        endTime = System.nanoTime();
        System.out.printf("%-12s: Доступ по индексу 10000 элементов занял    %,d нс%n", listType, (endTime - startTime));
    }
}