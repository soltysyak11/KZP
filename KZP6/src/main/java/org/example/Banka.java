package org.example;/* Bank.java */

/**
 * Клас Bank представляє предметну область "банка"
 */
public class Banka implements Comparable<Banka> {
    private String name;
    private double capacity;

    /**
     * Конструктор для створення нової банки
     * @param name назва банки
     * @param capacity ємність банки
     */
    public Banka(String name, double capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    /**
     * Повертає назву банки
     * @return назва банки
     */
    public String getName() {
        return name;
    }

    /**
     * Повертає ємність банки
     * @return ємність банки
     */
    public double getCapacity() {
        return capacity;
    }

    @Override
    public int compareTo(Banka other) {
        return Double.compare(this.capacity, other.capacity);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

}