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

    /**
     * Adds the inputted guess to the board's guess history and evaluates if the game state changes. Returns 1 if
     * the game is won, as defined by the guess code being the same as the secret code. Returns 2 if the game is lost
     * based on the turn limit, this is done by checking the guess history size. Returns 0 is the game state is unchanged.
     * @param guess provided code to be passed to the board's guess history and evaluated against the secret code.
     * @return int representation of the game state
     */
    public int input(Code guess) {
        board.addGuess(guess);
        if (guess.equals(board.getSecretCode())) {
            return 1;
        }
        else if (board.getGuessHistory().size() > 9) {
            return 2;
        } else {
            return 0;
        }

    }

    public void playAgain() {
        board = new Board();
    }


}
