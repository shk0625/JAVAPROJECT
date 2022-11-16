package JAVAPROJECT;

import JAVAPROJECT.db.DataContro;
import JAVAPROJECT.db.LastWords;
import JAVAPROJECT.util.ImageUtil;

import javax.sql.DataSource;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import static JAVAPROJECT.util.ImagePrint.*;
import static JAVAPROJECT.util.ImageUtil.img1;

public class MenuBar1 extends JFrame {
    public MenuBar1(String str) {
        super(str);
        MenuBar mb = new MenuBar();
        Panel p = new Panel();

        JLabel lb = new JLabel(); //공룡


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
        MenuItem show_draft = new MenuItem("초안");
        show.add(show_last);
        show.add(show_draft);

        mb.add(file); mb.add(show);

        p.setBackground(Color.white); //전체 패널 바탕 색

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
        p.add(btnboom);
        p.setSize(500,500);
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

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


//첫 번째 화면에 나올 이미지 2개와 포춘공룡 클릭시 나오는 이미지

        JPanel jp1 = new JPanel(); //터지기 전 눈 뜸
        JPanel jp2 = new JPanel(); //터지기 전 눈 감음

        JLabel lb1 = new JLabel(); //눈뜸안터짐
        JLabel lb2 = new JLabel(); //눈감음 안터짐

        lb1 = new JLabel("fortune", ImageUtil.getImageNumber(안터지고눈감음),SwingConstants.CENTER);
        lb2 = new JLabel("sec",ImageUtil.getImageNumber(안터지고눈뜸),SwingConstants.CENTER);

        setSize(1000,700); //window size
        jp1.setSize(800,800); //안터지고 눈 뜬 거 크기
        jp2.setSize(800,800); //안터지고 눈 감은 거 크기
        setLocation(400,200); //위치

        add(lb1); add(lb2);
        jp2.add(lb1); jp1.add(lb1); //안터지고눈뜸
        jp1.add(lb2); jp1.add(lb2); //안터지고눈감음
        add(jp1); add(jp2);
        setVisible(true);



       //초안을 누를시 포춘공룡 이미지가 있는 클래스 이동
       show_draft.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                new Dinosaur();
                setVisible(false);
           }
       });
    }

    //file 입출력
    /*
     * @param strFilePath : 파일경로
	 * @param strFileName : 파일명
	 * @param strContents : 내용
	 * @param isAppand    : 같은 파일명일 경우, 추가로 작성할지 여부
	 * @param encoding    : encoding명
	 * */

    public static void FileCharSet(String strFilePath, String strFileName, String strContents, boolean isAppand,String encoding){
        BufferedWriter output = null;
        File f = new File(strFilePath); //파일 경로

        if(false==f.exists()){
            f.mkdirs();
        }
        try{
            output  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(strFilePath + strFileName),encoding));
            output.write(strContents);
            output.close();

        }catch (UnsupportedEncodingException e){

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String args[]) {
        /*new Image1(); 창이 2개가 뜸 */
/*        new MainFrame(); 어차피 이 거 안 갖고 와짐*/
        new MenuBar1("포춘쿠키"); //여기서는 이 화면만 출력됨.
        new Button();

        /*new AddimgJP(); 창 2개 뜸*/
    }
}