package OOPS.LambdaFunction;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i<5; i++) {
            arr.add(i+1);
        }

        // This is the simple representation of a Lambda function:
//        arr.forEach((item) -> System.out.print(item+" "));

        // we can also store the function body inside a variable and then pass that variable as argument:
        // the variable should be of type Consumer<T> interface, as the above function above is internally implementing that.
        // the above Consumer<T> interface is accepting the one argument only, so to show an example of multiple parameters,
        // we created an interface below called Operation.


        Consumer<Integer> fun = (item) -> System.out.print(item+" ");
        arr.forEach(fun);

        // For multiple parameters:
        Operation sum = (a, b) -> a + b;
        Operation product = (a, b) -> a * b;
        Operation subtraction = (a, b) -> a - b;
    }
}

interface Operation {
    int sum(int a, int b);
}

/*
 In short the Lambda Functions are basically a oneliner functions, where we don't need the function name,
 but we need the function body which we write as shown above.
*/
