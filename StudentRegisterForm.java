import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentRegisterForm extends JFrame implements ActionListener {
    JLabel register,stid,stnm,stph,stdp,stc,steml,stfather,stmother,staddress,password;
    JTextField tid,tnm,tphn,tdp,tc,teml,tfthr,tmtr,pswd;
    JButton login,exit,clear;

    JTextArea tadd;
    StudentRegisterForm(){
        setTitle("Register yourself");
        register=new JLabel("Registration Form");
        register.setOpaque(true);
        register.setBackground(Color.YELLOW);
        register.setBounds(0,6,700,55);
        register.setFont(new Font("Arial",Font.BOLD,40));
        register.setForeground(Color.BLACK);
        register.setHorizontalAlignment(SwingConstants.CENTER); // Align text to center horizontally
        // If you need to align text vertically to the center as well
        register.setVerticalAlignment(SwingConstants.CENTER);
        add(register);

        stid=new JLabel("Student ID");
        stid.setBounds(25,100,100,20);
        stid.setFont(new Font("Arial",Font.BOLD,19));
        stid.setForeground(Color.BLACK);
        add(stid);

        stnm=new JLabel("Student Name");
        stnm.setBounds(25,150,150,20);
        stnm.setFont(new Font("Arial",Font.BOLD,19));
        stnm.setForeground(Color.BLACK);
        add(stnm);

        stph=new JLabel("Phone Number");
        stph.setBounds(25,200,150,20);
        stph.setFont(new Font("Arial",Font.BOLD,19));
        stph.setForeground(Color.BLACK);
        add(stph);

        stdp=new JLabel("Department");
        stdp.setBounds(25,250,150,20);
        stdp.setForeground(Color.BLACK);
        stdp.setFont(new Font("Arial",Font.BOLD,19));
        add(stdp);

        stc=new JLabel("City");
        stc.setBounds(25,300,150,20);
        stc.setFont(new Font("Arial",Font.BOLD,19));
        stc.setForeground(Color.BLACK);
        add(stc);

        steml=new JLabel("Email Address");
        steml.setBounds(25,350,150,20);
        steml.setForeground(Color.BLACK);
        steml.setFont(new Font("Arial",Font.BOLD,19));
        add(steml);

        stfather=new JLabel("Father Name");
        stfather.setBounds(25,400,150,20);
        stfather.setForeground(Color.BLACK);
        stfather.setFont(new Font("Arial",Font.BOLD,19));
        add(stfather);

        stmother=new JLabel("Mother Name");
        stmother.setBounds(25,450,150,20);
        stmother.setFont(new Font("Arial",Font.BOLD,19));
        stmother.setForeground(Color.BLACK);
        add(stmother);

        staddress=new JLabel("Address");
        staddress.setBounds(25,500,150,20);
        staddress.setFont(new Font("Arial",Font.BOLD,19));
        staddress.setForeground(Color.BLACK);
        add(staddress);

        password = new JLabel("Enter Password");
        password.setBounds(25,600,150,20);
        password.setFont(new Font("Arial",Font.BOLD,19));
        password.setForeground(Color.BLACK);
        add(password);


        tid=new JTextField();
        tid.setBounds(200,100,330,25);
        tid.setFont(new Font("Arial",Font.PLAIN,17));
//        tid.setBorder(border);
        add(tid);

        tnm=new JTextField();
        tnm.setBounds(200,150,330,25);
        tnm.setFont(new Font("Arial",Font.PLAIN,17));
//        tid.setBorder(border);
        add(tnm);

        tphn=new JTextField();
        tphn.setBounds(200,200,330,25);
        tphn.setFont(new Font("Arial",Font.PLAIN,17));
//        tid.setBorder(border);
        add(tphn);

        tdp=new JTextField();
        tdp.setBounds(200,250,330,25);
        tdp.setFont(new Font("Arial",Font.PLAIN,17));
//        tid.setBorder(border);
        add(tdp);

        tc=new JTextField();
        tc.setBounds(200,300,330,25);
        tc.setFont(new Font("Arial",Font.PLAIN,17));
//        tid.setBorder(border);
        add(tc);

        teml=new JTextField();
        teml.setBounds(200,350,330,25);
        teml.setFont(new Font("Arial",Font.PLAIN,17));
//        tid.setBorder(border);
        add(teml);

        tfthr=new JTextField();
        tfthr.setBounds(200,400,330,25);
        tfthr.setFont(new Font("Arial",Font.PLAIN,17));
//        tid.setBorder(border);
        add(tfthr);

        tmtr=new JTextField();
        tmtr.setBounds(200,450,330,25);
        tmtr.setFont(new Font("Arial",Font.PLAIN,17));
//        tid.setBorder(border);
        add(tmtr);

        tadd=new JTextArea();
        tadd.setBounds(200,500,330,70);
        tadd.setFont(new Font("Arial",Font.PLAIN,17));
//        tid.setBorder(border);
        add(tadd);

        pswd=new JTextField();
        pswd.setBounds(200,600,330,25);
        pswd.setFont(new Font("Arial",Font.PLAIN,17));
//        tid.setBorder(border);
        add(pswd);


        login=new JButton("Sign In");
        login.setBounds(200,650,120,40);
        login.setBackground(Color.BLUE);
        login.setFont(new Font("Arial",Font.BOLD,20));
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear= new JButton("Clear");
        clear.setBounds(340,650,120,40);
        clear.setFont(new Font("Arial",Font.BOLD,20));
        clear.setForeground(Color.black);
        clear.setBackground(Color.cyan);
        clear.addActionListener(this);
        add(clear);

        exit=new JButton("EXIT");
        exit.setBounds(500,650,120,40);
        exit.setBackground(Color.RED);
        exit.setFont(new Font("Arial",Font.BOLD,20));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);

        setLayout(null);
        setBounds(500,20,700,750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.lightGray);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new StudentRegisterForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String std_id = tid.getText();
        String std_name = tnm.getText();
        String phone_number = tphn.getText();
        String dept = tdp.getText();
        String city = tc.getText();
        String std_email = teml.getText();
        String std_fname = tfthr.getText();
        String std_mname = tmtr.getText();
        String std_add = tadd.getText();
        String loginpswd = pswd.getText();


        if(e.getSource()==login){
            try{
                if(std_id.equals("") || std_name.equals("") || phone_number.equals("") ||dept.equals("")
                || dept.equals("") || city.equals("") || std_email.equals("") || std_fname.equals("")
                || std_mname.equals("") || std_add.equals("") || loginpswd.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"All Fields are required");
                }
                else{
                    Conn c= new Conn();
                    String query="insert into studentdetails values('"+std_id+"','"+std_name+"', '"+phone_number+"','"+dept+"','"+city+"','"+std_email+"','"+std_fname+"','"+std_mname+"','"+std_add+"','"+loginpswd+"')";
                    c.s.executeUpdate(query);
                    setVisible(false);
                    new Login().setVisible(true);
                }
            }catch(Exception ae){
                System.out.println(ae);
            }
        }
        else if(e.getSource()==clear){
            //tid,tnm,tphn,tdp,tc,teml,tfthr,tmtr,tadd,pswd;

            tid.setText("");
            tnm.setText("");
            tphn.setText("");
            tdp.setText("");
            tc.setText("");
            teml.setText("");
            tfthr.setText("");
            tmtr.setText("");
            tadd.setText("");
            pswd.setText("");
        }
        else if(e.getSource()==exit){
            System.exit(0);
        }

    }
}