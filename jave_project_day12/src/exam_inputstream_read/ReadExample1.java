package exam_inputstream_read;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {
    public static void main(String[] args) {
        /* try - catch - finally 블록 이용한 예외처리 */
        InputStream is = null;
        try {
            is = new FileInputStream("C:/Temp/test.txt");  // 파일이 존재 하지 않으면 오류.
            System.out.println("[읽어 들인 문자 ]");

           /* int readByte;
            while (true) {  // 조건이 무조건 참 ( 무한반복)
                readByte = is.read(); // 한바이트 읽기  ( 읽은게 코드값으로 읽히기 때문에)
                if (readByte == -1) {  // 더이상 읽을 파일이 없을때 -1
                    break;
                }
                System.out.println((char) readByte);  // 코드값을 char 로 변환한거다.
                //[읽어 들인 문자 ]
                //J
                //a
                //v
                //a
            } */
            /*int readByteNO;
            byte[] readBytes = new byte[4];  // 배열을 만들어 봅시다.
            String data = "";
            while (true) {
                // 읽어 들인 바이트 값을 바이트 배열에 저장하고 그 바이트 수를 반환
                readByteNO  = is.read(readBytes); //파일을 읽는다. 읽어드린 바이트 수를 반환하여
                System.out.println("읽은 바이트 수 : " + readByteNO);  // 확인을 위한 코드
                if (readByteNO == -1) {
                    break;
                }
                data += new String(readBytes, 0, readByteNO);  //읽어드린것을 문자열로 만들었다. 한개씩 담으면서 저장된다 (반복되어서)
            }
            System.out.println(data);
            //[읽어 들인 문자 ]
            //읽은 바이트 수 : 4
            //읽은 바이트 수 : -1
            //Java */

            int readByteNo;
            byte[] readBytes = new byte[10];
            //read 바이트 배열에 저장할 길이수는 5이고 배열의 저장 위치는 2번째부터.
            readByteNo = is.read(readBytes,2,5);
            System.out.println("리턴 바이트 수 : "+ readByteNo);

            for (int i = 0; i < readBytes.length; i++) {
                System.out.println((char) readBytes[i]);
            }
            //[읽어 들인 문자 ]
            //리턴 바이트 수 : 4
            //
            //
            //J
            //a
            //v
            //a
            //
            //
            //
            //

        } catch (IOException ioException) {   // FileNotFoundException 은 IOException의 서브 클래스이다.
            ioException.printStackTrace();
        } finally {  // 에러가 나던 안나던 실행될 수있는 블럭
            try {
                if (is != null) {  // if문 있어야된다.. 참조변수가 null 이 아니다라는 뜻은 할당받은 상태이다.
                    is.close();  // 무조건 해지해줘야한다.
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
