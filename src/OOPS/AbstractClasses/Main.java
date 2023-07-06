package OOPS.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(22);
        System.out.println(son.age);
        son.career();
        son.partner();
        son.greeting();

        System.out.println();

        Parent father = new Parent(23) {
            @Override
            void career() {
                System.out.println("This is father's career");
            }

            @Override
            void partner() {
                System.out.println("This is father's partner");
            }
        };

        father.career();
        father.partner();
    }
}
