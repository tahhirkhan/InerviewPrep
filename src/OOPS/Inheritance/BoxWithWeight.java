package OOPS.Inheritance;

public class BoxWithWeight extends Box{
    int weight;


    // CONSTRUCTORS:
    // 1.Normal parameterized constructor:
    BoxWithWeight(int l, int b, int h, int w) {
        // super keyword invokes the superclass constructor and assigns the values to super class variables;
        super(l, b, h);
        this.weight = w;
    }

    // 2.The constructor that takes in an object of type BoxWithWeight as an argument:
    BoxWithWeight(BoxWithWeight other) {
        super(other);
        this.weight = other.weight;
    }
}
