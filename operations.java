import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class operations extends JFrame implements ActionListener
{
    JLabel heading,op1,op2,op3,op4,op5,op6;
    JButton add,edit,delete,search,display,exit,clear;
    operations(){
        setLayout(null);
        setTitle("Operations");
        getContentPane().setBackground(Color.lightGray); // change frame color

        heading = new JLabel("You can do Following Operations  :");
        heading.setBounds(10,-10,450,60);
        heading.setFont(new Font("Arial",Font.BOLD,20));
        add(heading);

        op1 = new JLabel("1. Add New Student");
        op1.setBounds(10,40,300,20);
        op1.setFont(new Font("Arial",Font.BOLD,15));
        add(op1);

        op2 = new JLabel("2. Edit Details of New Student");
        op2.setBounds(10,70,300,20);
        op2.setFont(new Font("Arial",Font.BOLD,15));
        add(op2);

        op3 = new JLabel("3. Delete Student from Database");
        op3.setBounds(10,100,300,20);
        op3.setFont(new Font("Arial",Font.BOLD,15));
        add(op3);

        op4 = new JLabel("4. Search Student Details");
        op4.setBounds(10,130,300,20);
        op4.setFont(new Font("Arial",Font.BOLD,15));
        add(op4);

        op5 = new JLabel("5. Display all Student Details");
        op5.setBounds(10,160,300,20);
        op5.setFont(new Font("Arial",Font.BOLD,15));
        add(op5);

        add = new JButton("Add New Student");
        add.setBounds(10,200,190,40);
        add.setFont(new Font("Arial",Font.BOLD,17));
        add.setForeground(Color.BLUE);
        add.setBackground(Color.YELLOW);
        add.addActionListener(this);
        add(add);

        edit = new JButton("Edit Student Details");
        edit.setBounds(210,200,220,40);
        edit.setFont(new Font("Arial",Font.BOLD,17));
        edit.setForeground(Color.black);
        edit.setBackground(Color.ORANGE);
        edit.addActionListener(this);
        add(edit);

        delete= new JButton("Delete the Student");
        delete.setBounds(10,245,190,40);
        delete.setFont(new Font("Arial",Font.BOLD,17));
        delete.setForeground(Color.white);
        delete.setBackground(Color.BLACK);
        delete.addActionListener(this);
        add(delete);

        search = new JButton("Search Student Details");
        search.setBounds(210,245,220,40);
        search.setFont(new Font("Arial",Font.BOLD,17));
        search.setForeground(Color.black);
        search.setBackground(Color.MAGENTA);
        search.addActionListener(this);
        add(search);

        display= new JButton("Display all Student Complete Details");
        display.setBounds(10,290,420,40);
        display.setFont(new Font("Arial",Font.BOLD,17));
        display.setForeground(Color.white);
        display.setBackground(Color.DARK_GRAY);
        display.addActionListener(this);
        add(display);

        exit= new JButton("EXIT");
        exit.setBounds(10,340,420,40);
        exit.setFont(new Font("Arial",Font.BOLD,30));
        exit.setForeground(Color.white);
        exit.setBackground(Color.RED);
        exit.addActionListener(this);
        add(exit);

        setSize(450, 450); //frame size
        setVisible(true); //make frame visible
        setLocation(400, 110); //frame location
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new operations();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            setVisible(false);
            new StudentRegisterForm().setVisible(true);
        }
        else if(e.getSource()==edit){
            setVisible(false);
            new editform().setVisible(true);
        }
        else if(e.getSource()==delete){
            setVisible(false);
            new deleteStudent().setVisible(true);
        }
        else if(e.getSource()==display){
            setVisible(false);
            new displayAllStudents().setVisible(true);
        }
        else if(e.getSource()==search){
            setVisible(false);
            new searchDetails().setVisible(true);
        }
        else if(e.getSource()==exit){
            System.exit(0);
        }

    }
}
