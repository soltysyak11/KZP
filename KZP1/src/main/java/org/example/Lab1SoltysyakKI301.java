package org.example;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lab1SoltysyakKI301 {

    private static final String FILE_NAME = "MyFile.txt";

    public static void main(String[] args) {
        int size = inputSize();
        char filler = inputFiller();

        char[][] matrix = generateMatrix(size, filler);

        showMatrix(matrix, size);
        saveMatrixToFile(matrix, size);
    }

    public static int inputSize() {
        Scanner scanner = new Scanner(System.in);
        int size;

        while (true) {
            try {
                System.out.print("Enter size of square matrix: ");
                size = scanner.nextInt();
                 if (size > 1) break;
                 else System.out.println("Size must be greater than 1.");
            } catch (Exception e) {
                System.out.println(e.getMessage() + ". Please enter a number.");
                scanner.next();
            }
        }
        return size;
    }

    public static char inputFiller() {
        Scanner scanner = new Scanner(System.in);
        char filler;

        while (true) {
            System.out.print("Enter character to fill matrix: ");
            String str = scanner.nextLine().trim();

            if (!str.isEmpty()) {
                filler = str.charAt(0);
                break;
            } else {
                System.out.println("Please enter a non-empty character.");
            }
        }

        return filler;
    }

    public static char[][] generateMatrix(int size, char filler) {
        char[][] matrix = new char[size][];

        for (int i = 0; i < size; i++) {
            // Визначаємо кількість заповнених символів у рядку
            int filledCount = 0;
            for (int j = 0; j < size; j++) {
                if ((i >= j && i + j < size) || (i <= j && i + j >= size - 1)) {
                    filledCount++;
                }
            }

            // Ініціалізуємо рядок зубчастого масиву з потрібною довжиною
            matrix[i] = new char[filledCount];

            int index = 0;
            for (int j = 0; j <= size; j++) {
                if ((i >= j && i + j < size) || (i <= j && i + j >= size - 1)) {
                    matrix[i][index++] = filler;
                }
            }
        }
        return matrix;
    }



    public static void showMatrix(char[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            int index = 0;
            for (int j = 0; j < size; j++) {
                if ((i >= j && i + j < size) || (i <= j && i + j >= size - 1)) {
                    System.out.print(matrix[i][index++] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void saveMatrixToFile(char[][] matrix, int size) {
        try (PrintWriter writer = new PrintWriter(FILE_NAME)) {
            for (int i = 0; i < size; i++) {
                int index = 0;
                for (int j = 0; j < size; j++) {
                    if ((i >= j && i + j < size) || (i <= j && i + j >= size - 1)) {
                        writer.print(matrix[i][index++] + " ");
                    } else {
                        writer.print("  ");
                    }
                }
                writer.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
