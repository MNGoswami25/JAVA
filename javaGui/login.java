import javax.swing.*;
import java.awt.event.*;




class login{
   

    login(){
        //FRAME
        JFrame f=new JFrame();
        f.setBounds(50,50,500,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       //First field
       JTextField tf1=new JTextField("Enter your name");
       tf1.setBounds(175,50,150,50);
       f.add(tf1);

       //Second field
       JTextField tf2=new JTextField("Enter Password");
       tf2.setBounds(175,120,150,50);
       f.add(tf2);
       
       //Label
       JLabel l1=new JLabel("Click here to login");
       l1.setBounds(50,200,200,30);
       f.add(l1);

       //Button
       JButton b1=new JButton("LOGIN");
       b1.setBounds(200,200,80,50);
       f.add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                
                System.out.println("Login Succesful");
                l1.setText("Login Successful");
            }
        });

        f.setVisible(true);
    }
    

}
    class log{
        public static void main(String[] args) {
            login obj=new login();
}
}