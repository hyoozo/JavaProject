package exam_if;

import java.util.Scanner;
//예제2 : 사용자로 하여금 점수를 입력받아 학점을 출력하는 프로그램을 작성해 주세요.
//작성 완료 후 점수가 0~100사이로 입력하지 않았다면
//"점수는 0과 100 사이로 입력해 주셔야 합니다."라고 출력되도록 제어한다.
public class IfExample2 {
    public static void main(String[] args) {
        int jumsu = 0;
        char hakjum = ' ';

        Scanner scan = new Scanner((System.in));
        do {
            System.out.print("점수는 0~100 사이로 입력해 주세요.");
            jumsu = scan.nextInt();

                if (jumsu >= 0 && jumsu <= 100) {
                    if (jumsu >= 90) {
                        hakjum = 'A';
                    } else if (jumsu >= 80) {    //80~89이 지정 위에서 90이라는 숫자가 있기때문에!!
                        hakjum = 'B';
                    } else if (jumsu >= 70) {
                        hakjum = 'C';
                    } else if (jumsu >= 60) {
                        hakjum = 'D';
                    } else {
                        hakjum = 'F';
                    }
                    System.out.printf("점수 = %d 학점 = %c ", jumsu, hakjum);
                }
            }
            while (jumsu < 0 || jumsu > 100); {  //사이범위를 벗어났을때 반복문
//                //while 조건문이 false면 빠져나옴..
        }
            scan.close();
    }
}
