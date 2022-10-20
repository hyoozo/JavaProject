package exam_createthread;

class MyRunnable implements Runnable{ //추상메서드1개
    String myName;

    public MyRunnable(String name) {
        myName = name;
    }

    @Override
    public void run() { //꼭 재정의하기.
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-13s - %d\n", myName, i);
        }
    }
}
public class ThreadTest1 {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable("First Thread"); //인스턴스 만들기
        Thread t1 = new Thread(r1);  //Thread 객체를 만들어야 start() 가능하다.

        Thread t2 = new Thread(new MyRunnable("Second Thread"));
                            //또는 Thread 객체 만들때 바로 줘도된다.

        t1.start(); //호출은 start로
        t2.start();
        /*
        First Thread  - 0
        First Thread  - 1
        First Thread  - 2
        First Thread  - 3
        First Thread  - 4
        First Thread  - 5
        First Thread  - 6
        First Thread  - 7
        First Thread  - 8
        First Thread  - 9
        Second Thread - 0
        Second Thread - 1
        Second Thread - 2
        Second Thread - 3
        Second Thread - 4
        Second Thread - 5
        Second Thread - 6
        Second Thread - 7
        Second Thread - 8
        Second Thread - 9
         */

        (new Thread(() ->{

            for (int i = 0; i < 10; i++) {  //구현코드
                System.out.printf("%-13s - %d\n", "Thread", i);
            }

        })).start();
        // 3번째 Thread 람다식으로 작성한것임.
        /*
        Second Thread - 0
        Second Thread - 1
        Second Thread - 2
        Second Thread - 3
        Second Thread - 4
        Second Thread - 5
        Second Thread - 6
        Second Thread - 7
        Second Thread - 8
        Second Thread - 9
        Thread        - 0
        Thread        - 1
        Thread        - 2
        Thread        - 3
        Thread        - 4
        Thread        - 5
        Thread        - 6
        Thread        - 7
        Thread        - 8
        Thread        - 9
        First Thread  - 0
        First Thread  - 1
        First Thread  - 2
        First Thread  - 3
        First Thread  - 4
        First Thread  - 5
        First Thread  - 6
        First Thread  - 7
        First Thread  - 8
        First Thread  - 9
         */
    }
}
