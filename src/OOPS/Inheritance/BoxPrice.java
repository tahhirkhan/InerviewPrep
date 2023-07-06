package OOPS.Inheritance;

public class BoxPrice extends BoxWithWeight {
    int price;

    // Constructors:
    BoxPrice(int l, int b, int h, int w, int p) {
        super(l, b, h, w);
        this.price = p;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.price = other.price;
    }


    BoxPrice(BoxWithWeight other, int price) {
        super(other);
        this.price = price;
    }
}
