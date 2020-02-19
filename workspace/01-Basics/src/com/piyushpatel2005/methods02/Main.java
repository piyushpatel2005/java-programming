package com.piyushpatel2005.methods02;

public class Main {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("My name", highScorePosition);

        highScorePosition = calculateHighScorePosition(800);
        displayHighScorePosition("Bob", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore > 1000) return 1;
//        else if (playerScore > 500) return 2;
//        else if (playerScore > 100) return 3;
//        else return 4;
        int position = 4;
        if (playerScore > 1000) position = 1;
        else if (playerScore > 500) position = 2;
        else if (playerScore > 100) position = 3;
        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

}
