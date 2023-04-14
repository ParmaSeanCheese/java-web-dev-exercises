package studios.Class6;

import studios.Class6.Questions.Question;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private Scanner input = new Scanner(System.in);
    private ArrayList<Question> questionList;
    private double totalPoints;
    private double accumulatedPoints;

    public Quiz(ArrayList<Question> questionList, double totalPoints) {
        this.questionList = questionList;
        this.totalPoints = totalPoints;
    }

    public ArrayList<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(ArrayList<Question> questionList) {
        this.questionList = questionList;
    }

    public double getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(double totalPoints) {
        this.totalPoints = totalPoints;
    }

    public double getAccumulatedPoints() {
        return accumulatedPoints;
    }

    public void setAccumulatedPoints(double accumulatedPoints) {
        this.accumulatedPoints = accumulatedPoints;
    }

    public double takeQuiz(){
        String givenAnswer;
        Double totalPoints = 0.0;
        for (Question question : questionList){
            System.out.println(question.getQuestion());
            System.out.println(question.getPossibleAnswers);
            givenAnswer = input.nextLine();
            totalPoints+= question.answerQuestion(givenAnswer);
        }
    }
}
