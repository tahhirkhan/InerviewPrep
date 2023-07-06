package OOPS.AbstractClasses;

public abstract class Parent {

    // abstract methods must be overridden.
    // if even one method is abstract, then the class needs to be declared abstract.
    int age;
    public Parent(int age) {
        this.age = age;
    }
    abstract void career();
    abstract void partner();

    // non-abstract methods:
    // we can have both static and non-static methods in abstract class.
    // we also can not have abstract constructors.
    // but we can not have a static abstract method, because they can not be overridden, while the whole point of abstract methods is that they are overridden.
    static void greeting(){
        System.out.println("Hii, This is abstract parent class");
    }

    void demo() {
        System.out.println("this is a demo method");
    }

    // Note: we can not create an object of abstract class, but we can have a reference of type abstract class.
}
