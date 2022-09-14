package hy_test_exam;

public class Star {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j < 5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i <= 5; i++){
//            for (int j = 0; j < i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= 12; i++){
            System.out.println(i+"월");

            for (int j = 1; j <= 31; j++){

                if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
                    System.out.print(j + "일\t");
                    if(j%7 == 0){
                        System.out.println();
                    }
                } else if (i == 2){
                    System.out.print(j + "일\t");
                    if(j == 28) {
                        break;
                    }
                    if(j%7 == 0){
                        System.out.println();
                    }
                } else {
                    System.out.print(j + "일\t");
                    if(j == 30) {
                        break;
                    }
                    if(j%7 == 0){
                        System.out.println();
                    }
                }
            }
            System.out.println("\n");
        }
    }
}
