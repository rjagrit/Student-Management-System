import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class displayAllStudents extends JFrame implements ActionListener {

    JTable table;
    DefaultTableModel tableModel;

    JButton showButton,back;

    public displayAllStudents() {

        new JFrame("Student Details");
        setBounds(10, 10, 700, 500);
        setLayout(new BorderLayout());

        // Create the table model
        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);

        // Add columns to the table model
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Phone Number");
        tableModel.addColumn("Department");
        tableModel.addColumn("City");
        tableModel.addColumn("Email");
        tableModel.addColumn("Father Name");
        tableModel.addColumn("Mother Name");
        tableModel.addColumn("Address");


        TableColumn idColumn = table.getColumnModel().getColumn(0);
        idColumn.setPreferredWidth(90);

        TableColumn nameColumn = table.getColumnModel().getColumn(1);
        nameColumn.setPreferredWidth(90);

        TableColumn phnumColumn = table.getColumnModel().getColumn(2);
        phnumColumn.setPreferredWidth(90);

        TableColumn deptColumn = table.getColumnModel().getColumn(3);
        deptColumn.setPreferredWidth(90);

        TableColumn cityColumn = table.getColumnModel().getColumn(4);
        cityColumn.setPreferredWidth(90);

        TableColumn emailColumn = table.getColumnModel().getColumn(5);
        cityColumn.setPreferredWidth(90);

        TableColumn fnameColumn = table.getColumnModel().getColumn(6);
        fnameColumn.setPreferredWidth(90);

        TableColumn mnameColumn = table.getColumnModel().getColumn(7);
        mnameColumn.setPreferredWidth(90);

        TableColumn addressColumn = table.getColumnModel().getColumn(8);
        addressColumn.setPreferredWidth(220);



        // Create the show button
        showButton = new JButton("Click on Show Button to Display the Details");
        showButton.setForeground(Color.black);
        showButton.setBackground(Color.lightGray);
        showButton.setFont(new Font("Raleway",Font.BOLD,18));
        showButton.addActionListener(this);

        back = new JButton("Back");
        back.setFont(new Font("Raleway",Font.BOLD,18));
        back.addActionListener(this);

        // Set up the layout
        setLayout(new BorderLayout());
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(showButton, BorderLayout.NORTH);
        add(back, BorderLayout.SOUTH);


        setBounds(50,20,1450,750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new displayAllStudents();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Conn obj = new Conn();
        if(e.getSource()==showButton){
            String query = "select id,name,phnumber,department,city,email,fathername,mothername,address from studentdetails";

            try {
                // Create a prepared statement
                PreparedStatement preparedStatement = obj.c.prepareStatement(query);

                // Execute the query
                ResultSet resultSet = preparedStatement.executeQuery();

                // Clear existing rows
                tableModel.setRowCount(0);

                // Process the result set
                while (resultSet.next()) {
                    String id = resultSet.getString("id");
                    String name = resultSet.getString("name");
                    String phonenumber = resultSet.getString("phnumber");
                    String department = resultSet.getString("department");
                    String city = resultSet.getString("city");
                    String email = resultSet.getString("email");
                    String fname = resultSet.getString("fathername");
                    String mname = resultSet.getString("mothername");
                    String address = resultSet.getString("address");


                    // Add row to the table model
                    tableModel.addRow(new Object[]{id, name, phonenumber,department,city,email,fname,mname,address});
                }
            }catch(Exception ae){
                System.out.println(ae);
            }

        }
        else if(e.getSource()==back){
            setVisible(false);
            new operations().setVisible(true);
        }
    }
}