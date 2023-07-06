package OOPS.Interfaces.SeparateClasses;

import OOPS.Interfaces.Engine;

public class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Starting the Electric engine");
    }

    public void stop() {
        System.out.println("Stopping the Electric engine");
    }

    public void accelerate() {
        System.out.println("Accelerating the Electric engine");
    }
}
