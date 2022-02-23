package Unit3.GPALab;

/* This program will create a StudentGPA class with four instance variables (studentGPA, studentFirstName, studentLastName, and studentID). The method will include the necessary operations to access the values of these variables as well as methods to update both the GPA (with the entrance of new class scores) and student ID. */

public class StudentGPA {
    // Instance variables
    double studentGPA;
    String studentFirstName;
    String studentLastName;
    String studentID;

    // Temp variable for sum of letter grade GPA values
    double temp;

    // Constructors
    public StudentGPA(double gpa, String fn, String ln, String id) {
        studentGPA = gpa;
        studentFirstName = fn;
        studentLastName = ln;
        studentID = id;
    }

    // Accessors
    public double getGPA() {
        return studentGPA;
    }

    public String getFirstName() {
        return studentFirstName;
    }

    public String getLastName() {
        return studentLastName;
    }

    public String getStudentID() {
        return studentID;
    }

    // Methods
    private double determineGPAValue(char letterGrade) {
        // Determine value of letter grade
        switch (letterGrade) {
            case 'A': return 4.0;
            case 'B': return 3.0;
            case 'C': return 2.0;
            case 'D': return 1.0;
        }

        // If none of the previous conditions are satisfied:
        return 0.0;
    }

    public void calculateGPA(String grades) {
        // Loop through each letter grade, determine GPA value, and add value to temp variable
        for(int i = 0; i < grades.length(); i++) {
            char letterGrade = grades.charAt(i);
            temp += determineGPAValue(letterGrade);
        }

        // Average current studentGPA (assumed to be after one semester) with average GPA stored in temp variable
        studentGPA = (studentGPA + (temp / 4)) / 2;
    }

    // Function to determine current password for updateStudentID function
    private String determineCurrentPassword() {
        // Find all parts of currentPassword variable
        String lastTwoLettersFirstName = studentFirstName.substring(studentFirstName.length() - 2);
        char firstNumberStudentID = studentID.charAt(0);
        String firstThreeLettersLastName = studentLastName.substring(0, 3);
        char lastNumberStudentID = studentID.charAt(studentID.length() - 1);

        // Return all parts added together
        System.out.println(lastTwoLettersFirstName + firstNumberStudentID + firstThreeLettersLastName + lastNumberStudentID);
        return lastTwoLettersFirstName + firstNumberStudentID + firstThreeLettersLastName + lastNumberStudentID;
    }

    public String updateStudentID(String password, String newStudentID) {
        String currentPassword = determineCurrentPassword();

        // Check if passwords are the same
        if(password.equals(currentPassword)) {
            // Update ID and return success message
            studentID = newStudentID;
            return "Student ID successfully updated";
        } else {
            return "Password incorrect";
        }
    }
}