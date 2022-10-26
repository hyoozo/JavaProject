package tsetExample;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("test02.txt",true);
//            fw.write(97);
//            fw.write(65);
//            fw.write("안녕ㅎㅎㅎ하세요");
            fw.write("???");
            fw.append("...");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
