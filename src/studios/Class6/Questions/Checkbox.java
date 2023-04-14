package studios.Class6.Questions;

import java.util.ArrayList;
import java.util.HashMap;

public class Checkbox extends Question{
    private HashMap<String, String> answerChoices;
    private ArrayList<String> correctAnswers;
    private double points;

    public Checkbox(String question, HashMap<String, String> answerChoices, ArrayList<String> correctAnswers, double points) {
        super(question);
        this.answerChoices = answerChoices;
        this.correctAnswers = correctAnswers;
        this.points = points;
    }


    public HashMap<String, String> getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(HashMap<String, String> answerChoices) {
        this.answerChoices = answerChoices;
    }

    public ArrayList<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(ArrayList<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    @Override
    public Double answerQuestion(String input){
        double earnedPoints = 0;
        String[] inputArr = input.split(",");
        for(String selection : inputArr){
            for (String option : answerChoices.keySet()){
                if (selection.equals(option)){
                    earnedPoints += 1;
                }
            }
        }
        return (earnedPoints/this.points);
    }

}
