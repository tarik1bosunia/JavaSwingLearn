package lesson.day2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameExample extends JFrame{
    private Container container;
    private JLabel label;
    private Font font;
    private ImageIcon imageIcon;
    private JTextField textField;
    private JButton button;
    private ActionL actionL;
    private JTextArea textArea;
    private JScrollPane scrollPane;


    JFrameExample(){

//        this.setLocation(100,50);
//        this.setSize(800,600);
        this.setBounds(100,50,800,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JFrame");

        initComponents();


    }

    private void initComponents(){
        initFont();

       // initImageIcon();

        actionL = new ActionL();

        initJLabel();

        initJTextField();

        initButton();

        initTextArea();

        container = this.getContentPane();
        container.setBackground(Color.BLUE);
        container.setLayout(null);

        container.add(label);
        container.add(textField);
        container.add(button);
        container.add(textArea);
    }
    private void initFont(){
        font = new Font("atat",Font.ITALIC+Font.BOLD,30);
    }
    private void initImageIcon(){
        imageIcon = new ImageIcon(getClass().getResource("/images/esha.jpg"));
    }
    private void initJLabel(){
        label = new JLabel();
        label.setBounds(100,100,200,100);
        label.setText("CSE");
        label.setFont(font);
      //  label.setIcon(imageIcon);
    }
    private void initJTextField(){
        textField = new JTextField();
        textField.setBounds(100,200,200,50);
        textField.setBackground(Color.ORANGE);
        textField.setFont(font);
    }
    private void initButton(){
        button = new JButton();
        button.setBounds(100,300,150,50);
        button.setBackground(Color.GREEN);
        button.setText("Clear");
        button.setFont(font);
        button.addActionListener(actionL);
    }

    private void initTextArea(){

        textArea = new JTextArea();
        textArea.setFont(font);
        textArea.setBounds(350,200,200,200);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);



//        scrollPane = new JScrollPane(textArea);
//        scrollPane.setBounds(350,200,200,200);


    }


    class ActionL implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText("");
        }
    }




    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrameExample f = new JFrameExample();
            }
        });

    }
}



