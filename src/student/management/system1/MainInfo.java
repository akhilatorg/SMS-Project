package student.management.system1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class MainInfo extends JFrame implements ActionListener {

    JButton addButton, deleteButton, viewButton, updateButton;

    MainInfo(){

        setSize(700, 520);
        setLocation(400, 150);
        setLayout(null);

        ImageIcon ic= new ImageIcon("C:\\Users\\bisht\\Downloads\\ChatGPT Image May 4, 2025, 09_31_39 PM.png");
        Image i=ic.getImage().getScaledInstance(700,520,Image.SCALE_SMOOTH);
        ImageIcon ic2= new ImageIcon(i);
        JLabel l= new JLabel();
        l.setBounds(0,0,700,520);
        l.setIcon(ic2);
        add(l);


        addButton = new JButton("Add Student");
        addButton.setBounds(230,170,200,45);
        addButton.setBackground(new Color(0x1A73E8));
        addButton.setForeground(Color.white);
        addButton.addActionListener( this);

        deleteButton = new JButton("Delete Student");
        deleteButton.setBounds(230,225,200,45);
        deleteButton.setBackground(new Color(0x1A73E8));
        deleteButton.setForeground(Color.white);
        deleteButton.addActionListener(this);

        viewButton = new JButton("View Student");
        viewButton.setBounds(230,280,200,45);
        viewButton.setBackground(new Color(0x1A73E8));
        viewButton.setForeground(Color.white);
        viewButton.addActionListener(this);

        updateButton = new JButton("Update Student");
        updateButton.setBounds(230,340,200,45);
        updateButton.setBackground(new Color(0x1A73E8));
        updateButton.setForeground(Color.white);
        updateButton.addActionListener(this);

        l.add(addButton);
        l.add(deleteButton);
        l.add(viewButton);
        l.add(updateButton);


        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==addButton){
            new AddStudent();
        }
        else if(e.getSource()==deleteButton){
            new DeleteStudent();
        }
        else if(e.getSource()==viewButton){
            new ViewStudent();
        }
        else if (e.getSource() == updateButton){
            new UpdateStudent();
        }

    }

}


