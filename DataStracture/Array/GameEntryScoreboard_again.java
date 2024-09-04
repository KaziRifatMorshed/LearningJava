package DataStracture.Array;

import java.util.Scanner;

class GameEntry {
    private String name;
    private int score;

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return STR."Name: \{this.name},\tScored \{this.score}";
    }
}

class ScoreBoard {
    private int numEntry = 0;
    private GameEntry[] board;

    public ScoreBoard(int numEntry) {
//        this.numEntry = numEntry; shit man !!!!
        board = new GameEntry[numEntry];
    }

    void add_to_board(GameEntry e) {
        int newScore = e.getScore();
        if (numEntry < board.length || newScore > board[numEntry - 1].getScore()) {
            if (numEntry < board.length) {
                this.numEntry++;
            }
            int j = numEntry - 1;
            for (; j > 0 && board[j - 1].getScore() < newScore; j--) {
                board[j] = board[j - 1];
            }
            board[j] = e;
        }
    }

    GameEntry remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > board.length) {
            throw new IndexOutOfBoundsException(STR."Invalid Index \{index} has been inputted");
        }
        GameEntry to_bre_returned = board[index];
        int i = index;
        for (; i < numEntry - 1; i++) { // j < numEntries - 1
            board[i] = board[i + 1];
        }
        board[numEntry - 1] = null;
        numEntry--;
        return to_bre_returned;
    }

    void Hall_of_fame() {
        System.out.println("Scoreboard: ");
        for (int i = 0; i < numEntry; i++) {
            System.out.println(STR."\{i + 1}. \{board[i]}");
        }
        System.out.println();
    }

    // Task: Write a program to add a player (name and score) to a scoreboard. Your program will take a player’s name and
    // score as input and decide whether to add it to the scoreboard or not. A player is added to the scoreboard, if his/her score
    // is in top 3. The scoreboard always contains top 3 players. Keep the scoreboard in an array.
    public static void main(String[] args) {
        ScoreBoard board = new ScoreBoard(3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game Start");

        while (true) {
            System.out.println("Enter name (without space) and score (enter over to stop the game): ");
            String name = scanner.next(); // Do Not Use next()
            if (name.equals("over")) {
                System.out.println("Game Over");
                break;
            }
            int score = scanner.nextInt();
            GameEntry n = new GameEntry(name, score);
            board.add_to_board(n);
            board.Hall_of_fame();
        }
    }
}