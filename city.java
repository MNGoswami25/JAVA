import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CityListGUI {

    public CityListGUI() {
        
        JFrame j=new JFrame();
        j.setTitle("City List");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(300, 200);
        j.setLayout(null);

        // Create the components
        JTextField t= new JTextField();
        JButton addButton = new JButton("Add");
        JButton exitButton = new JButton("Exit");
        DefaultListModel listModel = new DefaultListModel<>();
        JList<String> cityList = new JList<>(listModel);

        // Set the layout manager
        setLayout(new BorderLayout());

        // Create a panel for the text field and add button
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(textField, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        // Add components to the JFrame
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(cityList), BorderLayout.CENTER);
        add(exitButton, BorderLayout.SOUTH);

        // Add button event handler
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cityName = textField.getText();
                if (!cityName.isEmpty()) {
                    listModel.addElement(cityName);
                    textField.setText("");
                }
            }
        });

        // Exit button event handler
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CityListGUI cityListGUI = new CityListGUI();
                cityListGUI.setVisible(true);
            }
        });
    }
}
