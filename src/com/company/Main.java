package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Init();
    }

    public static void Init() {
        Scanner obj = new Scanner(System.in);

        // Begin Message
        System.out.println("---Rock, Paper, Scissor---");

        String AISelector = AISelector();
        String UserInput = UserInput();

        System.out.println("AI: " + AISelector + ", User: " + UserInput);

        SelectWinner(AISelector, UserInput);

        // Replay Message
        System.out.println("---Would you like to play again?---");
        System.out.println("---Yes = y, No = n---");

        String userReplay = obj.nextLine();

        if(userReplay.equals("y")) {
            Init();
        }
    }

    public static String AISelector() {
        Random rnd = new Random();

        String selector = "";
        int number = rnd.nextInt(3);

        switch (number) {
            case 0:
                selector = "Rock";
                break;
            case 1:
                selector = "Paper";
                break;
            case 2:
                selector = "Scissor";
                break;
        }

        return selector;
    }

    public static String UserInput() {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter: ");
        String getUserInput = obj.nextLine();

        if (getUserInput.equals("Rock")) {
            return getUserInput;
        } else if (getUserInput.equals("Paper")) {
            return getUserInput;
        } else if (getUserInput.equals("Scissor")) {
            return getUserInput;
        } else {
            return "User input error!";
        }
    }

    public static void SelectWinner(String AIInput, String UserInput) {
        if (AIInput.equals("Rock") && UserInput.equals("Paper")) {
            System.out.println("Player Wins!");
        }

        if (AIInput.equals("Paper") && UserInput.equals("Scissor")) {
            System.out.println("Player Wins!");
        }

        if (AIInput.equals("Scissor") && UserInput.equals("Rock")) {
            System.out.println("Player Wins!");
        }

        if (UserInput.equals("Rock") && AIInput.equals("Paper")) {
            System.out.println("AI Wins!");
        }
        if (UserInput.equals("Paper") && AIInput.equals("Scissor")) {
            System.out.println("AI Wins!");
        }

        if (UserInput.equals("Scissor") && AIInput.equals("Rock")) {
            System.out.println("AI Wins!");
        }

        if (UserInput.equals("Rock") && AIInput.equals("Rock")) {
            System.out.println("Nobody Wins!");
        }

        if (UserInput.equals("Paper") && AIInput.equals("Paper")) {
            System.out.println("Nobody Wins!");
        }

        if (UserInput.equals("Scissor") && AIInput.equals("Scissor")) {
            System.out.println("Nobody Wins!");
        }
    }
}
