package Lab3;

import java.io.*;

public class MotorBoat extends Shlyubka implements Navigable {
    private final Engine engine;
    private String direction;

    public MotorBoat() throws FileNotFoundException {
        super();
        engine = new Engine();
        direction = "Прямо";
    }

    public MotorBoat(Korpus k, Sidinnya s, Engine e) throws FileNotFoundException {
        super();
        korpus = k;
        sidinnya = s;
        engine = e;
        direction = "Прямо";
    }

    @Override
    public void start() {
        fout.print("Запустили двигун\n");
        fout.flush();
        engine.startEngine();
        speed = 10.0;
    }

    @Override
    public void stop() {
        fout.print("Зупинили двигун\n");
        fout.flush();
        engine.stopEngine();
        speed = 0.0;
    }

    @Override
    public void setDirection(String direction) {
        this.direction = direction;
        fout.print("Напрямок встановлено: " + direction + "\n");
        fout.flush();
    }

    @Override
    public String getDirection() {
        fout.print("Отримали напрямок руху\n");
        fout.flush();
        return direction;
    }

    public int getEnginePower() {
        return engine.getPower();
    }
}
