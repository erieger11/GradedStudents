package io.zipcoder;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores = new ArrayList<>();


    public Student (String firstName, String lastName, ArrayList examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }




}
