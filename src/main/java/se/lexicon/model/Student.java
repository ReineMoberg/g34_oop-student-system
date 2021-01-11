package se.lexicon.model;

import java.util.Arrays;
import java.util.Objects;

public class Student extends Person {

    private final int studentId;
    private boolean status;
    private String[] courses;

    public Student() {
        studentId = StudentSequencer.nextId();
    }

    public Student(String firstName, String lastName, int age, Gender gender, boolean status, String[] courses) {
        super(firstName, lastName, age, gender);
        this.studentId = StudentSequencer.nextId();
        this.status = status;
        this.courses = courses;
    }

    @Override
    public String showInformation() {
        return "Name: " + getFirstName() + " " + getLastName() +
                " courses: " + Arrays.toString(courses) +
                " Status: " + status;
    }

    public int getStudentId() {
        return studentId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return studentId == student.studentId && status == student.status && Arrays.equals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), studentId, status);
        result = 31 * result + Arrays.hashCode(courses);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", status=" + status +
                ", courses=" + Arrays.toString(courses) +
                " " + super.toString() +
                '}';
    }
}
