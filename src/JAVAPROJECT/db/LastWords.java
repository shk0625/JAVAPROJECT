package JAVAPROJECT.db;

import JAVAPROJECT.MenuBar1;
import JAVAPROJECT.util.ImageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import static JAVAPROJECT.util.ImagePrint.포춘공룡;

//내가 뽑았던 문구들
public class LastWords extends JFrame {

    public LastWords() {
        JPanel jp = new JPanel();
        JPanel imagejp = new JPanel();
        JPanel btnp = new JPanel();
        JLabel talklb= new JLabel();
        JButton back = new JButton(BorderLayout.SOUTH);
        TextArea lastwords = new TextArea();

        setLayout(new BorderLayout());
        JLabel jlimage = new JLabel();

        talklb.setText("바탕화면 봐볼래?");
        talklb.setSize(400,400);
        talklb.setLocation(300,300);
        jp.add(talklb);
        jp.setVisible(true);


        back.setText("back");
        add(btnp); //기능 ㅇㅋ
        btnp.add(back,BorderLayout.SOUTH);
        btnp.setLocation(400,200);
        btnp.setSize(600,600);
        back.setVisible(true);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    new MenuBar1("fortune");
                    setVisible(false);
            }
        });

        setSize(1000,700);
        setLocation(400,200);
        setVisible(true);

        //포춘공룡 이미지 추가
        jlimage= new JLabel(ImageUtil.getImageNumber(포춘공룡),SwingConstants.CENTER);
        add(jlimage); imagejp.add(jlimage); add(imagejp);
        /*imagejp.setLocation(450,25); //이미지 위치*/
        imagejp.setSize(800,800); //공룡크기
        imagejp.setVisible(true);
        jlimage.setVisible(true);


        //창
        setTitle("지난 날의 문구들...");

    }

    public static void main(String args[]){
        //txt파일로 내가 뽑은 문구들 저장
        String text = FindList.get();  //db랑 연동되어있음 여기서 랜덤으로 1개씩 나옴 ;;;;
        /*String fileNm="C:\\Users\\USER\\Desktop_Lastwords.txt"; //바탕화면에 저장되는 경로 하지만 이건 안 되지*/
        String fileNm="C:\\Users\\USER\\Desktop\\myself\\1-3\\수행평가\\JAVA_LastWords.txt"; //테스트파일 1번만 저장됨.

        File file = new File(fileNm);
        if(file.exists()){
            System.out.println("file exists"); //어디 경로인데어디어디어ㅣ???? 바탕화면에 안 보이는디..
        }
        else {
            System.out.println("file not exists");

        }
        try{
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file, true); //뽑아진 것들 이어서 작성하는 용도

            fileWriter.write(text);
            fileWriter.flush();
            fileWriter.close();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("e = " + e);
        }

    }

}
