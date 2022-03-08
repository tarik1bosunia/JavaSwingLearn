package lesson.day1.jtextfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldLearn {
}




class Rocket extends JFrame {
    private Container container;
    private Font font;
    private JTextField textField;
    private JButton buttonA;

    Rocket(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,600,500);
        this.setTitle("Java Frame");

        initComponents();
    }
    private void initComponents(){
        initFont();
        initTextField();
        initButton();

        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.PINK);
        container.add(textField);
        container.add(buttonA);


    }
    private void initFont(){
        font = new Font("Sun-sarif",Font.BOLD+Font.ITALIC,30);
    }
    private void initTextField(){
        textField = new JTextField();
        textField.setBounds(100,300,400,100);
        textField.setFont(font);
      //  textField.setText("Tarik");
    }

    private void initButton(){
        buttonA = new JButton();
        buttonA.setBounds(100,100,200,100);
        buttonA.setText("Clear");
        buttonA.setFont(font);
        buttonA.setBackground(Color.GREEN);
        buttonA.setForeground(Color.CYAN);
        buttonA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // textField.setText("");
                textField.setBackground(Color.GREEN);
                textField.setForeground(Color.MAGENTA);
            }
        });

    }


    public static void main(String[] args) {
        new Rocket();
    }
}
