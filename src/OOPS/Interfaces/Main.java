package OOPS.Interfaces;

import OOPS.Interfaces.SeparateClasses.ElectricEngine;
import OOPS.Interfaces.SeparateClasses.FinalCar;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//        car.start();
//        car.stop();
//        car.brake();

//        Media media = new Car();
//        media.stop();

        FinalCar car = new FinalCar();
        car.start();
        car.startMusic();
        car.stop();
        car.upgradeEngine(new ElectricEngine());

        System.out.println();

        car.start();
        car.stop();

        // Note: Static methods in an interface need to have a body.
        // The static methods should be called via the interface name.
    }
}
