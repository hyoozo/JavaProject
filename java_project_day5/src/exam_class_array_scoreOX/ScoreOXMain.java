package exam_class_array_scoreOX;

import javax.net.ssl.SNIHostName;
import java.util.Scanner;

public class ScoreOXMain extends ScoreOX{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ScoreOXMain ox = new ScoreOXMain();

        System.out.println("--------------- 시 험 결 과 ---------------");
        System.out.println("----------------------------------------");
        System.out.printf("%3s%7s%9s%10s%10s%10s%10s%10s%10s\n","번호","이름","1번답","2번답","3번답","4번답","5번답","점수","등수");
        System.out.println("----------------------------------------");
    }
}
