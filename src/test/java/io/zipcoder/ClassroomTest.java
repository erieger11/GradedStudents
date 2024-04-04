package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {
    @Test
    public void getAverageClassExamScoreTest(){
        ArrayList<Double> s1Scores = new ArrayList<>();
        s1Scores.add(100.0);
        s1Scores.add(150.0);
        ArrayList<Double> s2Scores = new ArrayList<>();
        s2Scores.add(225.0);
        s2Scores.add(25.0);
        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);
        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);
        double output = classroom.getAverageExamScore();
        System.out.println(output);
    }
    @Test
    public void addStudentTest(){
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(150.0);
        examScores.add(250.0);
        examScores.add(0.0);
        Student student = new Student("Leon", "Hunter", examScores);
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);
        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }

}
