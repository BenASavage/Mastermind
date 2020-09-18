package mastermind;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A Code is an immutable ordered list of Colors.
 * Length of code is 4 by default but can be changed with setter
 */
public final class Code {

    private final Color[] colors;
    private int lengthOfCode = 4;

    public Code() {
        this.colors = new Color[this.lengthOfCode];
        this.initializeColors();
    }

    public Code(Color first, Color second, Color third, Color fourth) {
        this.colors = new Color[]{first, second, third, fourth};
    }

    public Code(Color[] colors) {
        if (colors.length == this.lengthOfCode) {
            this.colors = colors;
        } else {
            this.colors = new Color[this.lengthOfCode];
            this.initializeColors();
        }
    }

    public Color[] getColors() {
        return colors.clone();
    }

    /**
     * Adds random colors to code array
     */
    private void initializeColors(){
        for (int i = 0; i < this.colors.length; i++) {
            this.colors[i] = Color.getRandomColor();
            //this is for testing end game condition
            System.out.println(this.colors[i]);
        }
    }

    public void setLengthOfCode(int lengthOfCode) {
        this.lengthOfCode = lengthOfCode;
    }

    @Override
    public String toString() {
        return Arrays.toString(colors);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Code code1 = (Code) o;
        return Arrays.equals(colors, code1.colors);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(colors);
    }

    public Code getFeedback(Code other) {
        Color[] otherColors = other.getColors();
        int blackPegs = 0;
        int whitePegs = 0;

        ArrayList<Color> colorArrayList = new ArrayList<>(Arrays.asList(this.colors));

        for (int i = 0; i < otherColors.length; i++) {
            if (this.colors[i].equals(otherColors[i])) {
                blackPegs++;
                colorArrayList.remove(otherColors[i]);
            }
        }
        for (Color el : colorArrayList) {
            if (Arrays.asList(otherColors).contains(el)) {
                whitePegs++;
            }
        }

        Color[] feedbackColors = new Color[this.lengthOfCode];
        int step = 0;
        for (int i = 0; i < blackPegs; i++) {
            feedbackColors[step] = Color.BLACK;
            step++;
        }
        for (int i = 0; i < whitePegs; i++) {
            feedbackColors[step] = Color.WHITE;
            step++;
        }

        return new Code(feedbackColors);
   }
}

