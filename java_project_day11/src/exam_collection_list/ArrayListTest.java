package exam_collection_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        //프로그래밍 언어(문자열)를 저장하도록 인스턴스 생성
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");    //0
        list.add("Java");    //1
        list.add("JSP");     //2
        list.add("SPRING");  //3

        int size = list.size();
        System.out.println("총 객체수 : " + size);   //총 객체수 : 4
        System.out.println("----");

        list.add(1, "ORACLE");   // 인덱스 1에 추가 (add)  Java, ORACLE, Java, JSP, SPRING
        list.set(2, "Client programming");      // 인덱스 2에 변경 (set)  Java, ORACLE, Client programming, JSP, SPRING
        //set 은 삭제되면서 변경되는것임.
        list.remove(3);                  // 인덱스 3을 삭제 (remove) Java, ORACLE, Client programming, SPRING

        int index = list.indexOf("Java"); //indexOf 처음 발견되는 문자열에 대한 index 를 반환
        System.out.println(index);   //0
        System.out.println("----");

        index = list.lastIndexOf("ORACLE");//lastIndexOf 마지막 문자열의 index 를 반환
        System.out.println(index);   //"Java" 로 하면 0 / "ORACLE"로 하면 1
        System.out.println("----");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        /*Java
        ORACLE
        Client programming
        SPRING
         */
        System.out.println("----");
        for (String s : list) {
            System.out.println("향샹된 for 문 이용하여 출력된 : " + s);
        }
            /*
            향샹된 for 문 이용하여 출력된 : Java
            향샹된 for 문 이용하여 출력된 : ORACLE
            향샹된 for 문 이용하여 출력된 : Client programming
            향샹된 fo r문 이용하여 출력된 : SPRING
             */
        System.out.println("----");

        //정수값을 저장하도록 인스턴스 생성
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(Integer.valueOf(94));   //Integer.valueOf 를 안써줘도됨. 자동으로 확인되기 때문에
        list1.add(Integer.valueOf(62));
        list1.add(Integer.valueOf(45));
        System.out.println(list1.toString());
        //       [23, 94, 62, 45]

        list1.add(2, Integer.valueOf(78));
        System.out.println(list1.toString());
        //       [23, 94, 78, 62, 45]
        System.out.println("----");

        //Apple 이라는 이름으로 클래스를 생성한다. 이 클래스는 품종(kind)과 색상(color)을 필드로 가진다.
        //여러 사과를 저장하도록 인스턴스 생성하여 출력하라.
        ArrayList<Apple> list2 = new ArrayList<>();
        list2.add(new Apple("부사","빨강"));
        list2.add(new Apple("아오리","청색"));
        list2.add(new Apple("썸머킹","황금"));
        list2.add(new Apple("홍로","빨강"));

        //출력 -1
        for (int i = 0; i < list2.size(); i++) {
            Apple app = list2.get(i);
            System.out.println("품목 : " + app.getKind());
            System.out.println("색상 : " + app.getColor());
        }
        /*
        품목 : 부사
        색상 : 빨강
        품목 : 아오리
        색상 : 청색
        품목 : 썸머킹
        색상 : 황금
        품목 : 홍로
        색상 : 빨강
         */
        System.out.println("----");

        //출력 -2
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i).toString());
        }
        /*
        사과의 품종 : 부사 색상 : 빨강
        사과의 품종 : 아오리 색상 : 청색
        사과의 품종 : 썸머킹 색상 : 황금
        사과의 품종 : 홍로 색상 : 빨강
         */
        System.out.println("----");

        //출력 -3
        for (Apple app : list2) {
            System.out.println(app.toString());
        }
        System.out.println("----");

        // 여러 영화 정보를 저장하도록 인스턴스 생성
        // Movie 클래스는 영화제목, 평점, 감독, 개봉일등의 필드를 가진다
        // 인터페이스명 <타입인자> 참조변수 = new 구현클래스 생성자<타입인자>();


        // 여러개 만들때 객체배열하였지만
        // 이젠  List 에 담자
        List<Movie> list3 = new ArrayList<>();  //공간담으려고 new ArrayList
        list3.add(new Movie("더 배트맨", "★★★★☆ 8.78", "맷 리브스", "2022 개봉"));
        list3.add(new Movie("다크 나이트 라이즈", "★★★★★ 9.02", "론 하워드    ", "2020 재개봉"));
        list3.add(new Movie("해적: 도깨비 깃발", "★★★☆☆ 6.41", "김정훈", "2022 개봉"));

        //인스턴스에 담아도 됨.
        Movie m = new Movie();
        m.setmTitle("어메이징 그레이스");
        m.setmGrade("★★★★☆ 8.62");
        m.setmDirector("시드니 폴락, 알란 엘리어트");
        m.setAnYear("2019 개봉");
        list3.add(m);

        //원소의 개수로 인덱스 접근
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i).toString());
        }
        System.out.println("----");

        for(Movie v :list3) {
            System.out.println(v.toString());
        }
        System.out.println("----");

        // 반복자
        Iterator<Movie> iterator = list3.iterator();
                                    // .iterator  의 주솟값을 주겠다 iterator 에게
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        /*  3개 전부 동일하게 출력됨.
        영화제목 : 더 배트맨 평점 : ★★★★☆ 8.78 감독 : 맷 리브스 개봉일 : 2022 개봉
        영화제목 : 다크 나이트 라이즈 평점 : ★★★★★ 9.02 감독 : 론 하워드     개봉일 : 2020 재개봉
        영화제목 : 해적: 도깨비 깃발 평점 : ★★★☆☆ 6.41 감독 : 김정훈 개봉일 : 2022 개봉
        영화제목 : 어메이징 그레이스 평점 : ★★★★☆ 8.62 감독 : 시드니 폴락, 알란 엘리어트 개봉일 : 2019 개봉
         */

//        printArray(list2);  메소드로 출력도 가능~
    }

    public static void printArray(ArrayList<Apple> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("???"+list.get(i).toString());
        }
    }
}
