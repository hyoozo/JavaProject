package exam_game;

import javax.swing.*;
import java.util.jar.JarFile;

public class CarGame extends JFrame {
    private static final long serialVersionUID = 1L;

    class MyThread extends Thread{
        private JLabel label;
        private int x,y;

        public MyThread(String fname, int x, int y) {
            this.x = x; // x, y 위치값을 지정하기 위한 코드.
            this.y = y;
            label = new JLabel();
            label.setIcon((new ImageIcon(fname))); //JLabel 의 이미지 설정.
            label.setBounds(x, y, 100, 100); //JLabel 의 위치 설정.
            add(label);
        }
        public void run(){
            for (int i = 0; i < 100; i++) {
                x += 10 * Math.random();  //x 를 랜덤값을 줘서
                label.setBounds(x, y, 100, 100); //?
                repaint();//? 다시그리기?
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public CarGame(){ //생성자에서 셋팅값을 준거임. 이렇게 많이 함.
        setTitle("CarRace");
        setSize(680, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 여기까지 프레임 창에 대한 코드
        setLayout(null);
        //원래 JFrame 이 가지고 있는 LayOut 을 사용하지 않겠다는 코드임.

        (new MyThread("C:/이미지파일/car1.gif", 100, 0)).start();
        (new MyThread("C:/이미지파일/car2.gif",100,50)).start();
        (new MyThread("C:/이미지파일/car3.gif",100,100)).start();
        setVisible(true);
        // 창 띄워 주겠다는 코드임.
    }

    public static void main(String[] args) {
        new CarGame();
    }
}
