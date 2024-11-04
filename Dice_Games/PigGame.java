package Dice_Games;
import java.util.Random;

public class PigGame {
    private PairOfDice dice;
    private int playerScore;
    private int computerScore;
    private Random random;

    // Constructor to initialize the game
    public PigGame() {
        dice = new PairOfDice();
        playerScore = 0;
        computerScore = 0;
        random = new Random();
    }

    // Method to play the game
    public void play() {
        System.out.println("Welcome to the game of Pig!");
        System.out.println("You are playing against the computer.");

        while (playerScore < 100 && computerScore < 100) {
            System.out.println("\nYour turn:");
            int roundPoints = takeTurn(true); // Player's turn
            playerScore += roundPoints;
            if (playerScore >= 100) {
                System.out.println("Congratulations! You win!");
                break;
            }
            System.out.println("Your score: " + playerScore);

            System.out.println("\nComputer's turn:");
            roundPoints = takeTurn(false); // Computer's turn
            computerScore += roundPoints;
            if (computerScore >= 100) {
                System.out.println("Computer wins. Better luck next time!");
                break;
            }
            System.out.println("Computer's score: " + computerScore);
        }
    }

    // Method to simulate a turn for a player (either human or computer)
    private int takeTurn(boolean isPlayer) {
        int roundPoints = 0;
        boolean rollAgain = true;

        while (rollAgain) {
            int die1 = dice.roll();
            int die2 = dice.roll();

            if (die1 == 1 && die2 == 1) { // If rolled two 1s
                roundPoints = 0;
                System.out.println("Rolled two 1s! Lose all points for this round.");
                break;
            } else if (die1 == 1 || die2 == 1) { // If rolled a single 1
                roundPoints = 0;
                System.out.println("Rolled a 1. Lose all points for this round.");
                break;
            } else { // Otherwise, add the sum of the dice to round points
                roundPoints += die1 + die2;
                System.out.println("You rolled: " + die1 + " and " + die2);

                // If computer player, decide whether to roll again
                if (!isPlayer && roundPoints >= 20) {
                    System.out.println("Computer chooses to hold.");
                    break;
                }

                // If human player, ask if they want to roll again
                if (isPlayer) {
                    rollAgain = askPlayerRollAgain();
                } else {
                    rollAgain = random.nextBoolean();
                }
            }
        }
        return roundPoints;
    }

    // Method to ask the human player if they want to roll again
    private boolean askPlayerRollAgain() {
        System.out.print("Do you want to roll again? (y/n): ");
        char choice = Character.toLowerCase(System.console().readLine().charAt(0));
        return choice == 'y';
    }

    public static void main(String[] args) {
        PigGame game = new PigGame();
        game.play();
    }
}
