import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {

                System.out.print("Enter Student Name: ");
                String name = input.nextLine();

                System.out.print("Enter Student ID: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Enter Major: ");
                String major = input.nextLine();

                Student student = new Student(name, id, major);
                students.add(student);

                System.out.println("Student Added!");

            } else if (choice == 2) {

                System.out.println("\nStudent Records");
                System.out.println("----------------");

                for (int i = 0; i < students.size(); i++) {
                    System.out.println("Name: " + students.get(i).name);
                    System.out.println("ID: " + students.get(i).id);
                    System.out.println("Major: " + students.get(i).major);
                    System.out.println("----------------");
                }

            } else if (choice == 3) {

                System.out.print("Enter Student Name: ");
                String searchName = input.nextLine();

                boolean found = false;

                for (int i = 0; i < students.size(); i++) {

                    if (students.get(i).name.equalsIgnoreCase(searchName)) {
                        System.out.println("\nStudent Found");
                        System.out.println("----------------");
                        System.out.println("Name: " + students.get(i).name);
                        System.out.println("ID: " + students.get(i).id);
                        System.out.println("Major: " + students.get(i).major);
                        System.out.println("----------------");

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }

            } else if (choice == 4) {

                System.out.print("Enter Student Name to Update: ");
                String updateName = input.nextLine();

                boolean found = false;

                for (int i = 0; i < students.size(); i++) {

                    if (students.get(i).name.equalsIgnoreCase(updateName)) {

                        System.out.print("Enter New Name: ");
                        students.get(i).name = input.nextLine();

                        System.out.print("Enter New ID: ");
                        students.get(i).id = input.nextInt();
                        input.nextLine();

                        System.out.print("Enter New Major: ");
                        students.get(i).major = input.nextLine();

                        System.out.println("Student Updated!");

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }

            } else if (choice == 5) {

                System.out.print("Enter Student Name to Delete: ");
                String deleteName = input.nextLine();

                boolean found = false;

                for (int i = 0; i < students.size(); i++) {

                    if (students.get(i).name.equalsIgnoreCase(deleteName)) {
                        students.remove(i);

                        System.out.println("Student Deleted!");

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }

            } else if (choice == 6) {

                System.out.println("Exiting...");
                break;

            } else {

                System.out.println("Invalid option.");
            }
        }

        input.close();
    }
}