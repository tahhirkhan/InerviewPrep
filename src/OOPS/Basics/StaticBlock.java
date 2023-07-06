package OOPS.Basics;

public class StaticBlock {
    static int a = 5;
    static int b;

    /**
     * This is called Static Block, it is used to initialize the static variables;
     * It only runs once i.e., when the class is loaded;
     */

    static {
        b = a * 3;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock.b += 5;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

    }
}
