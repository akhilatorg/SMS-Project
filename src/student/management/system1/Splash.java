package student.management.system1;
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

    Splash(){

        ImageIcon icon=new ImageIcon("C:\\Users\\bisht\\Downloads\\ChatGPT Image May 4, 2025, 01_42_49 PM.png");
        Image scaledImage = icon.getImage().getScaledInstance(1150, 630, Image.SCALE_SMOOTH);
        ImageIcon icon2 = new ImageIcon(scaledImage);
        JLabel l= new JLabel();
        l.setBounds(0,0,1150,630);
        l.setIcon(icon2);

        add(l);
        setSize(1150,630);
        setLocation(200,50);
        setLayout(null);
        setVisible(true);

        try{
            Thread.sleep(3000);
            setVisible(false);
            new Login();

        }catch(Exception e){
            e.printStackTrace();

        }

    }

    public static void main(String[] args){
        new Splash();

    }
}


