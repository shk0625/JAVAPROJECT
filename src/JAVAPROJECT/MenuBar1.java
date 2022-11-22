package JAVAPROJECT;

import JAVAPROJECT.db.DataContro;
import JAVAPROJECT.db.LastWords;
import JAVAPROJECT.util.ImageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static JAVAPROJECT.util.ImagePrint.*;

public class MenuBar1 extends JFrame {
    public MenuBar1(String str) {
        super(str);
        MenuBar mb = new MenuBar();
        Panel btnp = new Panel();
        Panel backgroundp = new Panel();
        JLabel imagelb = new JLabel(); //눈뜸안터짐


        Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();

        setLocation((windowSize.width-frameSize.width)/2,(windowSize.height-frameSize.height)/2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        Menu file = new Menu("파일");
        MenuItem file_save = new MenuItem("내용");
        file.add(file_save);

        Menu show = new Menu("보기");
        MenuItem show_last = new MenuItem("지난 날의 문구들...");
        show.add(show_last);

        mb.add(file); mb.add(show);

        btnp.setBackground(Color.white); //전체 패널 바탕 색

        //파일 보기 누를 시 31개 문구가 출력됨. (뭐뭐있는지 볼 수 있음)
        file_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DataContro();
                setVisible(false);
            }
        });
        //지난 날의 문구들(내가 여태껏 뽑은 것들 출력)
        show_last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LastWords();
                setVisible(false);
            }
        });

        Button btnboom;
        btnboom=new Button("포춘쿠키 터트리기");
        btnp.add(btnboom);
        btnp.setSize(500,500);
        btnp.setLocation(100,100);
        btnp.setVisible(true);
        add(btnp);
        btnboom.setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        btnboom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FortuneBoom();
                setVisible(false);
            }
        });
        setLocation(400,200);
        setMenuBar(mb); //메뉴바 (파일, 저장) 출력
        setSize(1000, 700); //창 출력
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


//첫 번째 화면에 나올 이미지 2개와 포춘공룡 클릭시 나오는 이미지

        imagelb = new JLabel(ImageUtil.getImageNumber(안터지고눈뜸),SwingConstants.CENTER);
        imagelb.setLocation(400,200); //위치



        backgroundp.setSize(800,800); //안터지고 눈 뜬 거 크기
        backgroundp.setVisible(true);
        backgroundp.setLocation(200,300);

        setSize(1000,700); //window size
    }



    public static void main(String args[]) {
        /*new Image1(); 창이 2개가 뜸 */
/*        new MainFrame(); 어차피 이 거 안 갖고 와짐*/
        new MenuBar1("포춘쿠키"); //여기서는 이 화면만 출력됨.
        new Button();

    }
}