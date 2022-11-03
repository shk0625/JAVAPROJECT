package JAVAPROJECT;

import java.awt.*;
import javax.swing.*;

public class MainFrame {
    public static void main(String args[]){
        JFrame jf = new JFrame();
        jf.setTitle("포춘쿠키");
        jf.setSize(1000,700);
        jf.setLocation(400,200);
        jf.setVisible(false);

        new MenuBar1("fortune");
    }
}
