import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        // Create first student 
        Student student1 = new Student(
                "Walter",
                1,
                "Computer Science"
        );

        Student student2 = new Student(
                "Lucia",
                2,
                "Early Education"
        );

        Student student3 = new Student(
                "Joelito",
                3,
                "Middle School"
        );
        
        // Create ArrayList
        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (int i = 0; i < students.size(); i++) {

            System.out.println("Student Info:");
            System.out.println("----------------");

            System.out.println(students.get(i).name);
            System.out.println(students.get(i).id);
            System.out.println(students.get(i).major);
            System.out.println("----------------");
            

            System.out.print(" ");
        
        }

    }
    
}
