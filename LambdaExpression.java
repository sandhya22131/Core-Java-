import java.util.*;

public class LambdaSortExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("David");
        names.add("Bob");

        // Sort the list using lambda expression
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        // Display the sorted list
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
