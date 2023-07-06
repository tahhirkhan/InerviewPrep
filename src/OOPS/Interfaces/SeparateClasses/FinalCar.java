package OOPS.Interfaces.SeparateClasses;

import OOPS.Interfaces.Engine;
import OOPS.Interfaces.Media;

public class FinalCar {
    private Engine engine;
    private Media player = new CDPlayer();

    // default engine type:
    public FinalCar() {
        this.engine = new PowerEngine();
    }

    // custom engine type using parameterized constructor:
    public FinalCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine(Engine engine) {
        this.engine = engine;
    }
}
