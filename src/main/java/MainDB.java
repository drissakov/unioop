public class MainDB {

    public static void main(String[] args) {

        StudentStorage storage = new PostgresStudentStorage();
        ConsoleMenu menu = new ConsoleMenu(storage);

        menu.start();
    }
}