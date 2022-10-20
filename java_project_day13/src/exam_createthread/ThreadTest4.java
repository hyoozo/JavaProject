package exam_createthread;

class Food extends Thread{
    private String name;

    public Food(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(name + i);
        }
    }
}
class Phone extends Thread {
    private String name;

    public Phone(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name+i);
        }
    }
}
public class ThreadTest4 {
    public static void main(String[] args) {
        Food work1 = new Food("음식 먹기 : ");
        Phone work2 = new Phone("카톡 확인 : ");

        work1.start();
        work2.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("TV 보기 : " +i);
        }
    }
    /*
    TV 보기 : 1
    TV 보기 : 2
    TV 보기 : 3
    TV 보기 : 4
    TV 보기 : 5
    TV 보기 : 6
    TV 보기 : 7
    TV 보기 : 8
    TV 보기 : 9
    TV 보기 : 10
    카톡 확인 : 1
    음식 먹기 : 0
    카톡 확인 : 2
    음식 먹기 : 1
    카톡 확인 : 3
    음식 먹기 : 2
    카톡 확인 : 4
    음식 먹기 : 3
    카톡 확인 : 5
    음식 먹기 : 4
    카톡 확인 : 6
    음식 먹기 : 5
    카톡 확인 : 7
    음식 먹기 : 6
    카톡 확인 : 8
    음식 먹기 : 7
    카톡 확인 : 9
    음식 먹기 : 8
    카톡 확인 : 10
    음식 먹기 : 9
    음식 먹기 : 10
     */
}
