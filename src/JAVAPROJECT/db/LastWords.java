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
        /*JPanel imagejp = new JPanel();*/
        JPanel btnp = new JPanel(new BorderLayout());
        JLabel talklb= new JLabel();

        setLayout(new BorderLayout());
        JLabel jlimage = new JLabel();

        talklb.setText("바탕화면 봐볼래?");
        talklb.setSize(400,400);
        /*talklb.setLocation(300,300);*/
        btnp.add(talklb);
        btnp.setLocation(300,300);
        /*btnp.setVisible(true);*/


        JButton back;
        back = new JButton("돌아가기");
        btnp.add(back,BorderLayout.SOUTH);
        btnp.setVisible(true);
        add(btnp); //기능 ㅇㅋ
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
        add(jlimage); btnp.add(jlimage); add(btnp);
        btnp.setSize(800,800); //공룡크기
        /*btnp.setVisible(true);*/
        jlimage.setVisible(true);


        //창
        setTitle("지난 날의 문구들...");
        //같은 패널에 그냥 다 냅다 붙임
        btnp.setVisible(true);

    }

    public static void main(String args[]){
        //txt파일로 내가 뽑은 문구들 저장
        String text = FindList.get();  //db랑 연동되어있음 여기서 랜덤으로 1개씩 나옴 ;;;;
        /*String fileNm="C:\\Users\\USER\\Desktop_Lastwords.txt"; //바탕화면에 저장되는 경로 하지만 이건 안 되지*/
        //File file = new File("C:\\Users\\USER\\Desktop\\myself\\1-3\\수행평가\\JAVA"); //LastWords로 된 파일 있음
        String fileNm="C:\\JAVA_LastWords"; //테스트파일 1번만 저장됨.

        File file = new File(fileNm);
        if(file.exists()){
            System.out.println("file exists"); //어디 경로인데어디어디어ㅣ???? 바탕화면에 안 보이는디..
        }
        else {
            System.out.println("file not exists");

        }
        try{
            file.createNewFile(); //관리자 권한으로 실행해도 안 됨 뭐가 문제냐 ㅅㅑㅇ 갑자기 안 되네
            FileWriter fileWriter = new FileWriter(file, true); //뽑아진 것들 이어서 작성하는 용도

            fileWriter.write(text);
            fileWriter.flush();
            fileWriter.close();

        }catch (IOException e){
            e.printStackTrace();
            System.out.println("e = " + e);
        }

    }

}
