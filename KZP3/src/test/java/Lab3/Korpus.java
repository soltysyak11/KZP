package Lab3;

public class Korpus {
    private String material;

    public Korpus() {
        material = "Дерево";
    }

    public Korpus(String mat) {
        material = mat;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String mat) {
        material = mat;
    }
}
