import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener
{
    JLabel heading,backg,l1,l2;
    JTextField idtf;
    JPasswordField pswdtf;

    JButton signin,exit,signup,clear;
    Login(){
        setLayout(null);
        setTitle("Login In");
        getContentPane().setBackground(Color.lightGray); // change frame color

        heading = new JLabel("Student Management System");
        heading.setForeground(Color.RED);
        heading.setBounds(45,10,450,60);
        heading.setFont(new Font("",Font.BOLD,25));
        add(heading);

        l1 = new JLabel("User-Id          :");
        l1.setBounds(55,120,140,20);
        l1.setFont(new Font("Raleway",Font.BOLD,18));
        add(l1);

        idtf = new JTextField();
        idtf.setBounds(210,120,150,25);
        idtf.setFont(new Font("Raleway",Font.PLAIN,15));
        add(idtf);

        l2 = new JLabel("Password     :");
        l2.setBounds(55,180,140,20);
        l2.setFont(new Font("Raleway",Font.BOLD,18));
        add(l2);

        pswdtf = new JPasswordField();
        pswdtf.setBounds(210,180,150,25);
        pswdtf.setFont(new Font("Raleway",Font.PLAIN,15));
        add(pswdtf);

        signin = new JButton("Sign In");
        signin.setBounds(55,250,145,30);
        signin.setFont(new Font("Raleway",Font.BOLD,15));
        signin.setBackground(Color.DARK_GRAY);
        signin.setForeground(Color.WHITE);
        signin.addActionListener(this);
        add(signin);

        clear = new JButton("Clear");
        clear.setBounds(210,250,145,30);
        clear.setFont(new Font("Raleway",Font.BOLD,15));
        clear.setBackground(Color.MAGENTA);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("Sign Up");
        signup.setBounds(55,300,145,30);
        signup.setFont(new Font("Raleway",Font.BOLD,15));
        signup.setBackground(Color.BLUE);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        exit = new JButton("EXIT");
        exit.setBounds(210,300,145,30);
        exit.setFont(new Font("Raleway",Font.BOLD,15));
        exit.setBackground(Color.RED);
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);

        setSize(450, 450); //frame size
        setVisible(true); //make frame visible
        setLocation(500, 150); //frame location
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user_id = idtf.getText();
        String std_name="";
        String phone_number="";
        String dept="";
        String city="";
        String std_email="";
        String std_fname="";
        String std_mname="";
        String std_add="";
        String loginpswd="";

        if(e.getSource()==clear){
            idtf.setText("");
            pswdtf.setText("");
        }
        else if(e.getSource()==exit){
            System.exit(0);
        }
        else if(e.getSource()==signup){
            setVisible(false);
            new SignupStudent().setVisible(true);
        }
        else if(e.getSource()==signin){
            Conn conobj = new Conn();

            if(user_id.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please enter an ID.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String query = "select * from studentdetails where id = '" + user_id + "'";

            try {
                ResultSet resultSet = conobj.s.executeQuery(query);

                //if had some data
                if(resultSet.next()){
                    //fetch data from data base

                    std_name = resultSet.getString(2);
                    phone_number = resultSet.getString(3);
                    dept = resultSet.getString(4);
                    city = resultSet.getString(5);
                    std_email = resultSet.getString(6);
                    std_fname = resultSet.getString(7);
                    std_mname = resultSet.getString(8);
                    std_add = resultSet.getString(9);

                }
                else {
                    JOptionPane.showMessageDialog(this, "No data found for the given ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception ae){
                System.out.println(ae);
            }

            setVisible(false);
            new studentRecord(user_id,std_name,phone_number,dept,city,std_email,std_fname,std_mname,std_add).setVisible(true);
        }
    }
}
