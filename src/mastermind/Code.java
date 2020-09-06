package mastermind;

import java.util.Arrays;
import java.util.Collections;

/**
 * A Code is a ordered list of 4 Colors.
 */
public class Code {

    private Color[] colors;

    public Code() {
        this.colors = new Color[]{Color.getRandomColor(), Color.getRandomColor(),
                Color.getRandomColor(), Color.getRandomColor()};
    }

    public Code(Color first, Color second, Color third, Color fourth) {
        this.colors = new Color[]{first, second, third, fourth};
    }

    public Code(Color[] colors) {
        if (colors.length == 4) {
            this.colors = colors;
        } else {
            this.colors = new Color[]{Color.getRandomColor(), Color.getRandomColor(),
                    Color.getRandomColor(), Color.getRandomColor()};
        }
    }

    public void setColors(Color[] colors) {
        if (colors.length == 4) {
            this.colors = colors;
        }
    }

    public Color[] getColors() {
        return colors.clone();
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

        for (int i = 0; i < otherColors.length; i++) {
            if (this.colors[i].equals(otherColors[i])) {
               blackPegs++;
               continue;
           }

            if (Arrays.asList(this.colors).contains(otherColors[i])) {
               whitePegs++;
           }
       }

        Color[] feedbackColors = new Color[4];
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

