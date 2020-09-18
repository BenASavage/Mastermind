package mastermind;

/**
 * Game is the logical representation of a game of Mastermind. Game holds a Board and handles the control flow of the
 * program.
 * @see Board
 */
public class Game {

    private Board board;
    private int guessesAllowed;
    private int lengthOfCode;

    public Game(int guessesAllowed, int lengthOfCode) {
        this.board = new Board(lengthOfCode);
        this.guessesAllowed = guessesAllowed;
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
        return checkEndGameCondition(guess);
    }

    /**
     * Will return 1 to end game due to guess matching secret code
     * returns 2 if max guesses reached
     * returns 0 if no end game condition met
     *
     * @param guess
     * @return
     */
    public int checkEndGameCondition(Code guess){
        if (guess.equals(board.getSecretCode())) {
            return 1;
        }
        else if (board.getGuessHistory().size() > guessesAllowed - 1) {
            return 2;
        } else {
            return 0;
        }
    }

    public void playAgain() {
        board = new Board(lengthOfCode);
    }


}
