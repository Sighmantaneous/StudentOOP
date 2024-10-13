import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        String userName,email,course;
        String userName2,email2,course2;
        String userName3,email3, course3;

        System.out.println("Please enter the name of the student");
        Scanner scanner = new Scanner(System.in);
        userName=scanner.next();
        System.out.println("Please enter the email of the student");
        email=scanner.next();
        System.out.println("Please enter the course of the student");
        course=scanner.next();

        System.out.println("Please enter the name of the student");
        userName2=scanner.next();
        System.out.println("Please enter the email of the student");
        email2=scanner.next();
        System.out.println("Please enter the course of the student");
        course2=scanner.next();

        System.out.println("Please enter the name of the student");
        userName3=scanner.next();
        System.out.println("Please enter the email of the student");
        email3=scanner.next();
        System.out.println("Please enter the course of the student");
        course3=scanner.next();




        Student student = new Student();
        student.setName(userName);
        student.setEmail(email);
        student.setCourse(course);
        System.out.println(student.toString());

        Student student2 = new Student(userName2);
        student2.setEmail(email2);
        student2.setCourse(course2);
        System.out.println(student2.toString());

        Student student3 = new Student(userName3,email3,course3);
        System.out.println(student3.toString());
        }
    }
