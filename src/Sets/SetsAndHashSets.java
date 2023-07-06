package Sets;

import java.util.*;

public class SetsAndHashSets {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Saul");
        names.add("Gustav");

        System.out.println(names);

        // Set methods:
        names.remove("Saul");
        System.out.println(names.contains("Jesse"));
        System.out.println(names.isEmpty());

        System.out.println(names);
        System.out.println();

        // Print the elements of the set using lambda function:
        names.forEach(System.out::println);

        System.out.println();

        // Print the elements of the set using iterator object/operator:
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        System.out.println();

        // Remove duplicates from an ArrayList:
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);

        System.out.println(numberList);

        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println(numberSet);
    }
}
