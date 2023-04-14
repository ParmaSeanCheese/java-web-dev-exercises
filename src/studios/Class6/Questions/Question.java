package studios.Class6.Questions;

import java.util.ArrayList;

public abstract class Question {
    private String answer;
    private String question;
    private double points;
    private ArrayList<String> possibleAnswers;

    public Question(String question, String answer, double points, ArrayList<String> possibleAnswers) {
        this.question = question;
        this.answer = answer;
        this.points = points;
    }
    public Question(String answer, String question) {
        this.answer = answer;
        this.question = question;
        this.points = 1;
    }

    public Question(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }
    public Double answerQuestion(String input){return -1.0;}
}
