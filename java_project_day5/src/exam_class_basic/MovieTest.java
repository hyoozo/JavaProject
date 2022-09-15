package exam_class_basic;

import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {
        //메소드 호출 및 출력 첫번째 방법
        Movie movie = new Movie();
        movie.movieMethod("TOP GUN", "조지프 코신스키", 20220622, "action");

        //메소드 호출 및 출력 두번째 방법
        Movie movie1 = new Movie();
        movie1.title = "공조2";
        movie1.director = "이석훈";
        movie1.date = 20220907;
        movie1.genre = "action";
        movie1.moviePrint();

        Scanner scan = new Scanner(System.in);

        //메소드 호출 및 출력 세번째 방법
        Movie movie2 = new Movie();
//        movie2.title = "헌트";
//        movie2.director = "이정재";
//        movie2.date = 20220810;
//        movie2.genre = "action";
        System.out.println("영화제목을 입력하세요:");
        movie2.title = scan.nextLine();
        System.out.println("감독:");
        movie2.director = scan.nextLine();
        System.out.println("개봉일:");
        movie2.date = scan.nextInt();
        scan.nextLine();// 추가된 nextLine() 개행문자를 받는다. (제거한다)

        System.out.println("장르:");
        movie2.genre = scan.nextLine();

        movie2.moviePrint();

    }
}
