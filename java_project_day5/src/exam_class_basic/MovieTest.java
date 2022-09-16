package exam_class_basic;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class MovieTest {
    public static Scanner scan = new Scanner(System.in);
    public static void scanData(Movie mv){
        System.out.print("영화 제목 : ");
        mv.movieTitle = scan.nextLine();
        System.out.print("영화 평점 : ");
        mv.movieGrade = scan.nextLine();
        System.out.print("영화 감독 : ");
        mv.moviDirector = scan.nextLine();
        System.out.print("영화 연도 : ");
        mv.movieYear = scan.nextLine();
    }
    public static void main(String[] args) {
        Movie mv2 = new Movie();
        scanData(mv2);

        Movie mv3 = new Movie();
        scanData(mv3);

        System.out.println("영화 정보는 다음과 같다");
        System.out.println("---------------------------");
        System.out.println("제목\t\t평점\t\t감독\t\t개봉일");
        System.out.println("---------------------------");
        System.out.println(mv2.toString());
        System.out.println(mv3.toString());


        scan.close();
    }

}
