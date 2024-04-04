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






    public ArrayList<Double> getStudentsByScore(){
        ArrayList<Double> orderedByScore = new ArrayList<>();
        for (Student student : students){
            orderedByScore.add(student.getAverageExamScore());
        }
        Collections.sort(orderedByScore, Collections.reverseOrder());

        return orderedByScore;
    }



    public HashMap getGradeBook() {
        ArrayList<Double> orderedByScore = getStudentsByScore();
        HashMap<Student,String> studentGrades = new HashMap<>();


        int a = (int) Math.ceil((getStudentsByScore().size() * .1));
        int b = (int) Math.ceil((getStudentsByScore().size() * .3));
        int c = (int) Math.ceil((getStudentsByScore().size() * .5));
        int d = (int) Math.ceil((getStudentsByScore().size() * .5));
        int f = getStudentsByScore().size();

        for (int i = 0; i < orderedByScore.size(); i++) {
            switch(i){
                case(i > 0 && i < orderedByScore.get(a)) :
                    studentGrades.put(orderedByScore.get(i),"A");

                case(i > a && i < orderedByScore.get(b)) :
                    studentGrades.put(orderedByScore.get(i),"B");

                case(i > b && i < orderedByScore.get(c)) :
                    studentGrades.put(orderedByScore.get(i),"C");

                case(i > c && i < orderedByScore.get(d)) :
                    studentGrades.put(orderedByScore.get(i),"D");

                case(i > d && i < orderedByScore.get(f+1)) :
                    studentGrades.put(orderedByScore.get(i),"F");

                default :
                    
            }
        }
        return studentGrades;
    }



}
