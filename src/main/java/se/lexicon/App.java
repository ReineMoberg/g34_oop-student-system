package se.lexicon;

import se.lexicon.data.StudentData;
import se.lexicon.data.StudentDataImpl;
import se.lexicon.model.Gender;
import se.lexicon.model.Student;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        StudentData studentData = new StudentDataImpl();
        while (true) {
            System.out.println("#################################");
            System.out.println("### STUDENT MANAGEMENT SYSTEM ###");
            System.out.println("### 1. add ######################");
            System.out.println("### 2. search by id ##############");
            System.out.println("### 3. delete by id ##############");
            System.out.println("### 4. show number of students ###");
            // todo: add more functionalities
            System.out.println("### 10. exit #####################");

            Scanner scanner = new Scanner(System.in);
            System.out.println(" enter a valid operation number: ");
            String operationType = scanner.nextLine();

            switch (operationType) {
                case "1":
                    String[] courses = new String[1];
                    courses[0] = "Java";
                    //Student student= new Student("Test","Testsson",22, Gender.NON_BINARY,true,courses);
                    Student student = new Student();
                    System.out.println("First Name: ");
                    student.setFirstName(scanner.nextLine());
                    System.out.println("Last Name: ");
                    student.setLastName(scanner.nextLine());
                    System.out.println(" Age");
                    student.setAge(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Gender (M,F,N)");
                    String genderInput = scanner.nextLine();
                    if (genderInput.charAt(0) == Gender.FEMALE.getType()) {
                        student.setGender(Gender.FEMALE);
                    } else if (genderInput.charAt(0) == Gender.MALE.getType()) {
                        student.setGender(Gender.MALE);
                    } else {
                        student.setGender(Gender.NON_BINARY);
                    }

                    System.out.println(" Courses (,): ");
                    String[] courseArray = scanner.nextLine().split(","); // Java , Python
                    student.setCourses(courseArray);
                    Student result = studentData.add(student);
                    break;
                case "2":
                    // todo: call search by id method
                    break;
                case "3":
                    // todo: delete by id method
                    break;
                case "4":
                    System.out.println("student array size" + studentData.studentSize());
                    //System.out.println(Arrays.toString(studentData.getAll()));

                    Student[] studentResult = studentData.getAll();
                    for (Student std : studentResult) {
                        System.out.println("---------------------------------\n");
                        System.out.println("FirstName: " + std.getFirstName());
                        System.out.println("LastName : " + std.getLastName());
                        // todo: add more information
                    }
                    break;
                case "10":
                    // todo: call exist method or stop application
                    System.exit(0);
                    break;
                default:
                    System.out.println(" operation is not valid ");
            }
        }


    }
}
