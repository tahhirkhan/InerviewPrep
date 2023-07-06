package OOPS.Interfaces.SeparateClasses;

import OOPS.Interfaces.Engine;

public class PowerEngine implements Engine {
    public void start() {
        System.out.println("Starting the Power engine");
    }

    public void stop() {
        System.out.println("Stopping the Power engine");
    }

    public void accelerate() {
        System.out.println("Accelerating the Power engine");
    }
}
