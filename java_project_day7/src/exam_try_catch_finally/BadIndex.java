package exam_try_catch_finally;

public class BadIndex {
    public static void main(String[] args) {
        int [] array = new int[10];

        try {
            for (int i = 0; i < 10; i++) {
                array[i] = i+1;
            }
            int result = array[10];
            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("캐치로 잡았찌롱");
        }

        System.out.println("과연......이 문장이 실행될까?>>>>");
    }
}
