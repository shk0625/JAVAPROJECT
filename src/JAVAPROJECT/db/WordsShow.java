package JAVAPROJECT.db;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class WordsShow extends JFrame {
   public WordsShow() {
       JPanel jp = new JPanel();

       //31개의 데이터들을 choice에 넣는 거 3개씩 6줄 4개씩 4줄
       /*Choice words = new Choice();*/
       TextArea words1 = new TextArea(1,40);
       TextArea words2 = new TextArea(1,40);
       TextArea words3 = new TextArea(1,40);
       TextArea words4 = new TextArea(1,40);
       TextArea words5 = new TextArea(1,40);
       TextArea words6 = new TextArea(1,40);
       TextArea words7 = new TextArea(1,40);
       TextArea words8 = new TextArea(1,40);
       TextArea words9 = new TextArea(1,40);
       TextArea words10 = new TextArea(1,40);
       TextArea words11 = new TextArea(1,40);
       TextArea words12 = new TextArea(1,40);
       TextArea words13 = new TextArea(1,40);
       TextArea words14 = new TextArea(1,40);
       TextArea words15 = new TextArea(1,40);
       TextArea words16 = new TextArea(1,40);
       TextArea words17 = new TextArea(1,40);
       TextArea words18 = new TextArea(1,40);
       TextArea words19 = new TextArea(1,40);
       TextArea words20 = new TextArea(1,40);
       TextArea words21 = new TextArea(1,40);
       TextArea words22 = new TextArea(1,40);
       TextArea words23 = new TextArea(1,40);
       TextArea words24 = new TextArea(1,40);
       TextArea words25 = new TextArea(1,40);
       TextArea words26 = new TextArea(1,40);
       TextArea words27 = new TextArea(1,40);
       TextArea words28 = new TextArea(1,40);
       TextArea words29 = new TextArea(1,40);
       TextArea words30 = new TextArea(1,40);
       TextArea words31 = new TextArea(1,40);

       words1.setText("무엇인가 좋은 결실을 이룰 것 같은 날입니다.");
       words2.setText("모든 일이 생각대로 잘 풀리는 날입니다.");
       words3.setText("오늘보다 내일을 기약하는 것은 어떨까요?");
       words4.setText("길게 보는 안목과 혜안이 필요합니다..");
       words5.setText("오늘 할 일은 오늘 하는 게 어떨까요?");

        words6.setText("모든 사람들로부터 사랑받지 않아도 됩니다.");
        words7.setText("미래를 만드는 건 현재입니다.");
        words8.setText("운명의 별은 마음속에 있습니다.");
        words9.setText("미래는 예측하는 게 아니라 만들어 가는 겁니다.");
        words10.setText("피할 수 없으면 즐기는 게 어떨까요?");

        words11.setText("고난의 시기에 동요하지않는 건 어떨까요?");
        words12.setText("작은 기회를 노려보는 건 어떨까요?");
        words13.setText("용기있게 산다면 이룰 것 같은 날입니다.");
        words14.setText("애정 운이 최고조에 달하는 날입니다.");
        words15.setText("선택과 집중");

        words16.setText("집중하면 성공할 것입니다.");
        words17.setText("운은 계획에서 비롯됩니다.");
        words18.setText("완벽함을 위한 것이 아닌 탁월함을 위해 힘 써보세요.");
        words19.setText("반성하는 삶을 살아보는 건 어떨까요?");
        words20.setText("자책하지 마세요 누구나 실수는 합니다.");

        words21.setText("후회없는 하루를 보내보세요");
        words22.setText("무언가를 시작하기 전에 충분한 정리가 필요합니다.");
        words23.setText("자기 자신을 사랑한다면 사랑받을 수 있습니다.");
        words24.setText("질투와 시기를 자신을 발전시키는 원동력으로 바꿔보는 것은 어떨까요?");
        words25.setText("당신은 세상의 소금같은 존재입니다.");

        words26.setText("하루하루를 의미있게 보내보세요.");
        words27.setText("소중한 사람을 위해 무언가를 준비해보는 것은 어떨까요?");
        words28.setText("하루를 의미있게 보내는 방법을 연구해보아요.");
        words29.setText("고민보다 Go!");
        words30.setText("한계는 또 다른 한계를 찾는 거예요.");

        words31.setText("자신이 1순위라는 것을 잊지 말아요.");
       //textarea 겹쳐지무ㅜ.. 다 추가가 되어야하는데...

       words1.setFont(new Font("궁서체",Font.BOLD,20));
       words2.setFont(new Font("궁서체",Font.BOLD,20));
       words3.setFont(new Font("궁서체",Font.BOLD,20));
       words4.setFont(new Font("궁서체",Font.BOLD,20));
       words5.setFont(new Font("궁서체",Font.BOLD,20));
       words6.setFont(new Font("궁서체",Font.BOLD,20));
       words7.setFont(new Font("궁서체",Font.BOLD,20));
       words8.setFont(new Font("궁서체",Font.BOLD,20));
       words9.setFont(new Font("궁서체",Font.BOLD,20));
       words10.setFont(new Font("궁서체",Font.BOLD,20));
       words11.setFont(new Font("궁서체",Font.BOLD,20));
       words12.setFont(new Font("궁서체",Font.BOLD,20));
       words13.setFont(new Font("궁서체",Font.BOLD,20));
       words14.setFont(new Font("궁서체",Font.BOLD,20));
       words15.setFont(new Font("궁서체",Font.BOLD,20));
       words16.setFont(new Font("궁서체",Font.BOLD,20));
       words17.setFont(new Font("궁서체",Font.BOLD,20));
       words18.setFont(new Font("궁서체",Font.BOLD,20));
       words19.setFont(new Font("궁서체",Font.BOLD,20));
       words20.setFont(new Font("궁서체",Font.BOLD,20));
       words21.setFont(new Font("궁서체",Font.BOLD,20));
       words22.setFont(new Font("궁서체",Font.BOLD,20));
       words23.setFont(new Font("궁서체",Font.BOLD,20));
       words24.setFont(new Font("궁서체",Font.BOLD,20));
       words25.setFont(new Font("궁서체",Font.BOLD,20));
       words26.setFont(new Font("궁서체",Font.BOLD,20));
       words27.setFont(new Font("궁서체",Font.BOLD,20));
       words28.setFont(new Font("궁서체",Font.BOLD,20));
       words29.setFont(new Font("궁서체",Font.BOLD,20));
       words30.setFont(new Font("궁서체",Font.BOLD,20));
       words31.setFont(new Font("궁서체",Font.BOLD,20));

       add(words1); add(words2);
       jp.add(words1); jp.add(words2);
       add(jp);
       jp.setVisible(true);
       words1.setLocation(00,100); words2.setLocation(400,200);
       /*jp.setLocation(400, 200);*/
       setVisible(true);
       setLocation(350,200);
       setSize(1400, 1000);
    }
}
