/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.quiz;

/**
 *
 * @author Fatec
 */
public class Question {
        String question;
        String answer;
        String alternative[];

    public String getQuestion() {
        return question;
    }

    public Question(String question, String answer, String[] alternative) {
        this.question = question;
        this.answer = answer;
        this.alternative = alternative;
    }

    public String getAnswer() {
        return answer;
    }

    public String[] getAlternative() {
        return alternative;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setAlternative(String[] alternative) {
        this.alternative = alternative;
    }
    
    
    
        
        
}
