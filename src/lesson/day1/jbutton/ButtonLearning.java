package lesson.day1.jbutton;

import javax.swing.*;
import java.awt.*;

public class ButtonLearning {

}


class AirPlane extends JFrame {
    private Container container;
    private JButton buttonA;
    private Font font;
    private ImageIcon imageIcon;

    AirPlane(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,600,500);
        this.setTitle("Java Frame");

        initComponents();

    }
    private void initComponents(){


        initFont();
        initImageIcon();
        initButton();


        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.PINK);

        container.add(buttonA);

    }
    private void initFont(){
        font = new Font("Sun-sarif",Font.BOLD+Font.ITALIC,50);
    }
    private void initButton(){
        buttonA = new JButton();
        buttonA.setBounds(100,100,200,100);
        buttonA.setText("Clear");
        buttonA.setFont(font);
        buttonA.setBackground(Color.GREEN);
        buttonA.setForeground(Color.CYAN);
        buttonA.setIcon(imageIcon);

    }
    private void initImageIcon(){
        imageIcon = new ImageIcon("D:\\JAVA\\JavaSwingLearn\\res\\images\\esha.jpg");
    }


    public static void main(String[] args) {
        new AirPlane();
    }
}
