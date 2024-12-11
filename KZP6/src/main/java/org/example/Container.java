package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Клас Container реалізує параметризований контейнер для предметної області "банка".
 * @param <T> тип об'єктів, які будуть зберігатися в контейнері
 */
public class Container<T extends Comparable<T>> {
    private List<T> elements;

    /**
     * Конструктор для створення нового контейнера
     */
    public Container() {
        elements = new ArrayList<>();
    }

    /**
     * Додає новий елемент у контейнер
     * @param element елемент, який необхідно додати
     */
    public void addElement(T element) {
        elements.add(element);
    }

    /**
     * Повертає кількість елементів у контейнері
     * @return кількість елементів
     */
    public int getSize() {
        return elements.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Container<Banka> bankContainer = new Container<>();

        Container<Integer> intContainer = new Container<>();


        System.out.println("Введіть кількість банок, які хочете додати: ");
        int bankCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < bankCount; i++) {
            System.out.println("Введіть назву банки: ");
            String name = scanner.nextLine();
            System.out.println("Введіть ємність банки: ");
            double capacity = scanner.nextDouble();
            scanner.nextLine(); // споживаємо залишок нового рядка
            bankContainer.addElement(new Banka(name, capacity));
        }


        System.out.println("Введіть кількість чисел, які хочете додати: ");
        int intCount = scanner.nextInt();

        for (int i = 0; i < intCount; i++) {
            System.out.println("Введіть число: ");
            int number = scanner.nextInt();
            intContainer.addElement(number);
        }


        boolean result = bankContainer.getSize() > intContainer.getSize();
        System.out.println("Результат порівняння (банок більше, ніж чисел): " + result);

        scanner.close();
    }
}