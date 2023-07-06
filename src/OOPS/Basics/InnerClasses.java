package OOPS.Basics;

public class InnerClasses { // a class inside another class is called inner class;
    class TestClass {
        String name;

        TestClass(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

/**


 * TestClass obj1 = new TestClass("Tahir");
 * This will give an error because we are actually creating the TestClass
 * object inside the static method, but the TestClass itself is non-static, so it can't be called from the static method.
 * Therefore, any object that is of type of any non-static inner class can not be called from a static method
 * There are two ways of achieving the above goal:
 * 1. To declare the inner class as static.
 * 2. To declare this class outside the Outer class i.e., the class it is currently declared in, that way it won't remain an inner class.


 */
    }
}
