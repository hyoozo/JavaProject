package exam_api_string.exam02_method;

import java.time.LocalDate;
public class StringTest {
    public static void main(String[] args) {
        String ssn = "921004-2033331";
        /* 성별을 구하는 메서드 선언 및 호출 .getGender()
        System.out.printf("당신의 성별 : %s\n",메서드 호출);

        변수 fileName 에 저장된 파일면 (예: test.txt) 에서 확장자 체크하여 이미지파일 (gih/jpg/png/jpeg)
        외 나머지 확장자를 가진 파일인 경우 "이미지 파일만 등록가능합니다."라는 메시지를 출력하도록 작성해보세요.
         */
        System.out.printf("당신의 성별 : %s\n",getGender(ssn));

        /* 나이를 구하는 메서드 선언 및 호출*/
        System.out.println("당신의 나이는 : " + getAge(ssn));

        String fileName = "test.txt";
        System.out.println("파일명 : " +fileName);
        //메서드 호출로 제어.
        if (!fileExtCheck(fileName)) { //부정연산자 false 일때 문구실행.
            System.out.println("이미지 파일만 등록가능합니다.");
        }
    }

    public static String getGender(String ssn) {   // 내가 원하는 메서드를 따로 만든다.
        String g = ssn.substring(7, 8);
        String gender = null;
        if (g.equals("1") || g.equals("3")) {
            gender = "남자";
        } else if (g.equals("2") || g.equals("4")) {
            gender = "여자";
        } else {
            gender = "외국인";
        }
        return gender;
    }

    public static int getAge(String ssn){
        LocalDate now = LocalDate.now();

        char h = ssn.charAt(7);
        int age = Integer.parseInt(ssn.substring(0,2));
        if (h == '1' || h == '2'){
            age = now.getYear()-(1900+age)+1;
        } else if (h == '3' || h == '4') {
            age = now.getYear()-(2000+age)+1;
        }
        return age;
    }

    public static boolean fileExtCheck(String fileName) {
        String[] fileNameExt = {"gif", "jpg", "png", "jpeg"};
        String ext = fileName.substring(
                fileName.lastIndexOf(".") +1,
                fileName.length()); //txt

        for (int i = 0; i < fileNameExt.length; i++) {
            if (ext.equalsIgnoreCase(fileNameExt[i])) {  //대소문자와 관계없이 비교하는메서드이용
                return true;
            }
        }
        return false;

    }
}
//메서드가 어떻게 사용되는지 공부하기
//API 홈페이지 참고하기

