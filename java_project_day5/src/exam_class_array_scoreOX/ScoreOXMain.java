package exam_class_array_scoreOX;

import java.util.Scanner;

public class ScoreOXMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ScoreOX[] ox = {
                    new ScoreOX(1,"홍길동", new int[]{1,2,1,3,4}),
                    new ScoreOX(2,"김철수", new int[]{1,1,1,1,1}),
                    new ScoreOX(3,"이진희", new int[]{1,2,1,3,1}),
                    new ScoreOX(4,"조현민", new int[]{1,1,1,3,1}),
                    new ScoreOX(5,"최현정", new int[]{1,4,2,5,4})
        };

            for (int i = 0; i < ox.length; i++) {
                ox[i].compute();
            }

            ScoreOX.ranking(ox);

            System.out.println("* * 시험결과 * *");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.printf("%3s%7s%10s%8s%9s%9s%7s%8s%10s\n", "번호", "이름", "1번답", "2번답", "3번답", "4번답", "5번답", "점수", "등수");
            System.out.println("---------------------------------------------------------------------------------------");

            for (ScoreOX scoreOX : ox) {
                scoreOX.display();
            }
            System.out.println("전체맞은 개수 = "+ ScoreOX.tot);
    }
}
