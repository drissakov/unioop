import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Institution university = new Institution("My University");

        university.addPerson(new Student("Alex", 19, "CS-01"));
        university.addPerson(new Student("Maria", 21, "CS-02"));
        university.addPerson(new Teacher("Dr. Brown", 45, "OOP"));
        university.addPerson(new Teacher("Prof. Smith", 50, "Math"));

        System.out.println("All people:");
        for (Person p : university.getRepository().getAll()) {
            System.out.println(p);
        }

        System.out.println("\nFiltered (age >= 21):");
        for (Person p : university.getRepository().filterByAge(21)) {
            System.out.println(p);
        }

        System.out.println("\nSorted by name:");
        for (Person p : university.getRepository().sortByName()) {
            System.out.println(p);
        }

        System.out.println("\nSearch by name:");
        System.out.println(university.getRepository().findByName("Alex")); //message to check commit
    }
}