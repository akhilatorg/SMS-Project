package student.management.system1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel label,label1,NameLabel ,PasswordLabel;
    JTextField tf;
    JPasswordField pf;
    JButton LoginButton,BackButton,showButton;
    boolean passwordVisible = false;
    Login(){


        ImageIcon icon= new ImageIcon("C:\\Users\\bisht\\Downloads\\LoginB.jpg");
        label= new JLabel();
        label.setBounds(0,0,650,350);
        label.setIcon(icon);
        add(label);

        NameLabel = new JLabel("Username");
        NameLabel.setBounds(60,40,100,30);
        tf = new JTextField();
        tf.setBounds(140,40,150,30);

        PasswordLabel =new JLabel("Password");
        PasswordLabel.setBounds(60,90,100,30);
        pf = new JPasswordField();
        pf.setBounds(140,90,150,30);

        showButton = new JButton("Show");
        showButton.setBounds(300,90,30,30);
        showButton.setBackground(Color.black);
        showButton.setForeground(Color.white);
        showButton.addActionListener(this);

        LoginButton = new JButton("Login");
        LoginButton.setBounds(80,160,100,30);
        LoginButton.setBackground(Color.black);
        LoginButton.setForeground(Color.white);
        LoginButton.addActionListener(this);

        BackButton = new JButton("Cancel");
        BackButton.setBounds(200,160,100,30);
        BackButton.setBackground(Color.black);
        BackButton.setForeground(Color.white);
        BackButton.addActionListener(this);

        label1= new JLabel();
        label1.setBounds(350, 40, 650, 350);
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\bisht\\Downloads\\second.jpg");
        Image scaledImage = originalIcon.getImage().getScaledInstance(700, 400, Image.SCALE_SMOOTH);
        ImageIcon icon2 = new ImageIcon(scaledImage);
        label1.setIcon(icon2);


        setSize(650,350);
        setLocation(400,200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label.add(NameLabel);
        label.add(tf);
        label.add(PasswordLabel);
        label.add(pf);
        label.add(showButton);
        label.add(LoginButton);
        label.add(BackButton);
        label.add(label1);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String username= tf.getText();
        String password= new String(pf.getPassword());
        Cons con= new Cons();
        if(e.getSource() == LoginButton){
            try {
                String query = "SELECT * FROM login WHERE username = '" + username + "' AND password = '" + password + "'";
                ResultSet rs = con.state.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new MainInfo();
                }
                else {
                    JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Login Failed", JOptionPane.ERROR_MESSAGE);
                    tf.setText("");
                    pf.setText("");
                }
            }
            catch(Exception r){
                r.printStackTrace();
            }


        }
        else if(e.getSource() == BackButton){
            System.exit(0);
        }

        else if(e.getSource() == showButton){
            if(passwordVisible){
                pf.setEchoChar('•');
                showButton.setText("");
            } else {
                pf.setEchoChar((char) 0);
                showButton.setText("");
            }
            passwordVisible = !passwordVisible;
        }
    }
}



