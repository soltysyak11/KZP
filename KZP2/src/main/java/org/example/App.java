/****************************************************************************
 * Copyright (c) 2013-2023 Lviv Polytechnic National University. All
 * Rights Reserved.
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

import static java.lang.System.out;
import java.io.*;

/**
 * Клас `App` реалізує метод `main` для демонстрації можливостей класу `Shlyubka`.
 */
public class App
{
    /**
     * @param args аргументи командного рядка
     * @throws FileNotFoundException якщо файл не знайдено
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        // Створення екземплярів компонентів
        Vesla vesla = new Vesla(4);
        Korpus korpus = new Korpus("Алюміній");
        Sidinnya sidinnya = new Sidinnya(4);

        // Створення об'єкта шлюпки
        Shlyubka shlyubka = new Shlyubka(vesla, korpus, sidinnya);

        // Демонстрація методів
        shlyubka.row();
        shlyubka.accelerate();
        out.println("Поточна швидкість: " + shlyubka.getSpeed() + " км/год");
        shlyubka.turnLeft();
        shlyubka.decelerate();
        out.println("Поточна швидкість: " + shlyubka.getSpeed() + " км/год");
        shlyubka.stopRowing();
        shlyubka.anchor();
        shlyubka.liftAnchor();

        // Отримання властивостей шлюпки
        out.println("Кількість весел: " + shlyubka.getNumberOfOars());
        out.println("Матеріал корпусу: " + shlyubka.getHullMaterial());
        out.println("Кількість сидінь: " + shlyubka.getNumberOfSeats());

        // Закриття ресурсів
        shlyubka.dispose();
    }
}
