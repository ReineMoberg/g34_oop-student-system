package se.lexicon.data;

import se.lexicon.model.Student;

import java.util.Arrays;

public class StudentDataImpl implements StudentData {

    private Student[] students;

    public StudentDataImpl() {
        students = new Student[0];
    }

    @Override
    public Student add(Student student) {
        // check the input data
        if (student == null) {
            return null;
        }

        if (checkDuplicateId(student)){
            return null;
        }
        Student[] newArray = Arrays.copyOf(students, students.length + 1);
        newArray[newArray.length - 1] = student;
        students = newArray;
        return student;
    }

    private boolean checkDuplicateId(Student input){
        boolean exist = false;
        for (Student student: students){
            if (student.getStudentId() == input.getStudentId()){
                exist = true;
                break;
            }
        }
        return exist;
    }


    @Override
    public Student[] getAll() {
        return students;
    }

    @Override
    public Student findById(int studentId) {
        return null;
    }

    @Override
    public Student findByName(String studentName) {
        return null;
    }

    @Override
    public int studentSize() {
        // return a size of student array
        return students.length;
    }

    @Override
    public void clear() {
        // remove students data from array
        students = new Student[0];
    }
}
