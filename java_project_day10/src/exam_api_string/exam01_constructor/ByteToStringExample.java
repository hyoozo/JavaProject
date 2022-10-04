package exam_api_string.exam01_constructor;

import java.util.Arrays;

public class ByteToStringExample {
    public static void main(String[] args) {
        byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};

        //아스키코드 이용
        //Hello Java
        String str1 = new String(bytes);  //bytes배열을 문자열로 만들것
        System.out.println(str1.toString());

        //Java
        String str2 = new String(bytes, 6, 4);
        //                             //6번째인덱스 ~  4개를 가져와.{ 74,97,118,97 }
        System.out.println(str2);

                            //byte 배열을 String으로 바꾸고 싶다면 str.getBytes()
        byte[] byteArray = str2.getBytes();
        System.out.println(Arrays.toString(byteArray));

        char[] value = {'H', 'e', 'l','l','o'};
        String str = new String(value);
        System.out.println("배열을 이용한 문자열 객체 생성 :"+ str);


    }
}
/* console
Hello Java
Java
[74, 97, 118, 97]
배열을 이용한 문자열 객체 생성 :Hello
 */
