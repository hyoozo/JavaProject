package exam_class_basic;

import java.util.Scanner;

//성적을 출력하는 Score클래스 정의함
// 이름, 국어, 영어, 수학, 총점을 저장하고자 한다 (필드 구현)
// 필드에 값을 설정할 수 있는 기능, 점수들의 합을 구하는 기능, 평균을 구하는 기능, 학점을 구하는 기능
// 모든 필드를 출력할 수 있는 기능을 포함하도록 한다. (메서드 구현)
// 사용자로 이름 및 점수들을 입력받아 아래의 결과를 출력하도록 한디.
public class ScoreTest {
    public static Scanner scan = new Scanner(System.in);
    public static void scanData(Score sc){ // 매개변수 : 클래스명 참조변수 = 주솟값
        System.out.print("학생 이름: ");
        sc.name = scan.nextLine();
        System.out.print("국어점수 : ");
        sc.kor = scan.nextInt();
        System.out.print("영어점수 :  ");
        sc.eng = scan.nextInt();
        System.out.print("수학점수 :  ");
        sc.math = scan.nextInt();
        scan.nextLine();
    }
    public static void main(String[] args) {
        Score score1 = new Score();
        Score score2 = new Score();
        Score score3 = new Score();
        scanData(score1);  //score1 의 주솟값을 scanData에 담는다.
        scanData(score2);
        scanData(score3);

        System.out.println("===================================");
        System.out.println("이름    / 국어 / 영어 / 수학 / 총점 / 평균");
        System.out.println("===================================");
        System.out.println(score1.toString());
        System.out.println(score2.toString());
        System.out.println(score3.toString());
    }
}
