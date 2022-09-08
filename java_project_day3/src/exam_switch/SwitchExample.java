package exam_switch;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        char hakjum = ' ';
        int jumsu = 0;

        Scanner scan = new Scanner((System.in));
        System.out.print("점수는 0~100 사이로 입력해 주세요.");
        jumsu = scan.nextInt();

        switch (jumsu / 10){  //정수를 10으로 나누면 정수.
            case  10: case 9:  //10의 자리를 나타내는것임
                hakjum = 'A';
                break;
            case 8:
                hakjum = 'B';
                break;
            case 7:
                hakjum = 'C';
                break;
            case 6:
                hakjum = 'D';
                break;
            default:
                hakjum = 'F';
        }
        System.out.println("당신의 점수는 : "+jumsu+" / 당신의 학점은 : "+hakjum);
    }
}
