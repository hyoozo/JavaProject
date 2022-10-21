package exam_createthread;
/*
아주 간단한 경마 게임( 질풍, 번개, 적토마)을 작성하여 보자.
이번에는 난수를 매개변수로 하여 sleep()을 호출하는 스레드를 여러 개 생성한다.
sleep()메소드는 지정된 시간 동안 현재 스레드의 실행을 중단한다.
 */

import java.util.Random;

class Horse implements Runnable {
    private String name; // 각 객체에 이름을 주기위해서 만든것.
    private int sleepTime;
    private final static Random generator = new Random(); //랜덤 클래스를 통해서 임의수를 얻기 위해서

    public Horse(String name) {
        this.name = name;
        sleepTime = generator.nextInt(3000);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(sleepTime);  //sleep 은 예외처리 꼭 하기.
        } catch (InterruptedException e) {
        }
        System.out.println(name + "말이 경주를 완료하였습니다.");
    }
}
public class ThreadTest3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Horse("질풍"));
        Thread t2 = new Thread(new Horse("번개"));
        Thread t3 = new Thread(new Horse("적토마"));
                                //run 이 재정의된 클래스의 주솟값을 줘서 Thread 의 참조변수에서 start 할 수 있다.

        t1.start();
        t2.start();
        t3.start();
        /* //실행할때마다 결과가 달라진다 .

        적토마말이 경주를 완료하였습니다.
        번개말이 경주를 완료하였습니다.
        질풍말이 경주를 완료하였습니다.

         */
    }
}
