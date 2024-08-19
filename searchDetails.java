import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class searchDetails extends JFrame implements ActionListener {
    JLabel register,stid,stnm,stph,stdp,stc,steml,stfather,stmother,staddress,password;
    JTextField tid,tnm,tphn,tdp,tc,teml,tfthr,tmtr,pswd;
    JButton back,exit,confirm;

    JTextArea tadd;
    searchDetails(){
        setTitle("Search the Details");
        register=new JLabel("Registration Form");
        Border border = BorderFactory.createLineBorder(Color.BLACK, 3);
        register.setOpaque(true);
        register.setBackground(Color.BLACK);
        register.setBounds(0,6,700,55);
        register.setFont(new Font("Arial",Font.BOLD,40));
        register.setForeground(Color.YELLOW);
        register.setHorizontalAlignment(SwingConstants.CENTER); // Align text to center horizontally
        // If you need to align text vertically to the center as well
        register.setVerticalAlignment(SwingConstants.CENTER);
        add(register);

        stid=new JLabel("Enter Student ID");
        stid.setBounds(5,100,160,20);
        stid.setFont(new Font("Arial",Font.BOLD,19));
        stid.setForeground(Color.BLACK);
        add(stid);

        confirm=new JButton("Confirm");
        confirm.setBounds(540,100,120,25);
        confirm.setFont(new Font("Arial",Font.BOLD,17));
        confirm.setForeground(Color.BLACK);
        confirm.addActionListener(this);
        add(confirm);

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

        back=new JButton("Back");
        back.setBounds(200,650,120,40);
        back.setBackground(Color.black);
        back.setFont(new Font("Arial",Font.BOLD,20));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        exit=new JButton("EXIT");
        exit.setBounds(350,650,120,40);
        exit.setBackground(Color.RED);
        exit.setFont(new Font("Arial",Font.BOLD,20));
        exit.setForeground(Color.white);
        exit.addActionListener(this);
        add(exit);

        setLayout(null);
        setBounds(500,20,700,750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.gray);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new searchDetails();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String std_id ;
        String std_name;
        String phone_number;
        String dept;
        String city;
        String std_email;
        String std_fname;
        String std_mname;
        String std_add;
        String loginpswd;

        //use Shift+alt+click to multi select

        if(e.getSource()==confirm){
            std_id = tid.getText();
            Conn conobj = new Conn();

            if(std_id.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please enter an ID.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String query = "select * from studentdetails where id = '" + std_id + "'";

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
                    loginpswd = resultSet.getString(10);

                    //now set data to textfields [tid,tnm,tphn,tdp,tc,teml,tfthr,tmtr,pswd];

                    tnm.setText(std_name);
                    tphn.setText(phone_number);
                    tdp.setText(dept);
                    tc.setText(city);
                    teml.setText(std_email);
                    tfthr.setText(std_fname);
                    tmtr.setText(std_mname);
                    tadd.setText(std_add);
                    pswd.setText(loginpswd);
                }
                else {
                    JOptionPane.showMessageDialog(this, "No data found for the given ID.", "Error", JOptionPane.ERROR_MESSAGE);

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
            }
            catch(Exception ae){
                System.out.println(ae);
            }

        }
        else if(e.getSource()==back){
            setVisible(false);
            new operations().setVisible(true);
        }
        else if(e.getSource()==exit){
            System.exit(0);
        }

    }
}