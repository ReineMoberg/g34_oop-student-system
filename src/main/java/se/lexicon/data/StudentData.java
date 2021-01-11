package se.lexicon.data;

import se.lexicon.model.Student;

public interface StudentData {

    // CRUD Operations for Student
    // Student functionalities

    Student add(Student student);

    Student[] getAll();

    Student findById(int studentId);

    Student findByName(String studentName);

    int studentSize();

    void clear();
    // todo: define update, delete

    //static and default
    static void printStudentFullName(Student student) {
        if (student != null) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        } else {
            System.out.println("Student is null");
        }
    }
}
