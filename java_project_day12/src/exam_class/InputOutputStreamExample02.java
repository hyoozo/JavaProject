package exam_class;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/*
"C:/Temp/intest02.txt" 를 직접 생성한다.
해당 파일에는 아래의 내용을 작성한 후 저장한다.
Hello World!
My Name is IOStream.
이 내용을 읽어 C:/Temp/outtest02.txt 파일을 생성하여 저장한다.
 */
public class InputOutputStreamExample02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("C:/Temp/intest02.txt");
            fos = new FileOutputStream("C:/Temp/outtest02.txt");
            int data = -1;

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("파일복사가 완료 되었습니다.");
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("파일이 존재하지 않거나 경로가 맞지 않아 더 이상 작업을 진행할 수 없습니다.");
        } catch (IOException ioException) {
            System.out.println("파일 입출력에 문제가 발생하여 더 이상의 작업을 진행할 수 없습니다.");
        } catch (Exception e) {
            System.out.println("오류 발행으로 더 이상의 작업을 진행할 수 없습니다.");
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                    if (fos != null) {
                        fos.close();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
