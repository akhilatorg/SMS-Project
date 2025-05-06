package student.management.system1;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddStudent extends JFrame implements ActionListener {
    Random ran = new Random();
    int number = ran.nextInt(999999);

    JLabel heading, tStudent, name, fname, dob, education, tSem, gender, phone, email, aadhaar, address;
    JTextField StudentField, nameField, fnameField, ContactField, emailField, aadhaarField, addressField;
    JDateChooser tdob;
    JRadioButton male, female;
    ButtonGroup bg;
    JButton submit, add, back;
    JComboBox<String> Boxeducation;
    JComboBox<Integer> semester;

    AddStudent() {
        getContentPane().setBackground(new Color(163, 255, 188));
        setLayout(null);

        heading = new JLabel("Add Student Details");
        heading.setBounds(320, 20, 400, 30);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        heading.setForeground(Color.BLUE);
        add(heading);


        tStudent = new JLabel("Student ID");
        tStudent.setBounds(50, 90, 150, 30);
        tStudent.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(tStudent);
        StudentField = new JTextField("" + number);
        StudentField.setBounds(200, 90, 150, 30);
        StudentField.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        StudentField.setForeground(Color.RED);
        add(StudentField);

        name = new JLabel("Full Name");
        name.setBounds(50, 140, 150, 30);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(name);
        nameField = new JTextField();
        nameField.setBounds(200, 140, 150, 30);
        nameField.setBackground(new Color(177, 252, 197));
        add(nameField);

        fname = new JLabel("Father's / Mother's Name");
        fname.setBounds(400, 140, 250, 30);
        fname.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(fname);
        fnameField = new JTextField();
        fnameField.setBounds(650, 140, 150, 30);
        fnameField.setBackground(new Color(177, 252, 197));
        add(fnameField);

        dob = new JLabel("Date Of Birth");
        dob.setBounds(50, 190, 150, 30);
        dob.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(dob);
        tdob = new JDateChooser();
        tdob.setBounds(200, 190, 150, 30);
        tdob.setBackground(new Color(177, 252, 197));
        add(tdob);

        gender = new JLabel("Gender");
        gender.setBounds(400, 190, 150, 30);
        gender.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(gender);
        male = new JRadioButton("Male");
        male.setBounds(550, 190, 70, 30);
        male.setBackground(new Color(163, 255, 188));
        female = new JRadioButton("Female");
        female.setBounds(630, 190, 80, 30);
        female.setBackground(new Color(163, 255, 188));
        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        add(male);
        add(female);

        education = new JLabel("Course");
        education.setBounds(50, 240, 150, 30);
        education.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(education);
        String[] courses = {"BBA", "B.Tech", "BCA", "BA", "BSC", "B.COM", "MBA", "MCA", "MA", "MTech", "MSC", "PHD"};
        Boxeducation = new JComboBox<>(courses);
        Boxeducation.setBounds(200, 240, 150, 30);
        Boxeducation.setBackground(new Color(177, 252, 197));
        add(Boxeducation);

        tSem = new JLabel("Semester");
        tSem.setBounds(400, 240, 150, 30);
        tSem.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(tSem);
        Integer[] semItems = {1, 2, 3, 4, 5, 6};
        semester = new JComboBox<>(semItems);
        semester.setBounds(550, 240, 150, 30);
        semester.setBackground(new Color(177, 252, 197));
        add(semester);

        phone = new JLabel("Contact Number");
        phone.setBounds(50, 290, 180, 30);
        phone.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(phone);

        ContactField = new JTextField();
        ContactField.setBounds(230, 290, 150, 30);
        ContactField.setBackground(new Color(177, 252, 197));
        add(ContactField);


        email = new JLabel("Email");
        email.setBounds(400, 290, 150, 30);
        email.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(email);
        emailField = new JTextField();
        emailField.setBounds(550, 290, 150, 30);
        emailField.setBackground(new Color(177, 252, 197));
        add(emailField);

        aadhaar = new JLabel("Aadhar Number");
        aadhaar.setBounds(50, 340, 180, 30);
        aadhaar.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(aadhaar);
        aadhaarField = new JTextField();
        aadhaarField.setBounds(230, 340, 150, 30);
        aadhaarField.setBackground(new Color(177, 252, 197));
        add(aadhaarField);

        address = new JLabel("Address");
        address.setBounds(400, 340, 150, 30);
        address.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        add(address);
        addressField = new JTextField();
        addressField.setBounds(550, 340, 150, 30);
        addressField.setBackground(new Color(177, 252, 197));
        add(addressField);

        submit = new JButton("SUBMIT");
        submit.setBounds(450, 450, 150, 40);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        add = new JButton("ADD");
        add.setBounds(450, 450, 150, 40);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);
        add.setVisible(false);

        back = new JButton("BACK");
        back.setBounds(250, 450, 150, 40);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(900, 600);
        setLocation(300, 100);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String stuID = StudentField.getText();
            String name = nameField.getText();
            String fname = fnameField.getText();
            String dob = ((JTextField) tdob.getDateEditor().getUiComponent()).getText();
            String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "";
            String education = (String) Boxeducation.getSelectedItem();
            String sem = semester.getSelectedItem().toString();
            String phone = ContactField.getText();
            String email = emailField.getText();
            String aadhaar = aadhaarField.getText();
            String address = addressField.getText();

            if (name.isEmpty() || fname.isEmpty() || dob.isEmpty() || gender.isEmpty() || phone.isEmpty() ||
                    email.isEmpty() || aadhaar.isEmpty() || address.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled.");
                return;
            }

            if (phone.length() != 10) {
                JOptionPane.showMessageDialog(null, "Enter a valid 10-digit Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!email.contains("@gmail.com")) {
                JOptionPane.showMessageDialog(null, "Invalid Email! Must contain '@gmail.com'", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (aadhaar.length() != 12) {
                JOptionPane.showMessageDialog(null, "Enter a valid 12-digit Aadhaar Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            JOptionPane.showMessageDialog(null, "Validation Successful! Click ADD to store details.", "INFO", JOptionPane.INFORMATION_MESSAGE);
            submit.setVisible(false);
            add.setVisible(true);

        } else if (e.getSource() == add) {
            try {
                String stuID = StudentField.getText();
                String name = nameField.getText();
                String fname = fnameField.getText();
                String dob = ((JTextField) tdob.getDateEditor().getUiComponent()).getText();
                String gender = male.isSelected() ? "Male" : "Female";
                String education = (String) Boxeducation.getSelectedItem();
                String sem = semester.getSelectedItem().toString();
                String phone = ContactField.getText();
                String email = emailField.getText();
                String aadhaar = aadhaarField.getText();
                String address = addressField.getText();

                Cons con = new Cons();
                String query = "INSERT INTO student VALUES('" + stuID + "','"
                        + name + "','" + fname + "','" + dob + "','" + gender + "','"
                        + education + "','" + sem + "','" + phone + "','" + email + "','"
                        + aadhaar + "','" + address + "')";

                con.state.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");

                nameField.setText("");
                fnameField.setText("");
                tdob.setDate(null);
                bg.clearSelection();
                Boxeducation.setSelectedIndex(0);
                semester.setSelectedIndex(0);
                ContactField.setText("");
                emailField.setText("");
                aadhaarField.setText("");
                addressField.setText("");

                number = ran.nextInt(999999);
                StudentField.setText("" + number);

                add.setVisible(false);
                submit.setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (e.getSource() == back) {
            setVisible(false);
            new MainInfo();
        }
    }
}

