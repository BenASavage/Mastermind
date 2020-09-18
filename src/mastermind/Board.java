package mastermind;

import java.util.ArrayList;

/**
 * Board is the logical representation of the board area of a game of Mastermind. Board contains a secret code which is
 * randomly generated and the history of the guesses and corresponding feedbacks.
 */
public class Board {

    private final Code secretCode;

    private ArrayList<Code> guessHistory;

    private ArrayList<Code> feedbackHistory;

    private int lengthOfCode;

    public Board(int lengthOfCode) {
        this.lengthOfCode = lengthOfCode;
        this.guessHistory = new ArrayList<>();
        this.feedbackHistory = new ArrayList<>();
        this.secretCode = new Code();
    }

    public void addGuess(Code guess) {
        this.guessHistory.add(guess);
        this.feedbackHistory.add(this.secretCode.getFeedback(guess));
    }

    public Code getSecretCode() {
        return this.secretCode;
    }

    public ArrayList<Code> getGuessHistory() {
        return this.guessHistory;
    }

    public ArrayList<Code> getFeedbackHistory() {
        return this.feedbackHistory;
    }
}
