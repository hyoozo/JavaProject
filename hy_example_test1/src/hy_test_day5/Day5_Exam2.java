package hy_test_day5;

import java.util.Arrays;
import java.util.Scanner;

//[요구사항2] 과목과 점수가 짝을 이루도록 2개의 배열을 작성하여라
public class Day5_Exam2 {
    public static void main(String[] args) {
        String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};
        boolean check = false;
        String courseName = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("[과목 정보] 종료를 원하면 '종료'라고 입력");
        System.out.println(Arrays.toString(course));

        while (!(courseName.equals("종료"))) {
            System.out.print("과목 이름>>  ");
            courseName = scan.nextLine();

            for (String name : course) {
                if (name.equals(courseName)) {
                    check = true;
                    break;
                }
            }

            if (check) {
                for (int i = 0; i < course.length; i++) {
                    if (course[i].equals(courseName)) {
                        System.out.println(course[i] + "의 점수는 " + score[i]);
                        break;
                    }
                }
            } else {
                System.out.println("없는 과목입니다.");
            }
        }

        System.out.println("프로그램 종료");
        scan.close();
    }
}
