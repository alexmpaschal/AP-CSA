package Unit3.GPALab;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize Scanner object
        Scanner kboard = new Scanner(System.in);

        // Initialize studentGPA objects called student1, student2, and student3
        StudentGPA student1 = new StudentGPA(4.0, "John", "Doe", "1");
        StudentGPA student2 = new StudentGPA(3.0, "Jane", "Doe", "2");
        StudentGPA student3 = new StudentGPA(2.0, "John", "Roe", "3");

        // Display student info
        printStudentInfo(student1);
        printStudentInfo(student2);
        printStudentInfo(student3);

        // Test calculateStudentGPA function
        testCalculateStudentGPA(student1, "BBBB");
        testCalculateStudentGPA(student2, "CCCC");
        testCalculateStudentGPA(student3, "DDDD");
        
        // Get user input for password and newStudentID using Scanner object kboard
        System.out.print("Enter the student's password: ");
        String password = kboard.next();

        System.out.print("Enter new student ID: ");
        String newStudentID = kboard.next();
        
        testUpdateStudentID(student1, password, newStudentID);
        testUpdateStudentID(student2, password, newStudentID);
        testUpdateStudentID(student3, password, newStudentID);

        // Close Scanner object kboard
        kboard.close();
    }

    public static void printStudentInfo(StudentGPA student) {
        // Display each piece of student info
        System.out.println("GPA: " + student.getGPA());
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Student ID: " + student.getStudentID());
    }

    public static void testCalculateStudentGPA(StudentGPA student, String grades) {
        // Calculate GPA with certain grades then print the new studentGPA value
        student.calculateGPA(grades);
        System.out.println("New GPA: " + student.getGPA());
    }

    public static void testUpdateStudentID(StudentGPA student, String password, String newStudentID) {
        String result = student.updateStudentID(password, newStudentID);
        System.out.println(result);
    }
}