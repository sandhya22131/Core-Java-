import java.util.HashMap;
import java.util.Scanner;

public class StudentMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Adding entries to the map
        System.out.println("Enter student ID and name (type -1 to stop):");
        while (true) {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (id == -1) {
                break;
            }

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            studentMap.put(id, name);
        }

        // Retrieving a name based on ID
        System.out.print("\nEnter a student ID to retrieve name: ");
        int searchId = scanner.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Student Name: " + studentMap.get(searchId));
        } else {
            System.out.println("No student found with ID: " + searchId);
        }

        scanner.close();
    }
}
