package Lab3;

public class Engine {
    private final int power;
    private boolean isRunning;

    public Engine() {
        power = 100;
        isRunning = false;
    }

    public Engine(int power) {
        this.power = power;
        isRunning = false;
    }

    public void startEngine() {
        isRunning = true;
    }

    public void stopEngine() {
        isRunning = false;
    }

    public int getPower() {
        return power;
    }
}
