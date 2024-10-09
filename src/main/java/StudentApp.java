import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        String userName,email,course;

        System.out.println("Please enter the name of the student");
        Scanner scanner = new Scanner(System.in);
        userName=scanner.next();
        System.out.println("Please enter the email of the student");
        email=scanner.next();
        System.out.println("Please enter the course of the student");
        course=scanner.next();



        Student student = new Student();
        student.setName(userName);
        student.setEmail(email);
        student.setCourse(course);
        System.out.println(student.toString());
    }
}