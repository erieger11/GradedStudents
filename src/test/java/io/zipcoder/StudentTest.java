package io.zipcoder;
import org.junit.Test;
import java.util.ArrayList;
public class StudentTest {
    @Test
    public void examScoresTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
            examScores.add(100.0);
            examScores.add(95.0);
            examScores.add(1023.0);
            examScores.add(96.0);
        Student student = new Student(firstName, lastName, examScores);
        String output = student.getExamScores();
        System.out.println(output);
    }
    @Test
    public void addExamScoreTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add(1023.0);
        examScores.add(96.0);
        Student student = new Student(firstName, lastName, examScores);
        student.addExamScore(100.0);
        String output = student.getExamScores();
        System.out.println(output);
    }
    @Test
    public void setExamScoreTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add(1023.0);
        examScores.add(96.0);
        Student student = new Student(firstName, lastName, examScores);
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();
        System.out.println(output);
    }
    @Test
    public void getAverageExamScoreTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add(1023.0);
        examScores.add(96.0);
        Student student = new Student(firstName, lastName, examScores);
        Double output = student.getAverageExamScore();
        System.out.println(output);
    }
    @Test
    public void toStringTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add(1023.0);
        examScores.add(96.0);
        Student student = new Student(firstName, lastName, examScores);
        String output = student.toString();
        System.out.println(output);
    }
}