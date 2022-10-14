package exam_data_stream;

import java.io.*;

public class DataStreamTest {
    public static void main(String[] args) {
        double[] prices = {19.99,9.97,23.89,4.23};
        int[] units = {12, 8, 23, 56};
        String[] desce = {"Apple", "Orange", "banana", "grape"};
        /*
        base.dat 파일에 각각 배열을 내용 순서대로 저장하고 순서대로 읽어와서
        전체 합(가격 * 수량)을 출력하도록 프로그램을 작성해 주세요.
         */

        DataInputStream in = null;
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("base.dat")));

            for (int i = 0; i < prices.length; i++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(desce[i]);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}