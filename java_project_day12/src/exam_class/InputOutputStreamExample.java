package exam_class;

import jdk.dynalink.StandardNamespace;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/*
"C:/Temp/intest.txt" 를 직접 생성한다.
해당 파일에는 아래의 내용을 작성한 후 저장한다.
Hello World!
My Name is IOStream.
이 내용을 읽어 C:/Temp/outtest.txt 파일을 생성하여 저장한다.
 */
public class InputOutputStreamExample {
    public static void main(String[] args) {
        OutputStream hj = null;
        InputStream in = null;
        try {
            hj = new FileOutputStream("C:/Temp/intest.txt");

            byte[] data = "Hello World! \nMy Name is IOStream.".getBytes();

            for (int i = 0; i < data.length; i++) {
                hj.write(data[i]);
            }
            System.out.println("파일이 생성되었습니다.");

//            in = new FileInputStream("C:/Temp/intest.txt");
//            System.out.println("[읽어 들인 문자]");
//            int readByte;
//            while (true) {
//                readByte = in.read();
//                if (readByte == -1) {
//                    break;
//                }
//                System.out.println((char) readByte);
//            }

            File file = new File("C:/Temp/intest.txt");
            File newF = new File("C:/Temp/outtest.txt");
            Files.copy(file.toPath(),newF.toPath(), StandardCopyOption.REPLACE_EXISTING);
            // 파일이 복사되어 생성됨.
            System.out.println("복사된 파일이 생성되었습니다.");

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("저장할 폴더가 생성되어 있지 않습니다.");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                if (hj != null) {
                    hj.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
