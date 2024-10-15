import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Student student = getStudentInfo(scanner);
        Student student2 = getStudentInfo(scanner);
        Student student3 = getStudentInfo(scanner);


        System.out.println(student.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        }

    public static Student getStudentInfo(Scanner scanner) {
        System.out.println("Please enter the name of the student");
        String name = scanner.next();
        System.out.println("Please enter the email of the student");
        String email = scanner.next();
        System.out.println("Please enter the course of the student");
        String course = scanner.next();
        return new Student(name, email, course);

    }
    }


