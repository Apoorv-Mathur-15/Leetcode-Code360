package src;

import java.util.Scanner;

public class SimpleQuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "What is the capital of France?\n1) Berlin\n2) Madrid\n3) Paris\n4) Rome",
                "What is 2 + 2?\n1) 3\n2) 4\n3) 5\n4) 6",
                "What is the color of the sky?\n1) Red\n2) Green\n3) Blue\n4) Yellow"
        };

        int[] answers = {3, 2, 3}; // Correct answers: Paris, 4, Blue
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Enter your answer (1-4): ");
            int answer = scanner.nextInt();
            if (answer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
        }

        System.out.println("Your score: " + score + "/" + questions.length);
    }
}
