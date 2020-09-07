package mastermind;

public class Game {

    private Board board;

    private int turnLimit;


    public Game() {
        this.board = new Board();
        this.turnLimit = 10;
    }

    public Board getBoard() {
        return board;
    }

    public Code getSecretCode() {
        return board.getSecretCode();
    }

    public int input(Code guess) {
        if (guess.equals(board.getSecretCode())) {
            return 1;
        }

        if (board.getGuessHistory().size() < turnLimit-1) {
            board.addGuess(guess);
        } else {
            return 2;
        }

        return 0;
    }

    public void playAgain() {
        board = new Board();
    }


}
