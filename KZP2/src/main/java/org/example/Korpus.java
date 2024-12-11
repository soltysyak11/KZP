package org.example;

/**
 * Клас <code>Korpus</code> представляє корпус шлюпки.
 */
class Korpus {
    private String material;

    /**
     * Конструктор за замовчуванням.
     */
    public Korpus()
    {
        material = "Дерево";
    }

    /**
     * Конструктор з параметром.
     * @param mat матеріал корпусу
     */
    public Korpus(String mat)
    {
        material = mat;
    }

    /**
     * Метод повертає матеріал корпусу.
     * @return матеріал корпусу
     */
    public String getMaterial()
    {
        return material;
    }

    /**
     * Метод встановлює матеріал корпусу.
     * @param mat матеріал корпусу
     */
    public void setMaterial(String mat)
    {
        material = mat;
    }
}