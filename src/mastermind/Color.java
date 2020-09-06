package mastermind;

import java.util.Random;

public enum Color {
    RED, YELLOW, BLUE, GREEN, WHITE, BLACK;

    public static Color getRandomColor() {
        Random rnd = new Random();
        return values()[rnd.nextInt(values().length)];
    }
}
