package exam_for;

public class ForOverExample {
    public static void main(String[] args) {

        /* 결과
        1 2 3 4 5
         */
        for (int x = 1; x <= 5; x++) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("\n 중첩 반복문");

        /*결과
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
         */
        for (int y = 1; y <= 3; y++) {   //행 3개
            for (int x = 1; x <= 5; x++) {  //열 5개
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();

        /*결과
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
         */
        for (int i = 5; i >= 1; i--) {
            for (int y = 1; y <= i; y++){
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println();

        /*결과
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        for (int i = 1; i <= 5; i++){
            for (int y = 1; y <= i; y++){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
