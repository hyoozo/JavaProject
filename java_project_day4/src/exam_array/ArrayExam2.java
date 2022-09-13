package exam_array;

import java.util.Scanner;
//5명의 국어점수는 배열에 초기화하고 영어점수는 입력을 받아 배열에 저장하여 출력하는 프로그램
public class ArrayExam2 {
    public static void main(String[] args) {
        int[] kor = new int[]{80,95,90,85,100}; //배열 초기화 (국어점수)
        int[] eng = new int[5];

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < eng.length; i++){  //입력값 배열저장(영어점수)
            System.out.println("영어 점수를 입력해 주세요.");
            eng[i] = scan.nextInt();
        }
        for(int i = 0; i < kor.length; i++){  //배열값 출력(국어점수와 영어점수의 배열의 크기가 동일함으로
            System.out.printf("국어 :%3d",kor[i]);
            System.out.printf("영어 :%3d\n",eng[i]);
        }
        scan.close();
    }
}
