package hy_test_day5;
import java.util.Arrays;
import java.util.Scanner;

//간단한 극장 예약 시스템을 작성하여 보자.
//아주 작은 극장이라서 좌석이 10개밖에 안된다.
//사용자가 예약을 하려고 하면 먼저 좌석 배치표를 보여준다.
//즉 예약이 끝난 좌석은 1로, 예약이 안된 좌석은 0으로 나타낸다.
public class Day5_Exam3 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {0,0,0,0,0,0,0,0,0,0};

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));
            System.out.print("원하시는 좌석번호를 입력하세요 (종료는 -1): ");
            int seat = scan.nextInt();


            if (seat == -1) {
                break;
            }
            if (seat >= 1 && seat <= 10) {
                if (b[seat - 1] == 0) {
                    b[seat - 1] = 1;
                    System.out.println("예약완료.");
                } else {
                    System.out.println("예약불가");
                }
            } else {
                System.out.println("번호 잘못 기입");
            }
        }


        System.out.println("종료합니다.");
        scan.close();
        }

    }
//과제임