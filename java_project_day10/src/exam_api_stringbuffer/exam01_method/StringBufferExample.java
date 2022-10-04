package exam_api_stringbuffer.exam01_method;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This");

        sb.append(" is pencil");  //문자열 덧붙이기 This is pensil
        System.out.println(sb);//This is pencil

        sb.insert(7, " my"); //"my"문자열 삽입 This is my pencil
        System.out.println(sb);//This is my pencil

        sb.replace(8, 10, " your"); //my 를 your로 변경 This is your pencil
        System.out.println(sb);//This is  your pencil

        System.out.println("===========================================");
        sb.setLength(4);  //스트링버퍼 내 문자열 길이 수정.
                        //setXXX():설정자  getXXX():접근자  toXXX():변환 isXXX():여부판단(boolean)
        System.out.println(sb);
        //This

        sb.reverse(); //뒤집다.
        System.out.println(sb);
        //sihT

        sb.delete(0, sb.length());
        System.out.println(sb);  //비었음...
        System.out.println(sb.toString().isEmpty());  // isEmpty() 문자열의 길이가 0인 경우에, true 를 리턴합니다
        //true

        /* (추가)
        .isBlank()
        JAVA 11 이후에 추가된 메소드 입니다.
        문자열이 비어 있거나, 빈 공백으로만 이루어져 있으면, true 를 리턴합니다.
         */
    }
}
