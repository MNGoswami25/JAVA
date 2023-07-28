import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 
class myframe{
    myframe(){
        JFrame j=new JFrame();
        j.setBounds(50,50,500,500);
        j.setLayout(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField t1=new JTextField("Enter np 1");
        t1.setBounds(50,50,150,50);
        j.add(t1);

        JTextField t2=new JTextField("Enter no 2");
        t2.setBounds(250,50,150,50);
        j.add(t2);
        
        JLabel l1=new JLabel("Result");
        l1.setBounds(200,180,200,50);
        j.add(l1);

        JButton b1= new JButton("Submit");
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{int x=Integer.parseInt(t1.getText());
                int y=Integer.parseInt(t2.getText());
                l1.setText(String.valueOf((x*x)-(y*y)));

            }
            catch(NumberFormatException h){
                l1.setText("Enter Numbers");
            }
        }
        });
        b1.setBounds(180,120,150,50);
        j.add(b1);

        j.setVisible(true);
    }
    public static void main(String[] args) {
            myframe obj=new myframe();
        }

    
    
}