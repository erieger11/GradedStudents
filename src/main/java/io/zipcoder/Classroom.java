package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Classroom {
    ArrayList<Student> students;

    int maxNumberOfStudents;

    public Classroom(int maxNumberOfStudents){
        this.students = new ArrayList<>(maxNumberOfStudents);
        this.maxNumberOfStudents = maxNumberOfStudents;
    }
    public Classroom(Student[] students){
        this.students = new ArrayList<>(List.of(students));
    }
    public Classroom(){
        this.students = new ArrayList<>();
    }

    public Student[] getStudents(){
        return students.toArray(new Student[0]);
    }
    public Double getAverageExamScore(){
        double totalScores = 0.0;
        for (Student student : students) {
            totalScores += student.getAverageExamScore();
        }
        return totalScores / students.size();
    }
    public boolean addStudent(Student student){
        return students.add(student);
    }


    boolean filterStudent(Student student, String firstName, String lastName) {
        return student.getFirstName().equals(firstName) && student.getLastName().equals(lastName);
    }

    List<Student> filteredStudents(List<Student> list,String firstName, String lastName) {
        List<Student> filteredList = new ArrayList<>();
        for (Student student : list) {
            if (!filterStudent(student, firstName, lastName )) {
                filteredList.add(student);
            }
        }
        return filteredList;
    }
    public ArrayList<Student> getStudentsByScore(){
        students.sort(Collections.reverseOrder());
        return students;
    }

    public double percentile(int index , int length){
        double percentile = (double) index/length * 100.0;
        return Math.round(percentile*100.0) / 100.0;
    }




    public HashMap<Student, String> getGradeBook() {
        ArrayList<Student> orderedByScore = getStudentsByScore();
        HashMap<Student,String> studentGrades = new HashMap<>();
        for (int i = 0; i < orderedByScore.size(); i++) {
            double percen = percentile(i,orderedByScore.size());
                if(percen >= 90) {
                    studentGrades.put(orderedByScore.get(i), "A");
                }
                if(percen >= 71) {
                    studentGrades.put(orderedByScore.get(i), "B");
                }
                if(percen >= 50) {
                    studentGrades.put(orderedByScore.get(i), "C");
                }
                if(percen >= 11) {
                    studentGrades.put(orderedByScore.get(i), "D");
                }
                else {
                    studentGrades.put(orderedByScore.get(i), "F");
                }
        }
        return studentGrades;
    }
}
