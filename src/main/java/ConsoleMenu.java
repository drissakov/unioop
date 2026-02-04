import java.util.Scanner;

public class ConsoleMenu {

    private final StudentStorage storage;
    private final Scanner scanner = new Scanner(System.in);

    public ConsoleMenu(StudentStorage storage) {
        this.storage = storage;
    }

    public void start() {
        while (true) {
            printMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> showStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> {
                    System.out.println("Exiting program.");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private void printMenu() {
        System.out.println("\n=== Student Management ===");
        System.out.println("1. Add student");
        System.out.println("2. Show all students");
        System.out.println("3. Update student age");
        System.out.println("4. Delete student");
        System.out.println("5. Exit");
        System.out.print("Choose option: ");
    }

    private void addStudent() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Group: ");
        String group = scanner.nextLine();

        storage.addStudent(name, age, group);
        System.out.println("Student added.");
    }

    private void showStudents() {
        System.out.println("\nStudents:");
        for (String s : storage.getAllStudents()) {
            System.out.println(s);
        }
    }

    private void updateStudent() {
        System.out.print("Student name: ");
        String name = scanner.nextLine();

        System.out.print("New age: ");
        int age = Integer.parseInt(scanner.nextLine());

        storage.updateStudentAge(name, age);
        System.out.println("Student updated.");
    }

    private void deleteStudent() {
        System.out.print("Student name: ");
        String name = scanner.nextLine();

        storage.deleteStudent(name);
        System.out.println("Student deleted.");
    }
}
