package exam_sleep;
/*
다음과 같이 문자가 존재합니다.
Pride will have a fall
Power is dangerous unless you have humility
Office changes manners.
Empty vessels make the most sound.
위 문자를 4초 간격으로 출력하도록 코드 작성해 주세요.
 */
public class SleepTest extends Thread{
    public static void main(String[] args) {
        String str[] = {
        "Pride will have a fall",
        "Power is dangerous unless you have humility",
        "Office changes manners.",
               "Empty vessels make the most sound"
    };

        for (int i = 0; i < str.length; i++) {
            try {
                Thread.sleep(4000);
                System.out.println(str[i]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
