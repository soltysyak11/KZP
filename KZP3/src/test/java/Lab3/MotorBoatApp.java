package Lab3;

import static java.lang.System.out;
import java.io.*;

public class MotorBoatApp {
    public static void main(String[] args) throws FileNotFoundException {
        Korpus korpus = new Korpus("Склопластик");
        Sidinnya sidinnya = new Sidinnya(6);
        Engine engine = new Engine(200);

        MotorBoat motorBoat = new MotorBoat(korpus, sidinnya, engine);

        motorBoat.start();
        motorBoat.accelerate();
        out.println("Поточна швидкість: " + motorBoat.getSpeed() + " км/год");
        motorBoat.setDirection("Схід");
        out.println("Напрямок руху: " + motorBoat.getDirection());
        motorBoat.turnRight();
        motorBoat.decelerate();
        out.println("Поточна швидкість: " + motorBoat.getSpeed() + " км/год");
        motorBoat.stop();

        out.println("Матеріал корпусу: " + motorBoat.getHullMaterial());
        out.println("Кількість сидінь: " + motorBoat.getNumberOfSeats());
        out.println("Потужність двигуна: " + motorBoat.getEnginePower() + " к.с.");

        motorBoat.dispose();
    }
}
