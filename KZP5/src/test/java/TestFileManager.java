import org.example.ExpressionEvaluator;
import org.example.FileManager;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class TestFileManager {
    public static void main(String[] args) {
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        FileManager fileManager = new FileManager();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter value for x: ");
            double x = scanner.nextDouble();

            double result = evaluator.evaluate(x);

            fileManager.writeToFile("result.dat", result);  // Запис у файл (бінарний з вільним доступом)

            // Читаємо результат(перше значення)
            double readResult = fileManager.readFromFile("result.dat", 0);

            System.out.println("Result read from file: " + readResult);

        } catch (ArithmeticException e) {
            System.err.println("Math error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter a numeric value.");
        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
