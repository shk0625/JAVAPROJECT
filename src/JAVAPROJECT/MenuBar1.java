package JAVAPROJECT;

import javax.swing.*;
import java.awt.*;

public class MenuBar1 extends JFrame {
    public MenuBar1(String str) {
        super(str);
        MenuBar mb = new MenuBar();
        Panel p = new Panel();

        Menu file = new Menu("파일");
        MenuItem file_save = new MenuItem("저장");
        file.add(file_save);

        Menu show = new Menu("보기");
        MenuItem show_last = new MenuItem("지난 날의 문구들...");
        MenuItem show_draft = new MenuItem("초안");
        show.add(show_last);
        show.add(show_draft);

        mb.add(file); mb.add(show);

        p.setBackground(Color.pink);
        Button btnTime = new Button();
        btnTime.setBounds(300,300,300,300);


        setMenuBar(mb);
        setSize(1000, 700);
        setLocation(500, 100);
        setVisible(true);

    }

    public static void main(String args[]) {
        new MainFrame();
        new MenuBar1("포춘쿠키");
    }
}