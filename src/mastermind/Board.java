package mastermind;

import java.util.ArrayList;

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
