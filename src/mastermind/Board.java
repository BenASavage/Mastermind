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

    public Board() {
        secretCode = new Code();
        guessHistory = new ArrayList<>();
        feedbackHistory = new ArrayList<>();
    }

    public void addGuess(Code guess) {
        guessHistory.add(guess);
        feedbackHistory.add(secretCode.getFeedback(guess));
    }

    public Code getSecretCode() {
        return secretCode;
    }

    public ArrayList<Code> getGuessHistory() {
        return guessHistory;
    }

    public ArrayList<Code> getFeedbackHistory() {
        return feedbackHistory;
    }
}
