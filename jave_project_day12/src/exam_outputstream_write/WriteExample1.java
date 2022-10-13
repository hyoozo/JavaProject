package exam_outputstream_write;

import java.io.*;

public class WriteExample1 {
    public static void main(String[] args) {
        OutputStream os = null; //추상클래스 참조변수 = null
        try {
            os = new FileOutputStream("C:/Temp/test.txt"); //참조변수 = new 서브클래스 생성자();

            // getBytes() 메소드는 문자열을 바이트 배열로 변환하여 반환하는 메소드
            /*byte[] data = "Java".getBytes();
            for (int i = 0; i < data.length; i++) {
                os.write(data[i]);
            } //Java  ( 메모장에 표시되는 글자) */

            /*byte[] data = "Hello! Java".getBytes();
            os.write(data);
            //Hello! Java  (메모장에 표시되는 글자) */

            /*byte[] data = "HelloWorld! Java".getBytes();
            os.write(data,1,2); // write 배열의 값 중에서 첫번째 인덱스 부터 2개의 길이 만큼만 저장.
            // el (메모장에 표시되는 글자) */

            byte[] data = "God doesn't require us to succed.\nhe only requires that you try.".getBytes();
            os.write(data);
            //God doesn't require us to succed.
            //he only requires that you try. (메모장에 표시되는 글자)

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("저장할 폴더가 생성되어 있지않습니다.");  // C: 에 Temp 폴더 없을때 .
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            try{
                if (os != null){
                    os.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
