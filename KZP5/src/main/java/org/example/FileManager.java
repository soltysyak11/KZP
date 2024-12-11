package org.example;

import java.io.*;

public class FileManager {

    public void writeToFile(String filename, double value) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(filename, "rw")) {
            raf.seek(raf.length());  // Переміщаємо вказівник у кінець файлу
            raf.writeDouble(value);  // Записуємо double значення
        } catch (IOException e) {
            System.err.println("Помилка при запису у файл: " + e.getMessage());
            throw e;
        }
    }

    public double readFromFile(String filename, long position) throws IOException {
        double value;
        try (RandomAccessFile raf = new RandomAccessFile(filename, "r")) {
            raf.seek(position);  // Переміщуємо вказівник на зазначену позицію
            value = raf.readDouble();  // Читаємо double значення
        } catch (IOException e) {
            System.err.println("Помилка при читанні з файлу: " + e.getMessage());
            throw e;  // Проброс виключення далі
        }
        return value;  // Повертаємо прочитане значення
    }
}
