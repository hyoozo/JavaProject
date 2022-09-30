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
            arr[4] = 20;             //위에 인덱스는 3인데 없는 인덱스4에 값을 넣어서 예외발생.
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();  // 사용자에게 오류를 알려주고 싶을때, System.out.println("오류발생")으로 문구 적어줘도됨.
        }

        // ClassCaseException 예외 발생
        try {
            // 부모 클래스명 참조변수 = new 서브클래스생성자();
            Object x = Integer.valueOf(0);  // 0을 주면 정수형 값으로 인지함. 0은 스택에 저장
                                        // Integer.valueOf()은 기초형을 참조형으로 바꿔주어 주소값을 보낸준디ㅏ.
                                        //
            System.out.println((String) x);   //String으로 형변환으로 하여 오류.
                                                    //??
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

        //NegativeArraySizeException 예외 발생
        try {
            int[] arr = new int[-10];
            System.out.println(arr.toString());
        } catch (NegativeArraySizeException e) {  // 이예외도 if문으로 처리함.
            e.printStackTrace();
        }

        //NullPointerException 예외 발생
        try {   // 가장 많이 만나는 예외임.!
            String str = null;
            @SuppressWarnings("null")
            int len = str.length();
            System.out.println(len);
        } catch (NullPointerException e) {   // 이 예외는 if문으로 처리함.
            e.printStackTrace();
        }

        //NumberFormatException 예외 발생
        try {
            String data1 = "100";    // ->100
            String data2 = "a100";   // ->X

            int value1 = Integer.parseInt(data1);  //문자를 숫자로 변환하려는 코드
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch (NumberFormatException e) {  // 이예외는 예외처리를 많이 함.
            e.printStackTrace();
        }
    }
}           //예외처리를 반드시 해야되는 예외는 " 체크예외 "
                //입출력 예외가 있다.
                    //이 예외는 무조건 예외처리 해야됨.
