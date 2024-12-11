package org.example;

/**
 * Клас <code>Sidinnya</code> представляє сидіння в шлюпці.
 */
class Sidinnya {
    private int numberOfSeats;

    /**
     * Конструктор за замовчуванням.
     */
    public Sidinnya()
    {
        numberOfSeats = 2;
    }

    /**
     * Конструктор з параметром.
     * @param num кількість сидінь
     */
    public Sidinnya(int num)
    {
        numberOfSeats = num;
    }

    /**
     * Метод повертає кількість сидінь.
     * @return кількість сидінь
     */
    public int getNumberOfSeats()
    {
        return numberOfSeats;
    }

    /**
     * Метод встановлює кількість сидінь.
     * @param num кількість сидінь
     */
    public void setNumberOfSeats(int num)
    {
        numberOfSeats = num;
    }
}