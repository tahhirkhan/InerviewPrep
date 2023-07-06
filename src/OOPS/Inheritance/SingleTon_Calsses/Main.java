package OOPS.Inheritance.SingleTon_Calsses;

public class Main {
    public static void main(String[] args) {
        SingletonClass A = SingletonClass.provideInstance();
        SingletonClass B = SingletonClass.provideInstance();
        System.out.println(A.a);
        System.out.println(B.a);

        // Above, we created two objects of the SingletonClass, but in reality
        // both these reference variables of type SingletonClass point to the same instance/object of the SingletonClass
        // so in reality there exists only one object of the SingletonClass.

    }
}
