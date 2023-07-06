package OOPS.Interfaces.NestedInterfaces;

/*
 The difference between the top level interface and nested interface is that
 the top level interface has to be declared public or the default one,
 while as the nested interface can be declared private also.
*/

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        boolean ans = obj.isOdd(8);
        System.out.println(ans);
    }
}

class A {
    public interface nestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.nestedInterface {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
