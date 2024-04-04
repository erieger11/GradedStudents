package io.zipcoder;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;


    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(examScores);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOFExamsTaken() {
        return examScores.size();
    }
    public void addExamScore(double newScore){
        examScores.add(newScore);
    }


    public String getExamScores() {
        StringBuilder builder = new StringBuilder();
        for (Double examScore : examScores) {
            builder.append("Exam -> ").append(examScore).append("\n");
        }
        return builder.toString();
    }

    public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber, newScore);
    }

    public double getAverageExamScore(){
         double total= 0.0;
        for (Double examScore : examScores) {
            total += examScore;
        }
        return total / examScores.size();

    }
    public String toString(){
            StringBuilder builder = new StringBuilder();
        builder.append("Student name : ").append(firstName).append(" ").append(lastName).append("\n");
        builder.append("Average score : ").append(getAverageExamScore()).append("\n");
        builder.append("Exam scores : ").append(getExamScores()).append("\n");
            return builder.toString();
    }


}
