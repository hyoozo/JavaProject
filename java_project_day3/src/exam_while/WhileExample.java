package exam_while;

public class WhileExample {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("정수 : ");
        while (i <= 5){
            System.out.print(i + " ");  //1 2 3 4 5
            i++;
        }
        System.out.println();

        i = 5;
        System.out.println("정수: ");
        while (true){
            System.out.print(i + " ");  // 5 4 3 2 1
            i--;
            if( i < 1){
                break;
            }
        }
        System.out.println();
        //1부터 100까지의 합 출력하기
        int num =  1, sum = 0;
        while (num <= 100){
            sum = sum + num;  //sum += num
            num = num + 1;    // num++
        }
        System.out.println(sum);
        int total = 0;
        for(int x = 1; i<=100; i++){
            total += i;
        }
        System.out.println(total);
    }
}