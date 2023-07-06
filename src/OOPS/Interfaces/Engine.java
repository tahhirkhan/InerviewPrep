package OOPS.Interfaces;

public interface Engine {
    int price = 1000;

    /**
     * The variables are static and final by default in an Interface.
     */
    void start();
    void stop();
    void accelerate();
}
