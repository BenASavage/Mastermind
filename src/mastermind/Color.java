package mastermind;

import java.util.Random;

/**
 * Color is an Enum used to represent the colored pegs that make up the codes in Mastermind. The defined colors are:
 * Red, Yellow, Blue, Green, White, and Black.
 * @see Code
 */
public enum Color {
    RED, YELLOW, BLUE, GREEN, WHITE, BLACK;

    /**
     * Provides a random color from the Enum's values.
     * @return a random color
     */
    public static Color getRandomColor() {
        Random rnd = new Random();
        return values()[rnd.nextInt(values().length)];
    }
}
