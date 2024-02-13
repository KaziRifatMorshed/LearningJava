package Dice_Games;
import java.util.Random;

public class PairOfDice {
    private int die1; // Represents the value of the first die
    private int die2; // Represents the value of the second die
    private Random random; // Random number generator

    // Constructor to initialize the dice
    public PairOfDice() {
        random = new Random();
        roll(); // Roll the dice when created
    }

    // Method to roll the dice and set their values
    public int roll() {
        die1 = random.nextInt(6) + 1; // Generate a random number between 1 and 6 for the first die
        die2 = random.nextInt(6) + 1; // Generate a random number between 1 and 6 for the second die
        return 0;
    }

    // Getter methods for accessing the values of the dice
    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    // Method to return the sum of the values of the dice
    public int getSum() {
        return die1 + die2;
    }

    // Method to return a string representation of the dice values
    public String toString() {
        return STR."Die 1: \{die1}, Die 2: \{die2}";
    }
}

