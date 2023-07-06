package OOPS.Inheritance.SingleTon_Calsses;

public class SingletonClass { // A class that you can create only one object of;
    int a = 4;
    private SingletonClass() {

    }

    private static SingletonClass instance = new SingletonClass();

    static SingletonClass provideInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }

        return instance;
    }
}
