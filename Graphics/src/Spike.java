import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class Spike{

    //Labels made here so they can be used inside action listner
    public static JLabel label = new JLabel();
    public static JLabel label2 = new JLabel();


    public static void main(String[] args) {
        int x = 150;
        int y = 150;
        int w = 30;
        int m = 30;
        //Makes frame
        JFrame s = new JFrame();
        s.setLayout(null);
      Container c = s.getContentPane();
        s.setTitle("Test Title");
        s.setSize(500,500);
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // For rotating label
        //Graphics2D g = (Graphics2D)label.getGraphics();
        // Get image
        ImageIcon icon = new ImageIcon("TestFrog.jpg");
        Image scaleImage = icon.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
        //Buttons
        JButton button1 = new JButton("Rotate");
        button1.setBounds(400,300,150,150);
        //What the button does
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    System.out.println("Hi");
              //  label.rotate(Math.toRadians(90),(double)x,(double)y);
            }
        });
        c.add(button1);
        //Images
       // JLabel label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon(scaleImage)); //Sets the image to be displayed as an icon
        label.setBounds(x, y, 50,50); //Sets the location of the imag
       // JLabel label2 = new JLabel(); //JLabel Creation
        label2.setIcon(new ImageIcon(scaleImage)); //Sets the image to be displayed as an icon
        label2.setBounds(w, m, 50,50); //Sets the location of the imag
        c.add(label); //Adds objects to the container
        c.add(label2);
        s.setVisible(true);


    }


}
