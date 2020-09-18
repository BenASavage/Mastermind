package mastermind;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * GUI creates the visual representation of a game of Mastermind. It handles input and receives data to display through
 * a Game object which is created with the GUI.
 *
 * @see Game
 */
public class GUI {

    private Game game;
    private int guessesAllowed = 10;
    private int lengthOfCode = 4;
    private JButton guessButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JPanel boardPanel;
    private JPanel inputPanel;
    private JPanel boxesPanel;
    private JPanel panel1;
    private JPanel guessPanel;
    private JPanel feedbackPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mastermind");
        frame.setContentPane(new GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(30, 30, 30, 30), 30, 30));
        panel1.setBackground(new java.awt.Color(-1));
        panel1.setForeground(new java.awt.Color(-16777216));
        panel1.setOpaque(true);
        panel1.setPreferredSize(new Dimension(700, 700));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(15, 15, 15, 15), -1, -1));
        panel2.setBackground(new java.awt.Color(-4604738));
        panel2.setOpaque(true);
        panel2.setPreferredSize(new Dimension(700, 700));
        panel1.add(panel2, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        boardPanel = new JPanel();
        boardPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        boardPanel.setBackground(new java.awt.Color(-4275773));
        boardPanel.setOpaque(false);
        panel2.add(boardPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        guessPanel.setAutoscrolls(false);
        guessPanel.setBackground(new java.awt.Color(-3618616));
        guessPanel.setOpaque(true);
        boardPanel.add(guessPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        feedbackPanel.setBackground(new java.awt.Color(-3618616));
        feedbackPanel.setOpaque(true);
        boardPanel.add(feedbackPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        inputPanel = new JPanel();
        inputPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        inputPanel.setBackground(new java.awt.Color(-4604738));
        inputPanel.setOpaque(false);
        panel2.add(inputPanel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        boxesPanel = new JPanel();
        boxesPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 4, new Insets(0, 0, 0, 0), -1, -1));
        boxesPanel.setOpaque(false);
        inputPanel.add(boxesPanel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        comboBox1 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("RED");
        defaultComboBoxModel1.addElement("YELLOW");
        defaultComboBoxModel1.addElement("BLUE");
        defaultComboBoxModel1.addElement("GREEN");
        defaultComboBoxModel1.addElement("WHITE");
        defaultComboBoxModel1.addElement("BLACK");
        comboBox1.setModel(defaultComboBoxModel1);
        boxesPanel.add(comboBox1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        comboBox2 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addElement("RED");
        defaultComboBoxModel2.addElement("YELLOW");
        defaultComboBoxModel2.addElement("BLUE");
        defaultComboBoxModel2.addElement("GREEN");
        defaultComboBoxModel2.addElement("WHITE");
        defaultComboBoxModel2.addElement("BLACK");
        comboBox2.setModel(defaultComboBoxModel2);
        boxesPanel.add(comboBox2, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        comboBox3 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel3 = new DefaultComboBoxModel();
        defaultComboBoxModel3.addElement("RED");
        defaultComboBoxModel3.addElement("YELLOW");
        defaultComboBoxModel3.addElement("BLUE");
        defaultComboBoxModel3.addElement("GREEN");
        defaultComboBoxModel3.addElement("WHITE");
        defaultComboBoxModel3.addElement("BLACK");
        comboBox3.setModel(defaultComboBoxModel3);
        boxesPanel.add(comboBox3, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        comboBox4 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel4 = new DefaultComboBoxModel();
        defaultComboBoxModel4.addElement("RED");
        defaultComboBoxModel4.addElement("YELLOW");
        defaultComboBoxModel4.addElement("BLUE");
        defaultComboBoxModel4.addElement("GREEN");
        defaultComboBoxModel4.addElement("WHITE");
        defaultComboBoxModel4.addElement("BLACK");
        comboBox4.setModel(defaultComboBoxModel4);
        boxesPanel.add(comboBox4, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        guessButton.setText("Guess");
        inputPanel.add(guessButton, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

    /**
     * Displays a JOptionPane that tells the user if they have won or lost, the secret code, and asks them if they would
     * like to play again. If the user selects yes then a new board is created and displayed.
     *
     * @param state the title and first line of the message
     * @see #createBoard()
     * @see Game#playAgain()
     */
    private void message(String state) {
        String message = state + "\nThe code was: " + game.getSecretCode() + "\n Would you like to play again?";
        int input = JOptionPane.showConfirmDialog(panel1, message, state, JOptionPane.YES_NO_OPTION);
        if (input == JOptionPane.YES_OPTION) {
            game.playAgain();
            createBoard();
        } else {
            System.exit(0);
        }
    }


    /**
     * Establishes the default look for the guess and feedback sections of the board.
     * First it removes all components from both panels. Then it fills the panels with 10 sub panels, they themselves
     * containing four neutrally-colored inactive buttons each to represent the peg slots.
     *
     * @see #updateGuessLine(int)
     */
    public void createBoard() {
        clearBoard();
        createGuessLines();
        createFeedbackLines();
    }

    /**
     * Updates a line of the display of the board from the logical board's history. A line being defined as both the
     * panels at the specified index for the guessPanel container and the feedbackPanel container. The line is updated
     * by changing the color of the buttons to match their respective colors in the logical board's respective histories.
     *
     * @param line index of the components to be updated/the turn in the game's history
     * @see #createBoard()
     * @see Board#getGuessHistory()
     * @see Board#getFeedbackHistory()
     */
    private void updateGuessLine(int line) {
        JPanel currentTurnGuess = (JPanel) guessPanel.getComponent(line);
        Component[] buttonsGuess = currentTurnGuess.getComponents();

        for (int i = 0; i < buttonsGuess.length; i++) {
            //Using reflection to convert our Color into awt.Color. This part was primarily learned from StackOverflow
            java.awt.Color color;
            try {
                Field field = Class.forName("java.awt.Color").getField(
                        game.getBoard().getGuessHistory().get(line).getColors()[i].toString());
                color = (java.awt.Color) field.get(null);
            } catch (Exception e) {
                //In the event of a null pointer exception the color stays the same. Mostly important during the feedback
                color = buttonsGuess[i].getBackground();
            }

            buttonsGuess[i].setBackground(color);
        }

        updateFeedbackLine(line);
    }

    private void updateFeedbackLine(int line) {
        JPanel currentTurnFeedback = (JPanel) feedbackPanel.getComponent(line);
        Component[] buttonsFeedback = currentTurnFeedback.getComponents();

        for (int i = 0; i < buttonsFeedback.length; i++) {
            java.awt.Color color;
            try {
                Field field = Class.forName("java.awt.Color").getField(
                        game.getBoard().getFeedbackHistory().get(line).getColors()[i].toString());
                color = (java.awt.Color) field.get(null);
            } catch (Exception e) {
                //This represents an empty peg by not changing the color of the button
                color = buttonsFeedback[i].getBackground();
            }
            buttonsFeedback[i].setBackground(color);
        }
    }

    private void createUIComponents() {
        game = new Game(guessesAllowed, lengthOfCode);

        guessPanel = new JPanel(new GridLayout(guessesAllowed, 1, 0, 10));
        feedbackPanel = new JPanel(new GridLayout(guessesAllowed, 1, 0, 10));
        createBoard();

        //This listener pulls the values from the 4 comboBoxes and constructs a Code from them
        //then inputs that to the game and if the game returns a win or lose state then the end of the game is triggered
        guessButton = new JButton("Guess");
        guessButton.addActionListener(e -> {
            Color[] colors = new Color[]{Color.valueOf(comboBox1.getSelectedItem().toString()),
                    Color.valueOf(comboBox2.getSelectedItem().toString()),
                    Color.valueOf(comboBox3.getSelectedItem().toString()),
                    Color.valueOf(comboBox4.getSelectedItem().toString())};

            int state = game.input(new Code(colors));

            updateGuessLine(game.getBoard().getGuessHistory().size() - 1);

            switch (state) {
                case 1:
                    message("You Win!");
                case 2:
                    message("You Lose.");
            }
        });
    }

    private void clearBoard() {
        guessPanel.removeAll();
        feedbackPanel.removeAll();
        guessPanel.revalidate();
        feedbackPanel.revalidate();
    }

    private void createGuessLines() {
        ArrayList<JPanel> guessLines = new ArrayList<>();
        for (int i = 0; i < guessesAllowed; i++) {
            guessLines.add(new JPanel(new GridLayout(1, lengthOfCode, 20, 5)));
        }
        for (JPanel el : guessLines) {
            for (int i = 0; i < lengthOfCode; i++) {
                Button button = new Button();
                button.setFocusable(false);
                button.setEnabled(false);
                button.setBackground(java.awt.Color.lightGray);
                el.add(button);
            }
            guessPanel.add(el);
        }
    }

    private void createFeedbackLines() {
        ArrayList<JPanel> feedbackLines = new ArrayList<>();
        for (int i = 0; i < guessesAllowed; i++) {
            feedbackLines.add(new JPanel(new GridLayout(2, 2, 5, 5)));
        }
        for (JPanel el : feedbackLines) {
            for (int i = 0; i < lengthOfCode; i++) {
                Button button = new Button();
                button.setFocusable(false);
                button.setEnabled(false);
                button.setBackground(java.awt.Color.lightGray);
                el.add(button);
            }
            feedbackPanel.add(el);
        }
    }
}
