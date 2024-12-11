package Lab4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Клас для обчислення виразу y = 1 / cos(4x) та запису результатів в файл.
 */
public class ExpressionCalculator {

    /**
     * Обчислює значення виразу y = 1 / cos(4x).
     * @param x вхідне значення x.
     * @return обчислене значення y.
     * @throws ArithmeticException якщо cos(4x) дорівнює нулю.
     */
    public double calculateExpression(double x) throws ArithmeticException {
        double denominator = Math.cos(4 * x);
        if (denominator == 0) {
            throw new ArithmeticException("Cosine of 4x is zero, division by zero.");
        }
        return 1 / denominator;
    }

    /**
     * Записує обчислене значення y у файл.
     * @param y значення для запису.
     * @param filename назва файлу для запису.
     */
    public void writeToFile(double y, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(String.valueOf(y));
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExpressionCalculator calculator = new ExpressionCalculator();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter value for x: ");
            double x = scanner.nextDouble();
            double result = calculator.calculateExpression(x);
            calculator.writeToFile(result, "result.txt");
            System.out.println("Result has been written to file.");
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace(); // Виводимо стек викликів
        } catch (Exception e) {
            System.err.println("Invalid input: " + e.getMessage());
            e.printStackTrace(); // Виводимо стек викликів для інших виключень
        }
    }
}
