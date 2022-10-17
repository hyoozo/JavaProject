package exam_reader_read;

import java.io.*;

public class ReadExample1 {
    public static void main(String[] args) throws Exception{
//        Reader reader = new FileReader("test.txt");
//        int readData;
//        while (true) {
//            readData = reader.read();
//            if (readData == -1) {
//            break;
//            }
//            System.out.println((char)readData);
//        }

        //문자를 읽어 오고자 할 때 BufferedReader의 readLine() 메소드를 이용.
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        String str = null;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();
    }
}
