package exam_runtime_exception;

// 전부 예외가 발생되는 예제입니다.
// 어떤 문구에서 예외가 발생되는지 확인해라


public class RuntimeExceptionCase {
    public static void main(String[] args) {
        // RuntimeException 종류 - 비체크 예외.
                                //비체크 예외는 처리해도되고 안해도되고???????
        // ArrayIndexOutOfBoundsException 예외 발생
        try {
            int[] arr = new int[3];
            arr[4] = 20;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        // ClassCaseException 예외 발생
        try {
            Object x = Integer.valueOf(0);
            // 부모 클래스명 참조변수 = new 서브클래스생성자();
            System.out.println((String) x);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

        //NegativeArraySizeException 예외 발생
        try {
            int[] arr = new int[-10];
            System.out.println(arr.toString());
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        }

        //NullPointerException 예외 발생
        try {
            String str = null;
            @SuppressWarnings("null")
            int len = str.length();
            System.out.println(len);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        //NumberFormatException 예외 발생
        try {
            String data1 = "100";    // ->100
            String data2 = "a100";   // ->X

            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
