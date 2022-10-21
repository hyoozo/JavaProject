package exam_createthread;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

public class CountDownTest extends JFrame { //UI 로 보여주는 작업임.
    @Serial
    private static final long serialVersionUID = 1L;

    private JLabel label;
            //JLasbel 은 화면에 보여주는 클래스

    class MyThread extends Thread { // 내부 클래스
                                    // 해당 클래스에서만 쓸것이다. 그래서 내부에 만들었다.
                                    // UI  작업시 내부 클래스 많이 사용함.
        @Override
        public void run() {
            for (int i = 10; i >= 0; i--) {
                try {
                    Thread.sleep(1000); //실행되고 1초뒤에 실행가능상태로 돌아감.
                } catch (InterruptedException e) {  //sleep 은 정적 예외처리가 꼭 필요하다.
                    e.printStackTrace();
                }
                label.setText(i + "");
            }   // JLabel 셋팅. 10,9,8 .......;
        }       // setText 는  인자가 ( String ) 이다.
    }           // (숫자+문자 or 문자 or String.valueOf(int)) = 문자열로 표현되는것.
    public CountDownTest(){ //화면구성은 생성자로 쓴다.
        setTitle("카운트다운");   //창의 타이틀바의 내용
        setSize(300, 200); //창의 가로와 세로 길이
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 클로우즈를 눌렀을 경우 화면을 종료하고 어플리케이션을 종료하고 싶을때

//        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });
           // -> 맞는 코드 인지 모르겠음..

        /* Do_NOTHING_ON_CLOSE (WindowConstants 에 정의): 아무것도 실시하지 않는다.
               프로그램은 동록되어 있는 WindowListener 오브젝트의 windowClosing 메소드로 처리를 실시할 필요가 있다.

           HIDE_ON_CLOSE (WindowConstants 에 정의): 등록되어 있는 임의의 WindowListener 오브젝트를
                호출한 후에, 자동적으로 프레임을 숨긴다.

           DISPOSE_ON_CLOSE (WindowConstants 에 정의): 등록되어 있는 임의의 WindowListener 오브젝트를
                호출한 후에, 자동적으로 프레임을 숨겨 파기한다.

           EXIT_ON_CLOSE (JFrame 에 정의) :System 의 exit 메소드를 사용해 어플리케이션을 종료한다.
                어플리케이션으로만 사용
         */

        label = new JLabel("Start", JLabel.CENTER); // 창에 처음 띄워지는
        label.setFont(new Font("Serif", Font.BOLD, 100)); //굵은글씨
        label.setForeground(Color.GREEN); //글씨 색 변경
        add(label);
        (new MyThread()).start();

        setVisible(true); //창을 화면에 나타낼 것인지 설정
        setResizable(false); //창의 크기를 조절할 수 없도록 하기.

    }

    public static void main(String[] args) {
        new CountDownTest();
        // 참조변수 안만들어도됨.
        // 팝업창이 뜨면서 카운트 다운이 실행됨.
    }

}
