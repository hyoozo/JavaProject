package exam_throws;

import java.io.IOException;

public class ExceptionMethod1 {
    public static void main(String[] args) {
        System.out.println(readString());

    }

    public static String readString(){
        byte[] buf = new byte[100];
        System.out.println("문자열을 입력하시오.");
        int readCount = 0;
        try {
            readCount = System.in.read(buf); // 자바: 한글 한글자 2byte / 영문 한글자 1byte
            System.out.println(readCount);

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
                // String (바이트배열, 위치정보, 길이수) : byte 배열의 값을 문자열로 생성
        return new String(buf, 0, readCount - 1);
                                                        // -2로주면 뒤에 글자 하나 지워짐 ? * 이클립스에서 2바이트로 설정
                                                        // 현주야
                                                        // 10
                                                        // 현주�

                                                        // -1로 주면 뒤에 글자 안지워짐   ? * 인텔리제이에서 1바이트로 설정
                                                        // 현주야
                                                        // 10
                                                        // 현주야
    }
}
