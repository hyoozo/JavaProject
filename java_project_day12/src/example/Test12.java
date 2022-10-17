package example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test12 {
    public static void main(String[] args) throws IOException {
        Date date = new Date();

        System.out.println(date);

        SimpleDateFormat format1 = new SimpleDateFormat("yyyy년MM월dd일");
        String path = "/Users/j/Desktop/Temp/";
        String date2 = format1.format(date);

        File file = new File(path + date2 + ".txt");
        FileWriter fw = new FileWriter(file, false);
    }
}
