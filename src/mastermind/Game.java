package mastermind;

public class Game {

    private Board board;

    public Game() {
        this.board = new Board();
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

        if (board.getGuessHistory().size() < 9) {
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
