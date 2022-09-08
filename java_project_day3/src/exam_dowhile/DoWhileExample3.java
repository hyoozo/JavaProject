package exam_dowhile;

public class DoWhileExample3 {
    public static void main(String[] args) {

        int num = 0;
        do{
            System.out.println("num의 값:"+num);
            num++;
        } while (num < 0);
        System.out.println();

        int i = 1;  //1에서 10까지 출력
        do{
            System.out.println(i+" ");
            i++;
        }while(i<=10);
        System.out.println();

        i = 10;
        do{
            System.out.println(i+" ");
            i--;
        }while(i>0);
        System.out.println();

        //1에서 100까지의 합을 출력해 주세요 (do ~ while문을 이용해서)

    }
}
