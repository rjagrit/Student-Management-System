import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupStudent extends JFrame implements ActionListener
{
    SignupStudent(){
        setLayout(null);
        setTitle("Sign Up Student");
        getContentPane().setBackground(Color.lightGray); // change frame color

        setSize(600, 600); //frame size
        setVisible(true); //make frame visible
        setLocation(400, 110); //frame location
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new SignupStudent();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
