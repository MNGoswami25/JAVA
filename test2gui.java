import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class EventDelegationExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Delegation Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        JLabel label = new JLabel("Press a button");

        // Attach the action listener to the parent container
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the event based on the button pressed
                if (e.getSource() == button1) {
                    label.setText("Button 1 was pressed.");
                    // Handle button 1 event here
                } else if (e.getSource() == button2) {
                    label.setText("Button 2 was pressed.");
                    // Handle button 2 event here
                }
            }
        };

        // Attach the action listener to both buttons
        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);

        frame.add(button1);
        frame.add(button2);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
