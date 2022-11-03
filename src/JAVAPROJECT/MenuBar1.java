package JAVAPROJECT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar1 extends JFrame {
    public MenuBar1(String str) {
        super(str);
        MenuBar mb = new MenuBar();
        Panel p = new Panel();

        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();

        setLocation((windowSize.width-frameSize.width)/2,(windowSize.height-frameSize.height)/2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        Menu file = new Menu("파일");
        MenuItem file_save = new MenuItem("저장");
        file.add(file_save);

        Menu show = new Menu("보기");
        MenuItem show_last = new MenuItem("지난 날의 문구들...");
        MenuItem show_draft = new MenuItem("초안");
        show.add(show_last);
        show.add(show_draft);

        mb.add(file); mb.add(show);

        p.setBackground(Color.white); //전체 패널 바탕 색

        Button btnboom;
        btnboom=new Button("포춘쿠키 터트리기");
        p.add(btnboom);
        p.setSize(300,300);
        p.setLocation(100,100);
        p.setVisible(true);
        add(p);
        btnboom.setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        btnboom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddimgJP();
                //new Image1();
                setVisible(false);
            }
        });

        setLocation(400,200);
        setMenuBar(mb); //메뉴바 (파일, 저장) 출력
        setSize(1000, 700); //창 출력
        setVisible(true);

//첫 번째 화면에 나올 이미지 2개와 포춘공룡 클릭시 나오는 이미지
        JPanel jp1 = new JPanel(); //터지기 전 눈 뜸
        JPanel jp2 = new JPanel(); //터지기 전 눈 감음

        JLabel lb1 = new JLabel(); //눈뜸안터짐
        JLabel lb2 = new JLabel(); //눈감음 안터짐

        ImageIcon img1= new ImageIcon("포춘쿠키안터지고눈뜸크기조정 ㅇ.png"); //jp1
        ImageIcon img2= new ImageIcon("포춘쿠키 안 터지고 눈감음 조정ㅇ.png"); //jp2

        lb1 = new JLabel("first",img1,SwingConstants.CENTER);
        lb2 = new JLabel("sec",img2,SwingConstants.CENTER);

        jp1.add(lb1); jp1.add(lb2);

    }


    public static void main(String args[]) {
        /*new Image1(); 창이 2개가 뜸 */
/*        new MainFrame(); 어차피 이 거 안 갖고 와짐*/
        new MenuBar1("포춘쿠키"); //여기서는 이 화면만 출력됨.
        new Button();

        /*new AddimgJP(); 창 2개 뜸*/
    }
}