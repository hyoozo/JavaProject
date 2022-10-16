package exam_class;

import java.awt.*;
import java.io.*;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/*
[요구사항]
주어진 2개의 텍스트 파일 (test.txt, result.txt) 을 합하여
하나읜 파일 (writer.txt)로 만드는 프로그램을 작성하시오.
 */
public class FileTwoTest {
    public static void main(String[] args) {
        OutputStream test = null;
        OutputStream result = null;
        InputStream writer = null;

        try {
            test = new FileOutputStream("/Users/j/Desktop/StreamTestFile/test.txt");
            byte[] data = "가장 위대한 영광은 한번도 실패하지 않음이 아니라 실패할 때마다 다시 일어서는 데에 있다.".getBytes();
            for (int i = 0; i < data.length; i++) {
                test.write(data[i]);
            }

            result = new FileOutputStream("/Users/j/Desktop/StreamTestFile/result.txt");
            byte[] data1 = ("""
                    행복은 성취의 기쁨과 창조적 노력이 주는 쾌감 속에 있다. (프랭클린 D. 루스벨트)
                     우리가 할 수 있기 전에 배워야 하는 일들을, 우리는 하면서 배운다. (아리토텔레스)
                     저는 미래가 어떻게 전개될지는 모르지만, 누가 그 미래를 결정하는지는 압니다. (오프라 윈프리)""").getBytes();
            for (int i = 0; i < data1.length; i++) {
                result.write(data1[i]);
            }
            System.out.println("파일이 생성되었습니다.");

            File file = new File("/Users/j/Desktop/StreamTestFile/test.txt");
            File file1 = new File("/Users/j/Desktop/StreamTestFile/result.txt");
            File newFile = new File("/Users/j/Desktop/StreamTestFile/writer.txt");
            Files.copy(file.toPath(),newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);


            System.out.println("복사된 파일이 생성되었습니다.");






        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("저장할 폴더가 생성되어 있지 않습니다.");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                if (test != null) {
                    test.close();
                }
                if (result != null) {
                    result.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
