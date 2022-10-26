package tsetExample;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Test01 {
    public void output() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("test02.txt");
            fw.write(97);
            fw.write(65);
            fw.write("안녕");

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

        public static void main (String[]args){
        Test01 t = new Test01();
        t.output();
//        String str = "Apple, Kiwi, Strqw, Banana";
//        String[] arr = str.split(", ");
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i].equals("Kiwi")) {
//
//                System.out.println(arr[i]);
//
//            }
//
//        }
//        double a = Double.parseDouble("13.5");
//        System.out.println(a);

            String str = "Apple, Kiwi, Strawberry, Banana";

            String[] arr = str.split(", ");

            System.out.println(arr[1]);
    }
    }
