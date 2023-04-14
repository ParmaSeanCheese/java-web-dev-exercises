package studios.Class6.Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultipleChoice extends Question{
    private ArrayList<String> possibleAnswers;

    public MultipleChoice(String question, String answer, double points, ArrayList<String> possibleAnswers) {
        super(question, answer, points);
        this.possibleAnswers = possibleAnswers;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    @Override
    public Double answerQuestion(String input){
        if (input.equals(this.getAnswer())){
            return this.getPoints();
        } else {
            return 0.0;
        }
    }
}
