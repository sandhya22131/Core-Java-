import java.util.ArrayList;
import java.util.Scanner;

public class StudentListExample {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        
        System.out.println("Enter student names (type 'done' to finish):");
        
        while (true) {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            
            if (name.equalsIgnoreCase("done")) {
                break;  // exit the loop
            }
            
            studentNames.add(name);
        }
        
        System.out.println("\nList of student names:");
        for (String student : studentNames) {
            System.out.println(student);
        }
        
        scanner.close();
    }
}
