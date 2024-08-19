import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class studentRecord extends JFrame implements ActionListener {
    JLabel register,tid,tnm,tph,tdp,tc,eml,father,mother,address,password,disp_tid,disp_tnm,disp_tphn,disp_tdp,disp_tc,disp_teml,disp_tfthr,disp_tmtr,disp_add;
    JButton exit,back;

    studentRecord(String userId,String userName,String userPhn,String dept,String city,String email,String fatherName,String motherName,String useraddress){
        setTitle("Edit the Details");
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

        tid=new JLabel("Student ID              :");
        tid.setBounds(25,100,250,20);
        tid.setFont(new Font("Arial",Font.BOLD,19));
        tid.setForeground(Color.BLACK);
        add(tid);

        tnm=new JLabel("Student Name        :");
        tnm.setBounds(25,150,250,20);
        tnm.setFont(new Font("Arial",Font.BOLD,19));
        tnm.setForeground(Color.BLACK);
        add(tnm);

        tph=new JLabel("Phone Number       :");
        tph.setBounds(25,200,250,20);
        tph.setFont(new Font("Arial",Font.BOLD,19));
        tph.setForeground(Color.BLACK);
        add(tph);

        tdp=new JLabel("Department             :");
        tdp.setBounds(25,250,250,20);
        tdp.setForeground(Color.BLACK);
        tdp.setFont(new Font("Arial",Font.BOLD,19));
        add(tdp);

        tc=new JLabel("City                         :");
        tc.setBounds(25,300,250,20);
        tc.setFont(new Font("Arial",Font.BOLD,19));
        tc.setForeground(Color.BLACK);
        add(tc);

        eml=new JLabel("Email Address        :");
        eml.setBounds(25,350,250,20);
        eml.setForeground(Color.BLACK);
        eml.setFont(new Font("Arial",Font.BOLD,19));
        add(eml);

        father=new JLabel("Father Name           :");
        father.setBounds(25,400,250,20);
        father.setForeground(Color.BLACK);
        father.setFont(new Font("Arial",Font.BOLD,19));
        add(father);

        mother=new JLabel("Mother Name           :");
        mother.setBounds(25,450,250,20);
        mother.setFont(new Font("Arial",Font.BOLD,19));
        mother.setForeground(Color.BLACK);
        add(mother);

        address=new JLabel("Address                 :");
        address.setBounds(25,500,250,20);
        address.setFont(new Font("Arial",Font.BOLD,19));
        address.setForeground(Color.BLACK);
        add(address);


        disp_tid=new JLabel();
        disp_tid.setBounds(370,100,330,25);
        disp_tid.setFont(new Font("Arial",Font.PLAIN,17));
//        disp_tid.setBorder(border);
        disp_tid.setText(userId);
        add(disp_tid);

        disp_tnm=new JLabel();
        disp_tnm.setBounds(370,150,330,25);
        disp_tnm.setFont(new Font("Arial",Font.PLAIN,17));
//        disp_tid.setBorder(border);
        disp_tnm.setText(userName);
        add(disp_tnm);

        disp_tphn=new JLabel();
        disp_tphn.setBounds(370,200,330,25);
        disp_tphn.setFont(new Font("Arial",Font.PLAIN,17));
//        disp_tid.setBorder(border);
        disp_tphn.setText(userPhn);
        add(disp_tphn);

        disp_tdp=new JLabel();
        disp_tdp.setBounds(370,250,330,25);
        disp_tdp.setFont(new Font("Arial",Font.PLAIN,17));
//        disp_tid.setBorder(border);
        disp_tdp.setText(dept);
        add(disp_tdp);

        disp_tc=new JLabel();
        disp_tc.setBounds(370,300,330,25);
        disp_tc.setFont(new Font("Arial",Font.PLAIN,17));
//        disp_tid.setBorder(border);
        disp_tc.setText(city);
        add(disp_tc);

        disp_teml=new JLabel();
        disp_teml.setBounds(370,350,330,25);
        disp_teml.setFont(new Font("Arial",Font.PLAIN,17));
//        disp_tid.setBorder(border);
        disp_teml.setText(email);
        add(disp_teml);

        disp_tfthr=new JLabel();
        disp_tfthr.setBounds(370,400,330,25);
        disp_tfthr.setFont(new Font("Arial",Font.PLAIN,17));
//        disp_tid.setBorder(border);
        disp_tfthr.setText(fatherName);
        add(disp_tfthr);

        disp_tmtr=new JLabel();
        disp_tmtr.setBounds(370,450,330,25);
        disp_tmtr.setFont(new Font("Arial",Font.PLAIN,17));
//        disp_tid.setBorder(border);
        disp_tmtr.setText(motherName);
        add(disp_tmtr);

        disp_add=new JLabel();
        disp_add.setBounds(370,490,330,70);
        disp_add.setFont(new Font("Arial",Font.PLAIN,17));
//        disp_tid.setBorder(border);
        disp_add.setText(useraddress);
        add(disp_add);

        back=new JButton("Back");
        back.setBounds(330,570,120,40);
        back.setBackground(Color.black);
        back.setFont(new Font("Arial",Font.BOLD,20));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        exit=new JButton("EXIT");
        exit.setBounds(460,570,120,40);
        exit.setBackground(Color.RED);
        exit.setFont(new Font("Arial",Font.BOLD,20));
        exit.setForeground(Color.WHITE);
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
        new studentRecord("","","","","","","","","");
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

        if(e.getSource()==back){
            setVisible(false);
            new operations().setVisible(true);
        }

        else if(e.getSource()==exit){
            System.exit(0);
        }

    }
}