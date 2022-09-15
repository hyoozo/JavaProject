package exam_array_in_array;

public class ArrayExamStudent {
    public static void main(String[] args) {
        String[] name = {"홍길동", "김철수", "이진희"};
        int[][] score = {{90,75,61},
                         {55,56,46},
                         {90,90,90}};
        int sum;
        double avg;
        for (int i = 0; i < 3; i++){
            System.out.print(name[i] + " : ");
            sum = 0;
            for (int j = 0; j < score.length; j++){
                System.out.print(score[i][j]+  "  ");
                sum += score[i][j];
            }
            System.out.print(sum  +  "  ");
            avg = (double)sum/name.length;
            System.out.printf("%.2f\t",avg);

            if(avg >= 90){
                System.out.print("A\tpass");
            }else if (avg >= 80){
                System.out.print("B\tpass");
            } else if (avg >= 70) {
                System.out.print("C\tpass");
            }else if(avg >= 60) {
                System.out.print("D\tpass");
            }else {
                System.out.print("F\tnopass");
            }

            System.out.println();
        }

    }
}
//과제임