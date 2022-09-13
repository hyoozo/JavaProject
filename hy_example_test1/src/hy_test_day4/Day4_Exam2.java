package hy_test_day4;

import java.util.Scanner;

public class Day4_Exam2 {
    public static void main(String[] args) {
        double midExam = 0;  //중간고사
        double finalExam = 0; //기말고사
        double report = 0; //레포트
        double attendance = 0; //출석점수
        double grades = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("중간고사 점수를 입력하세요 : ");
            midExam = scan.nextInt();
        System.out.print("기말고사 점수를 입력하세요 : ");
            finalExam = scan.nextInt();
        System.out.print("레포트 점수를 입력하세요 : ");
            report = scan.nextInt();
        System.out.print("출석점수를 점수를 입력하세요 : ");
            attendance = scan.nextInt();

        System.out.println("-----결과입니다-----");
        System.out.println("중간고사 : "+midExam);
        System.out.println("기말고사 : "+finalExam);
        System.out.println("레포트 : "+report);
        System.out.println("출석점수 : "+attendance);
        System.out.println();

        grades =  ((midExam + finalExam)/2)*0.6 + (report * 0.2) + (attendance * 0.2);
        System.out.printf("성적 : %.2f\n",grades);


        if(grades >= 90){
            System.out.println("학점 : A");
        } else if(grades >= 80){
            System.out.println("학점 : B");
        } else if (grades >= 70) {
            System.out.println("학점 : C");
        } else if (grades >= 60) {
            System.out.println("학점 : D");
        } else
            System.out.println("학점 : F");

        switch((int) (grades/10)) {
            case 9:
            case 8:
                System.out.println("평가 : excellent");
                break;
            case 7:
            case 6:
                System.out.println("평가 : good");
                break;
            case 5:
                System.out.println("평가 : poor");
                break;
        }
        scan.close();
    }
}
