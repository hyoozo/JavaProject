package exam_while;

import java.util.Scanner;

//학점 구하기
public class WhileExample2 {
    public static void main(String[] args) {
        int jumsu = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("점수는 0~100 사이로 입력해주세요.");
        jumsu = sc.nextInt();

        while (jumsu < 0 || jumsu > 100) {
            System.out.println("점수는 0~100 사이로 입력해주세요.");
            jumsu = sc.nextInt();
        }

        char hakjum = '0';
        if (jumsu < 0 || jumsu > 100) {
            System.out.println("점수는 0~100 사이로 입력해주세요.");
        }else {
            if (jumsu >= 90) {
                hakjum = 'A';
            } else if (jumsu >= 80) {
                hakjum = 'B';
            } else if (jumsu >= 70) {
                hakjum = 'C';
            } else if (jumsu >= 60) {
                hakjum = 'D';
            } else {
                hakjum = 'F';
            }

            switch (jumsu / 10) {
                case 10:
                case 9:
                    hakjum = 'A';
                    break;
                case 8:
                    hakjum = 'B';
                    break;
                case  7:
                    hakjum = 'C';
                    break;
                case 6:
                    hakjum = 'D';
                    break;
                default:
                    hakjum = 'F';
            }
            System.out.printf("점수 = %d 학점 = %c", jumsu, hakjum);
        }
        sc.close();
    }
}
