package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box cube = new Box(4);
//        cube.volume();

        BoxWithWeight box1 = new BoxWithWeight(2, 4, 12, 7);
/*
         box1.volume();
         System.out.println(box1.weight);


         Now let's see if we can do the following:
         Box box2 = new BoxWithWeight(1, 2, 3, 4);
         System.out.println(box2.weight);
         We can assign the reference variable of type super class to the object of type subclass,
         but we can only access the variables and methods defined in the super class.
         It is the type of reference variable that decides what variables and methods can be accessed
         and not the type of the object.


         Now let's see if we can do the opposite:
         BoxWithWeight box3 = new Box(1, 2, 3);
         we can not do the opposite of the above.
         Because as we discussed that it is actually the reference variable type that demonstrates the access
         to the variables and methods and not the type of the object,
         therefore in this example, the reference variable is of type 'BoxWithWeight', so we should have access to
         all the variables that are defined in the 'BoxWithWeight' class. But our object is of type Box, in which
         some variables defined in the 'BoxWithWeight' class do not exist e.g. weight.
*/


        BoxWithWeight box3 = new BoxWithWeight(box1);
//        System.out.println(box3.weight);

        BoxPrice box4 = new BoxPrice(box3, 100);
//        System.out.println(box4.height);

        BoxPrice box5 = new BoxPrice(box4);


    }
}
