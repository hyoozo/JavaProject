package hy_test_day5;

public class ForMultiplicationTableExample {
    public static void main(String[] args) {

        for(int i = 2; i <= 9; i++){
            for(int k = 1; k <= 9; k++){
//                System.out.println(i+" * "+k+" = "+(i*k));
                System.out.printf("%d * %d = %d\n", i, k, (i * k));
            }
            System.out.println();
        }

        for (int m = 1; m <= 9; m++) {
            for (int n = 2; n <= 9; n++) {
                System.out.printf("%d * %d = %2d //", n, m, (m*n));
            }
            System.out.println();
        }
    }
}
