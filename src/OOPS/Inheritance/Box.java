package OOPS.Inheritance;

public class Box {
    int length;
    int width;
    int height;


    // CONSTRUCTORS:
    // 1.non parameterized constructor:
    Box() {
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    // 2.when the box is cuboid;
    Box(int side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    // 3.when the box is a normal 3-dimensional object:
    Box(int l, int w, int h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    // 4.if the constructor takes in the other object as the parameter:
    Box(Box other) {
        this.length = other.length;
        this.width = other.width;
        this.height = other.height;
    }



    // Member functions of the class:
    void volume() {
        int vol = this.length * this.width * this.height;
        System.out.println(vol);
    }
}
