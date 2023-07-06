package OOPS.Basics;

public class Human {
    int age;
    String name;
    boolean married;
    int salary;
    // this is a static member, meaning that it does not directly depend on the object, but is common/same to all objects;
    static long population;


    Human(int age, String name, boolean married, int salary) {
        this.age = age;
        this.name = name;
        this.married = married;
        this.salary = salary;
        Human.population += 1; // we address the static member using the class name and not using 'this' keyword;
    }

    public static void main(String[] args) {

        Human man1 = new Human(23, "First Human", true, 20000);
        Human man2 = new Human(41, "Second Human", false, 13000);
        Human man3 = new Human(41, "Third Human", false, 31000);

/*
      System.out.println(man1.population); --- this way of accessing the static variable is not preferred,
      because the static variables are accessed through the class name.
      Therefore, we access it as follows:
*/
        System.out.println(Human.population);


        /*
         WHY IS THE MAIN METHOD STATIC?
         * The static members are not dependent on an object, but they actually belong to a class,
         * The main() method is declared inside the class & it also is the first thing to run during the code execution.
         * So for the code to run (which may be creating the objects of the class or other functions),
         * the main method has to run to start that program execution.
         * Therefore, the main method has to be static to run and to let the other parts of the program run.
         * It should not depend on any object, because the object creation itself happens after the main method runs,
         * which executes all types of calls.
        */
    }
}
