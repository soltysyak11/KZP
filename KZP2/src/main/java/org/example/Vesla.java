package org.example;

/**
 * Клас <code>Vesla</code> представляє весла.
 */
class Vesla {
    private int numberOfOars;

    /**
     * Конструктор за замовчуванням.
     */
    public Vesla()
    {
        numberOfOars = 2;
    }

    /**
     * Конструктор з параметром.
     * @param num кількість весел
     */
    public Vesla(int num)
    {
        numberOfOars = num;
    }

    /**
     * Метод повертає кількість весел.
     * @return кількість весел
     */
    public int getNumberOfOars()
    {
        return numberOfOars;
    }

    /**
     * Метод встановлює кількість весел.
     * @param num кількість весел
     */
    public void setNumberOfOars(int num)
    {
        numberOfOars = num;
    }
}