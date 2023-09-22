package TrueOrFalse;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class TrueOrFalse {
    private ArrayList<String> questions = new ArrayList<>();

    public TrueOrFalse() {
        questions.add("Are Sharks Mammals? (Yes/No)");
        questions.add();
        questions.add();
        questions.add();
        questions.add();
        questions.add();
        questions.add();
        questions.add();
        questions.add();

    }
    public String getQuestion() {
        Random random = new Random();
        int randomIndex = random.nextInt(questions.size());
        return questions.get(randomIndex);
    }

    public boolean evaluateAnswer(String question, String userAnswer) {
        if (question.contains("(Yes/No)")) {
            return userAnswer.equalsIgnoreCase("Yes");
        }
        return false;
    }

    public static void main(String[] args) {
        {
            TrueOrFalse game = new TrueOrFalse();
            String randomQuestion = game.getQuestion();
            System.out.println("Question: " + randomQuestion);

            String userAnswer = "Yes";

            boolean isCorrect = game.evaluateAnswer(randomQuestion, userAnswer);

            if (isCorrect) {
                System.out.println("Correct Answer!");
            } else {
                System.out.println("Wrong Answer!");
            }
        }

    }















}