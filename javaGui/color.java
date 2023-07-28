import javax.swing.*;
import java.awt.*;
import java.awt.Color;
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
        JLabel l1=new JLabel("Hello");
        l1.setBounds(50,50,130,20);
        f.add(l1);

        JButton b=new JButton("click");
        b.setBounds(50,100,130,20);
        f.add(b);

        b.addMouseListener(new MouseListener() {
            public void mouseEntered(MouseEvent e){
                b.setBackground(Color.RED);
            }
            public void mouseExited(MouseEvent e) {
                b.setBackground(Color.WHITE);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
            } 
        });
        f.setVisible(true);
    }
}
class second{
    public static void main(String[] args) {
        new myframe();
    }
}
