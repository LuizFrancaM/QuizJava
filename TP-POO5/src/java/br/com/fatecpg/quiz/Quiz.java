/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.quiz;

import java.util.ArrayList;

/**
 *
 * @author Fatec
 */
public class Quiz {

    private static double lastGrade = .0;
    private static double gradeSum = .0;
    private static int testsCount = 0;

    public static double getLastGrade() {
        return lastGrade;
    }

    public static double getGradesAverage() {
        return gradeSum / (double) testsCount;
    }

    public static double validateTest(String[] answers) {
        int corrects = 0;
        for (int i = 0; i < test.size(); i++) {
            Question q = test.get(i);
            if (q.getAnswer().equals(answers[i])) {
                corrects++;
            }
        }
        double grade = 100 * ((double) corrects / (double) test.size());
        testsCount++;
        gradeSum += grade;
        lastGrade = grade;
        return grade;
    }

    private static ArrayList<Question> test;

    public static ArrayList<Question> getTest() {
        if (test == null) {
            test = new ArrayList<>();
            Question q0 = new Question("12/4 =", "3", new String[]{"1", "2", "3", "4"});
            Question q1 = new Question("1+3 =", "4", new String[]{"4", "3", "2", "5"});
            Question q2 = new Question("2+3 =", "5", new String[]{"4", "5", "2", "7"});
            Question q3 = new Question("4+3 =", "7", new String[]{"4", "5", "7", "6"});
            Question q4 = new Question("1-6 =", "-5", new String[]{"-7", "-6", "-5", "-9"});
            Question q5 = new Question("1*1 =", "1", new String[]{"1", "2", "3", "4"});
            Question q6 = new Question("1+1 =", "2", new String[]{"1", "2", "3", "4"});
            Question q7 = new Question("√9 =", "3", new String[]{"6", "2", "3", "9"});
            Question q8 = new Question("32/16 =", "2", new String[]{"8", "2", "6", "4"});
            Question q9 = new Question("12*3 =", "36", new String[]{"36", "39", "32", "40"});
            test.add(q0);
            test.add(q1);
            test.add(q2);
            test.add(q3);
            test.add(q4);
            test.add(q5);
            test.add(q6);
            test.add(q7);
            test.add(q8);
            test.add(q9);
            
        }
        return test;
    }
}
