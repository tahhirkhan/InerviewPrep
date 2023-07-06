package OOPS.Interfaces.SeparateClasses;

import OOPS.Interfaces.Media;

public class CDPlayer implements Media {
    public void start() {
        System.out.println("Start the music");
    }

    public void stop() {
        System.out.println("Stop the music");
    }

}
