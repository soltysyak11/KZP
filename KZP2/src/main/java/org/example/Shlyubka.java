/****************************************************************************
 * Copyright (c) 2013-2023 Lviv Polytechnic National University.
 * All Rights Reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Academic Free License v. 3.0 which accompanies this
 * distribution, and is available at https://opensource.org/license/afl-3-0-php/
 *
 * SPDX-License-Identifier: AFL-3.0
 ****************************************************************************/

/**
 * lab 2 package
 */
package org.example;

import java.io.*;

/**
 * Клас <code>Shlyubka</code> реалізує модель шлюпки на веслах.
 */
public class Shlyubka {
    private Vesla vesla;
    private Korpus korpus;
    private Sidinnya sidinnya;
    private PrintWriter fout;
    private double speed;

    /**
     * Конструктор за замовчуванням.
     * @throws FileNotFoundException якщо файл не знайдено
     */
    public Shlyubka() throws FileNotFoundException
    {
        vesla = new Vesla();
        korpus = new Korpus();
        sidinnya = new Sidinnya();
        speed = 0.0;
        fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Конструктор з параметрами.
     * @param v об'єкт класу Vesla
     * @param k об'єкт класу Korpus
     * @param s об'єкт класу Sidinnya
     * @throws FileNotFoundException якщо файл не знайдено
     */
    public Shlyubka(Vesla v, Korpus k, Sidinnya s) throws FileNotFoundException
    {
        vesla = v;
        korpus = k;
        sidinnya = s;
        speed = 0.0;
        fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Метод імітує початок веслування.
     */
    public void row()
    {
        fout.print("Почали веслувати\n");
        fout.flush();
        speed = 5.0;
    }

    /**
     * Метод імітує зупинку веслування.
     */
    public void stopRowing()
    {
        fout.print("Зупинили веслування\n");
        fout.flush();
        speed = 0.0;
    }

    /**
     * Метод імітує поворот ліворуч.
     */
    public void turnLeft()
    {
        fout.print("Поворот ліворуч\n");
        fout.flush();
    }

    /**
     * Метод імітує поворот праворуч.
     */
    public void turnRight()
    {
        fout.print("Поворот праворуч\n");
        fout.flush();
    }

    /**
     * Метод імітує прискорення.
     */
    public void accelerate()
    {
        fout.print("Прискорилися\n");
        fout.flush();
        speed += 2.0;
    }

    /**
     * Метод імітує уповільнення.
     */
    public void decelerate()
    {
        fout.print("Уповільнилися\n");
        fout.flush();
        speed -= 2.0;
        if (speed < 0) speed = 0;
    }

    /**
     * Метод імітує опускання якоря.
     */
    public void anchor()
    {
        fout.print("Опустили якір\n");
        fout.flush();
        speed = 0.0;
    }

    /**
     * Метод імітує підняття якоря.
     */
    public void liftAnchor()
    {
        fout.print("Підняли якір\n");
        fout.flush();
    }

    /**
     * Метод повертає поточну швидкість шлюпки.
     * @return поточна швидкість
     */
    public double getSpeed()
    {
        fout.print("Отримали поточну швидкість\n");
        fout.flush();
        return speed;
    }

    /**
     * Метод повертає кількість весел.
     * @return кількість весел
     */
    public int getNumberOfOars()
    {
        return vesla.getNumberOfOars();
    }

    /**
     * Метод повертає матеріал корпусу.
     * @return матеріал корпусу
     */
    public String getHullMaterial()
    {
        return korpus.getMaterial();
    }

    /**
     * Метод повертає кількість сидінь.
     * @return кількість сидінь
     */
    public int getNumberOfSeats()
    {
        return sidinnya.getNumberOfSeats();
    }

    /**
     * Метод звільняє використані ресурси.
     */
    public void dispose()
    {
        fout.close();
    }
}