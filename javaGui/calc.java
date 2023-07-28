import javax.swing.*;
import java.awt.LayoutManager;
import java.awt.event.*;


class myframe{
    private static final LayoutManager NULL = null;

    myframe(){
        //FRAME 
        JFrame f=new JFrame();
        f.setBounds(50,50,500,500);
        f.setLayout(NULL);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //First field
        JTextField tf1=new JTextField("Enter NO 1");
        tf1.setBounds(50,50,150,50);
        f.add(tf1);

        //Second Field
        JTextField tf2=new JTextField("Enter NO 2");
        tf2.setBounds(250,50,150,50);
        f.add(tf2);
        
        //label
        JLabel l1=new JLabel("Result");
        l1.setBounds(200,180,200,50);
        f.add(l1);
        
        //First Button
        JButton b1=new JButton("+");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                int x = Integer.parseInt(tf1.getText());
                int y = Integer.parseInt(tf2.getText());
                System.out.println(x + y);
                l1.setText(String.valueOf(x + y));
            }
        });
        b1.setBounds(100,120,50,50);
        f.add(b1);
        
         //second Button
         JButton b2=new JButton("-");
         b2.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ev){
                try{
                    int x=Integer.parseInt(tf1.getText());
                    int y=Integer.parseInt(tf2.getText());
                    System.out.println(x-y);
                    l1.setText(String.valueOf(x - y));
                } 
                catch(NumberFormatException e){
                    l1.setText("Enter Numbers");
                }
                
 
             }
         });
         b2.setBounds(160,120,50,50);
        f.add(b2);


          //Third Button
        JButton b3=new JButton("*");
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                int x=Integer.parseInt(tf1.getText());
                int y=Integer.parseInt(tf2.getText());
                System.out.println(x*y);
                l1.setText(String.valueOf(x * y));

            }
        });

        b3.setBounds(220,120,50,50);
        f.add(b3);

         //forth Button
         JButton b4=new JButton("/");
         b4.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ev){
                 int x=Integer.parseInt(tf1.getText());
                 int y=Integer.parseInt(tf2.getText());
                 System.out.println(x/y);
                 l1.setText(String.valueOf(x / y));
 
             }
         });
         b4.setBounds(280,120,50,50);
        f.add(b4);


        f.setVisible(true);
        }
    
}
class first{
    public static void main(String[] args) {
        myframe obj=new myframe();
    }
}
