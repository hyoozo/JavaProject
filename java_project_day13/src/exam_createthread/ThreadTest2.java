package exam_createthread;

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);     //쓰레드클래스명.슬립 (스테틱이라서 바로 사용)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadTest2 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable1());
        t.start();
        /* 1초씩 멈췄다가 다시 실행상태로 와서 10번 반복.
        10
        9
        8
        7
        6
        5
        4
        3
        2
        1
        0
         */
    }
}
