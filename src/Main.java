import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        institution institution = new institution("Aitu", "Mangilik el 51", "+77777777777");

        student student1 = new student("Bekzat", "Abilkhayev", 18, "SE-2501", 1);
        student student2 = new student("Alina", "Aitmukhamet", 17, "SE-2501", 1);
        student student3 = new student("Sherkhan", "Amangeldi", 18, "SE-2501", 1);
        student student4 = new student("ARUZHAN", "BOLATOVA", 18, "SE-2501", 1);;
        student student5 = new student("Ali", "Galymuly", 17, "SE-2501", 1);
        student student6 = new student("Sultonbek", "Ibrokhimov", 17, "SE-2501", 1);
        student student7 = new student("Damir", "Issakov", 18, "SE-2501", 1);
        student student8 = new student("Saule", "Jumabay", 17, "SE-2501", 1);
        student student9 = new student("Tlektes", "Kadyr", 18, "SE-2501", 1);
        student student10 = new student("Sabyrzhan", "Kanatov", 18, "SE-2501", 1);
        student student11 = new student("Alikhan", "Kokenov", 18, "SE-2501", 1);
        student student12 = new student("Ardak", "Korabay", 18, "SE-2501", 1);
        student student13 = new student("Ziyadinkhan", "Kudaibergenuly", 18, "SE-2501", 1);
        student student14 = new student("Nurdaulet", "Marat", 18, "SE-2501", 1);
        student student15 = new student("Adali", "Mierlati", 20, "SE-2501", 1);
        student student16 = new student("Ramazan", "Mukhan", 17, "SE-2501", 1);
        student student17 = new student("Aisha", "Mussina", 18, "SE-2501", 1);
        student student18 = new student("Aiym", "Rakhat", 18, "SE-2501", 1);
        student student19 = new student("Nurdaulet", "Rashken", 18, "SE-2501", 1);
        student student20 = new student("Mukhammajan", "Saidazimov", 18, "SE-2501", 1);
        student student21 = new student("Azamat", "Suinalin", 18, "SE-2501", 1);
        student student22 = new student("Aslan", "Ulasbek", 18, "SE-2501", 1);
        student student23 = new student("Ramazan", "Utegen", 18, "SE-2501", 1);
        student student24 = new student("Alikhan", "Zhaxylyk", 17, "SE-2501", 1);

        group se2501 = new group();

        se2501.setGroupName("se2501");
        ArrayList<student> students = new ArrayList<>();
        ArrayList<teacher> teachers = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);
        students.add(student16);
        students.add(student17);
        students.add(student18);
        students.add(student19);
        students.add(student20);
        students.add(student21);
        students.add(student22);
        students.add(student23);
        students.add(student24);

        institution.setStudents(students);

        teacher teacher1 = new teacher("Syndar", "Satbayev",  "Linear Algebra", 17);
        teacher teacher2 = new teacher("Duman", "Adilet", "Discrete math", 15);
        teacher teacher3 = new teacher("Aisulu", "Nurlankyzy", "Introducing to programming",7);

        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);

        institution.setTeachers(teachers);

        student1.setAverageGrade(2.1);
        student2.setAverageGrade(2.3);
        student3.setAverageGrade(2.67);


        if (student1.getAverageGrade() >= 2.67) {
            System.out.println("Have schoolarship");
        }
        else{
            System.out.println("No schoolarship");
        }


    }
}