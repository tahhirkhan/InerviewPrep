package OOPS.Interfaces;

public class Car implements Engine, Brake, Media {
    public void start() {
        System.out.println("I start engine like a normal car");
    }
    public void stop() {
        System.out.println("I stop engine like a normal car");
    }

    /**
     * Now in case of using the start() function, there actually exist
     * two start() functions in the Engine and Media interfaces, now it
     * won't get confused about which one to call, which was the actual
     * problem behind not supporting the Multiple Inheritance. Now the
     * Java supports multiple inheritance in the form of Interfaces
     * i,e.,a class can implement multiple Interfaces at once.
     * _NOTE_: The interfaces can not be instantiated i.e., we can
     * not have the objects of the interface, they can only be implemented like
     * the abstract classed can only be extended, BUT we can have the reference
     * of type interface like in the abstract classes case where we can have
     * the reference of type abstract class.
     */
    public void brake() {
        System.out.println("I break like a normal car");
    }
    public void accelerate() {
        System.out.println("I accelerate like normal car");
    }
}
