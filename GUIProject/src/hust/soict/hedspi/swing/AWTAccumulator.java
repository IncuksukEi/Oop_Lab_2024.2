package hust.soict.hedspi.swing;

import java.awt.*;
import java.awt.event.*;

public class AWTAccumulator extends Frame {
    private TextField tfInput;
    private TextField tfOutput;
    private int sum = 0;

    public AWTAccumulator() {
        setLayout(new GridLayout(2, 2));

        add(new Label("Enter an Integer: ")); // Line 15

        tfInput = new TextField(10);          // Lines 17-19
        add(tfInput);
        tfInput.addActionListener(new TFInputListener());

        add(new Label("The Accumulated Sum is: ")); // Line 21

        tfOutput = new TextField(10);               // Lines 23–25
        tfOutput.setEditable(false);
        add(tfOutput);

        setTitle("AWT Accumulator");   // Line 27
        setSize(350, 120);             // Line 28
        setVisible(true);              // Line 29
    }

    private class TFInputListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");
            tfOutput.setText(sum + "");
        }
    }

    public static void main(String[] args) {
        new AWTAccumulator();  // Main method
    }
}
