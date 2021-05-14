package ch14_2;

import java.io.*;

public class QuizCard implements Serializable {
    private String uniqueID;
    private String category;
    private String question;
    private String answer;
    private String hint;

    public QuizCard(String q, String a){
        question = q;
        answer = a;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public String getCategory() {
        return category;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getHint() {
        return hint;
    }


}
