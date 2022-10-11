package exam_collectionTest;

import java.util.*;

/*장기 자랑 프로그램에 사용될 수 있는 심사 위원들의 점수를 집계하는 프로그램을 작성하라.
점수는 0.0에서 10.0까지 가능하다.
10명의 점수 입력받아 그 중에서 최고 점수 (Collection.max ( 리스트의 참조변수))와
최저 점수 (Collections.min(리스트의 참조변수)) 는 제외된다.
Double 타입의 ArrayList 를 사용하라.
*/
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> score = new ArrayList<>();

        double num = 0;
        double sum = 0;

        //점수를 받는 반복문
        System.out.println("심사 위원 점수를 입력하세요. ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". 심사위원의 점수 : ");
            num = sc.nextDouble();
            score.add(num);
        }

        //최고 점수와 최저 점수 삭제
        score.remove(Collections.max(score));
        score.remove(Collections.min(score));

        //식제된 score 값을 모두 더해 sum 에 담아서 출력
        for (Double aDouble : score) {
            sum += aDouble;
        }
        System.out.println("점수의 합 : " + sum);

        sc.close();
    }
}
