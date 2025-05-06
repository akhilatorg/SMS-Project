package student.management.system1;

import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewStudent extends JFrame implements ActionListener {

    JTable table;
    Choice choice;
    JButton searchbtn, print, back;
    ViewStudent(){

        getContentPane().setBackground(new Color(255,131,122));

        JLabel search = new JLabel("Search by student id");
        search.setBounds(20,20,150,20);
        add(search);

        choice = new Choice();
        choice.setBounds(180,20,150,20);
        add(choice);

        try{
            Cons con = new Cons();
            ResultSet resultSet = con.state.executeQuery("select * from student");
            while (resultSet.next()){
                choice.add(resultSet.getString("stuId"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        table = new JTable();
        try{
            Cons con= new Cons();
            ResultSet resultSet = con.state.executeQuery("select * from student");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JScrollPane jp = new JScrollPane(table);
        jp.setBounds(0,100,900,600);
        add(jp);

        searchbtn = new JButton("SEARCH");
        searchbtn.setBounds(20,70,80,20);
        searchbtn.addActionListener(this);
        add(searchbtn);

        print = new JButton("PRINT");
        print.setBounds(120,70,80,20);
        print.addActionListener(this);
        add(print);

        back = new JButton("BACK");
        back.setBounds(220,70,80,20);
        back.addActionListener(this);
        add(back);


        setSize(900,700);
        setLayout(null);
        setLocation(350,150);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == searchbtn){
            String query = "select * from student where stuId = '"+choice.getSelectedItem()+"'";
            try {
                Cons con = new Cons();
                ResultSet resultSet = con.state.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
            }catch (Exception E){
                E.printStackTrace();
            }
        }
        else if (e.getSource() == print){

//
        } else {
            setVisible(false);
            new MainInfo();
        }
    }
}

