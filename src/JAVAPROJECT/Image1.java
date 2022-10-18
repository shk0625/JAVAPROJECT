package JAVAPROJECT;

import javax.swing.*;

public class Image1 {
    private JPanel panel1;

    JFrame jf = new JFrame("포춘쿠키");

    Image1 (){
        jf.add(panel1);
        jf.setSize(1000,700);
        jf.setVisible(true);

    }
    public static void main(String args[]){
        new Image1();
    }
}
