package OOPS.AbstractClasses;

public class Son extends Parent {

    public Son(int age) {
        super(age);

    }

    @Override
    void career() {
        System.out.println("I am going to pursue my career in Medicine");
    }

    @Override
    void partner() {
        System.out.println("I am going to marry ABC");
    }
}
