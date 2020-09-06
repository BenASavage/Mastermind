package mastermind;

public class Game {

    private Board board;

    private int turnLimit;

    private Code secretCode;

    public Game() {
        this.board = new Board();
        this.turnLimit = 10;
        this.secretCode = board.getSecretCode();
    }

    public Board getBoard() {
        return board;
    }

    public Code getSecretCode() {
        return secretCode;
    }

    public int input(Code guess) {
        if (guess.equals(secretCode)) {
            return 1;
        }

        if (board.getGuessHistory().size() < turnLimit-1) {
            board.addGuess(guess);
        } else {
            return 2;
        }

        return 0;
    }


}
