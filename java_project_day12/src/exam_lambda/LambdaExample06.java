package exam_lambda;

interface StringFunction{
    String modify(String str);
}
public class LambdaExample06 {
    static String test(StringFunction sf, String str) {
        return sf.modify(str);
    }

    public static void main(String[] args) {
        String cityName = "Korea,Australia,China,Germany,Spain,Turkey";

        StringFunction sf1 = (str -> {
            String result = "";
            char c;
            for (int i = 0; i < str.length(); i++) {
                c = str.charAt(i);
                if (c == ',') {
                    result += " ";
                } else {
                    result += c;
                }
            }
            return result;
        });

        String s1 = test(sf1, cityName);
        System.out.println("결과값1:" + sf1.modify(cityName));
        //결과값1:Korea Australia China Germany Spain Turkey

        String s2 = test(str -> {
            int max = 0;
            int index = 0;
            String[] word = str.split(",");
            for (int i = 0; i < word.length; i++) {
                if (max < word[i].length()) {
                    max = word[i].length();
                    index = i;
                }
            }
            return word[index];
        },cityName);
        System.out.println("결과값2:"+s2);
        //결과값2:Australia
    }
}
