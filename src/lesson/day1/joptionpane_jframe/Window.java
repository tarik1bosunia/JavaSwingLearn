package lesson.day1.joptionpane_jframe;

import javax.swing.*;
import java.awt.*;

public class Window {
    ImageIcon icon = new ImageIcon("D:\\JAVA\\JavaSwingLearn\\res\\images\\esha.jpg");

    public void func1(){

        //  JOptionPane.showMessageDialog(null,"you are entered wrong password");
        //   JOptionPane.showMessageDialog(null,"you are entered wrong password","title",JOptionPane.WARNING_MESSAGE);
        //   JOptionPane.showMessageDialog(null,"you are entered wrong password","title",JOptionPane.QUESTION_MESSAGE);
        //   JOptionPane.showMessageDialog(null,"you are entered wrong password","title",JOptionPane.PLAIN_MESSAGE,icon);
    }
    public void func2(){
   //   String password =  JOptionPane.showInputDialog("please enter your password..");
   //     JOptionPane.showMessageDialog(null,"your password is: " + password);

      String name =  JOptionPane.showInputDialog("please enter your password..","Md");
      JOptionPane.showMessageDialog(null,"your name is: " + name);

    }
    public void func3(){
     int selectedOption  =  JOptionPane.showConfirmDialog(null,"Are you 18+ ?");
        if(selectedOption == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"you parmited to drive");

        }else if(selectedOption == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"you are not parmitted to drive");
        }
    }

    public static void main(String[] args) {

        Window window = new Window();
     //   window.func1();
     //   window.func2();
    //    window.func3();



    }
}

/*
    //window
    1. dialog
    2. frame
*/


class Car{
    private Container container;

    Car(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
//        frame.setLocation(100,200);
//        frame.setSize(600,400);

        frame.setBounds(100,200,600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JFrame");

        container = frame.getContentPane();
        container.setBackground(Color.BLUE);
        container.setLayout(null);
    }

    public static void main(String[] args) {
        new Car();
    }

}

class Bus extends JFrame{
    private Container container;

    Bus(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,600,500);
        this.setTitle("Java Frame");

        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.PINK);
    }

    public static void main(String[] args) {
        new Bus();
    }
}


