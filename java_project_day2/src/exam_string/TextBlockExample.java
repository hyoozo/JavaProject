package exam_string;

public class TextBlockExample {
    public static void main(String[] args) {
//        System.out.println("{");
//        String id = "\t\"id\":\"javauser\"";
//        String name = "\"name\": \"홍길동\"";
//        System.out.println(id);
//        System.out.println(name);
        String str1 = "{\n" +
        "\t\"id\":\"javauser\",\n" +
        "\t\"name\":\"홍길동\"\n" +
        "}";
        System.out.println(str1);
        System.out.println("------------------------");
        String str2 = """
                {
                    "id":"javauser",
                    "name":"홍길동"
                }
                """; //jdk13이상
        System.out.println(str2);
        System.out.println("------------------------");
        String str = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될 것입니다.
                """;   ///""" """ 텍스느 블럭안에 있는 글을 출력한다. 중간에 \는 붙여쓰기이다. JDK14 이상만 가능.
        System.out.println(str);
    }
}
