package OOPS.AbstractClasses.AbstractClassConstructor;

public class Main {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.fun();
    }
}

abstract class Base {
    Base() {
        System.out.println("Base class constructor called");
    }

abstract void fun();
}

class Derived extends Base {
    Derived() {
        System.out.println("Derived class constructor called");
    }

    void fun() {
        System.out.println("Derived class fun() called");
    }
}
