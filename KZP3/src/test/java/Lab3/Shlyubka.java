package Lab3;

import java.io.*;

public abstract class Shlyubka extends Object {
    protected Korpus korpus;
    protected Sidinnya sidinnya;
    protected PrintWriter fout;
    protected double speed;

    public Shlyubka() throws FileNotFoundException {
        korpus = new Korpus();
        sidinnya = new Sidinnya();
        speed = 0.0;
        fout = new PrintWriter(new File("Log.txt"));
    }

    public abstract void start();
    public abstract void stop();

    public void turnLeft() {
        fout.print("Поворот ліворуч\n");
        fout.flush();
    }

    public void turnRight() {
        fout.print("Поворот праворуч\n");
        fout.flush();
    }

    public void accelerate() {
        fout.print("Прискорилися\n");
        fout.flush();
        speed += 5.0;
    }

    public void decelerate() {
        fout.print("Уповільнилися\n");
        fout.flush();
        speed -= 5.0;
        if (speed < 0) speed = 0;
    }

    public double getSpeed() {
        fout.print("Отримали поточну швидкість\n");
        fout.flush();
        return speed;
    }

    public String getHullMaterial() {
        return korpus.getMaterial();
    }

    public int getNumberOfSeats() {
        return sidinnya.getNumberOfSeats();
    }

    public void dispose() {
        fout.close();
    }
}
