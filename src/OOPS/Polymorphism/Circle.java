package OOPS.Polymorphism;

public class Circle extends Shapes {
    int radius;
    final double pi = 3.14;
    @Override // (this keyword is used to check whether the method is being overridden or not)
    void area() {
        System.out.println("This method provides the area of the circle");
    }

//    void greeting() {
//        System.out.println("Hello Universe");
//    }
}
