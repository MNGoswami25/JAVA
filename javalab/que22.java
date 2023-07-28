import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class javaGui{
    javaGui(){
        JFrame f=new JFrame();
        f.setBounds(50,50,300,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField t1=new JTextField("Enter no 1");
        t1.setBounds(30,50,70,30);
        f.add(t1);

        JTextField t2=new JTextField("Enter no 2");
        t2.setBounds(140,50,70,30);
        f.add(t2);

        JLabel l=new JLabel("Result");
        l.setBounds(100,160,50,30);
        f.add(l);

        JButton b1=new JButton("-");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                int x = Integer.parseInt(t1.getText());
                int y = Integer.parseInt(t2.getText());
                System.out.println(x + y);
                l.setText(String.valueOf(x - y));
            }
        });
        b1.setBounds(90,120,50,30);
        f.add(b1);

        
        f.setVisible(true);


    }
    public static void main(String[] args) {
        javaGui obj=new javaGui();
    }
    


}