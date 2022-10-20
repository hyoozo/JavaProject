package exam_createthread;

class Counting extends Thread {
    public Counting(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + " : " + i);
        }
    }
}
public class ThreadTest0 {
    public static void main(String[] args) {
        Thread t1 = new Counting("First Thread");
        Thread t2 = new Counting("Second Thread");

        t1.start();
        t2.start();
        /*
        Second Thread : 0
        Second Thread : 1
        Second Thread : 2
        Second Thread : 3
        Second Thread : 4
        Second Thread : 5
        Second Thread : 6
        Second Thread : 7
        Second Thread : 8
        Second Thread : 9
        First Thread : 0
        First Thread : 1
        First Thread : 2
        First Thread : 3
        First Thread : 4
        First Thread : 5
        First Thread : 6
        First Thread : 7
        First Thread : 8
        First Thread : 9
         */
    }
}
