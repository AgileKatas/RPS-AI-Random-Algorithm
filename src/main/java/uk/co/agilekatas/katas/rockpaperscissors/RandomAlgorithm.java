package uk.co.agilekatas.katas.rockpaperscissors;

import java.util.Random;

public class RandomAlgorithm {

    private Random random;

    public RandomAlgorithm(Random random) {
        this.random = random;
    }

    public String generateMove() {
        int move = random.nextInt(3);
        switch (move) {
            case 0:
                return "Rock";
            case 1:
                return "Scissors";
            case 2:
                return "Paper";
            default:
                return null;
        }
    }

}
