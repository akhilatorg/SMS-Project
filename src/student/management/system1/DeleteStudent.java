package student.management.system1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.awt.event.ActionListener;

public class DeleteStudent extends JFrame implements ActionListener {
    Choice choice;
    JButton delete, back;

    JLabel textName, textPhone, textEmail;

    DeleteStudent() {
        setLayout(null);
        getContentPane().setBackground(new Color(255, 255, 255));

        JLabel label = new JLabel("Student ID");
        label.setBounds(50, 50, 120, 30);
        label.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(label);

        choice = new Choice();
        choice.setBounds(200, 50, 150, 30);
        add(choice);

        try {
            Cons con = new Cons();
            ResultSet rs = con.state.executeQuery("select * from student");
            while (rs.next()) {
                choice.add(rs.getString("stuID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel labelName = new JLabel("Name");
        labelName.setBounds(50, 100, 100, 30);
        labelName.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(labelName);

        textName = new JLabel();
        textName.setBounds(200, 100, 200, 30);
        add(textName);

        JLabel labelPhone = new JLabel("Phone");
        labelPhone.setBounds(50, 150, 100, 30);
        labelPhone.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(labelPhone);

        textPhone = new JLabel();
        textPhone.setBounds(200, 150, 200, 30);
        add(textPhone);

        JLabel labelEmail = new JLabel("Email");
        labelEmail.setBounds(50, 200, 100, 30);
        labelEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(labelEmail);

        textEmail = new JLabel();
        textEmail.setBounds(200, 200, 200, 30);
        add(textEmail);

        loadStudentData(choice.getSelectedItem());

        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                loadStudentData(choice.getSelectedItem());
            }
        });

        delete = new JButton("DELETE");
        delete.setBounds(80, 300, 100, 30);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(this);
        add(delete);

        back = new JButton("BACK");
        back.setBounds(220, 300, 100, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon("C:\\Users\\bisht\\Downloads\\delete.png");
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 80, 150, 150);
        add(image);

        setSize(600, 400);
        setLocation(400, 150);
        setVisible(true);
    }

    void loadStudentData(String stuID) {
        try {
            Cons con = new Cons();
            ResultSet rs = con.state.executeQuery("select * from student where stuID = '" + stuID + "'");
            if (rs.next()) {
                textName.setText(rs.getString("name"));
                textPhone.setText(rs.getString("phone"));
                textEmail.setText(rs.getString("email"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == delete) {
            try {
                Cons con = new Cons();
                String query = "delete from student where stuID = '" + choice.getSelectedItem() + "'";
                con.state.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Student Deleted Successfully");
               new DeleteStudent();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            setVisible(false);
            new MainInfo();
        }
    }
}
