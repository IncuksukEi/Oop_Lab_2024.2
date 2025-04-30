package hust.soict.hedspi.aims.screen.manager;

import javax.swing.*;
import java.awt.*;

public class AddItemToStoreScreen extends JFrame {
    public AddItemToStoreScreen() {
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        JLabel header = new JLabel("Add Item to Store", JLabel.CENTER);
        header.setFont(new Font(header.getFont().getName(), Font.PLAIN, 30));
        cp.add(header, BorderLayout.NORTH);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 2));

        formPanel.add(new JLabel("Title:"));
        JTextField titleField = new JTextField();
        formPanel.add(titleField);

        formPanel.add(new JLabel("Category:"));
        JTextField categoryField = new JTextField();
        formPanel.add(categoryField);

        formPanel.add(new JLabel("Cost:"));
        JTextField costField = new JTextField();
        formPanel.add(costField);

        JButton addButton = new JButton("Add Item");
        formPanel.add(addButton);

        cp.add(formPanel, BorderLayout.CENTER);

        setTitle("Add Item to Store");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
