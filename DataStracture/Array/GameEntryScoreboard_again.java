package DataStracture.Array;

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
        return STR."(Player \{this.name} has scored \{this.score})";
    }
}

class ScoreBoard {
    private int numEntry = 0;
    private GameEntry[] board;

    public ScoreBoard(int numEntry) {
        this.numEntry = numEntry;
        board = new GameEntry[this.numEntry];
    }

    void add_to_board(GameEntry e) {
        int newScore = e.getScore();
        if (numEntry < board.length || board[numEntry - 1].getScore() < newScore) {
            if (numEntry < board.length) {
                this.numEntry++;
                int j = numEntry - 1;
                for (; j > 0 && board[j - 1].getScore() < newScore; j--) {
                    board[j] = board[j - 1];
                }
                board[j] = e;
            }
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
}