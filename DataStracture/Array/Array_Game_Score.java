package DataStracture;

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
        return STR."Player \{this.name} has scored \{this.score}";
    }
}

class ScoreBoard {
    private int numEntries;
    private GameEntry[] board;

    public ScoreBoard(int numEntries) {
        board = new GameEntry[this.numEntries];
    }

    void add(GameEntry e) {
        int newScore = e.getScore();
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length) {
                this.numEntries++;

                int j = numEntries - 1;
                while (j > 0 && board[j - 1].getScore() < newScore) {
                    board[j] = board[j - 1];
                    j--;
                }
                board[j] = e;
            }
        }
    }

    GameEntry remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= numEntries) {
            throw new IndexOutOfBoundsException(STR."Invalid index \{i}");
        }
        GameEntry temp = board[i];
        for (int j = i; j < numEntries - 1; j++) { // j < numEntries - 1
            board[j] = board[j + 1];
        }
        board[numEntries--] = null;
        return temp;
    }
}

