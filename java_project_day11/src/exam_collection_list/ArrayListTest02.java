package exam_collection_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest02 {
    public static void print(int n, List<String> list) {
        System.out.println(n + " : " + list.toString());
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("서울");
        list.add("북경");
        list.add("상해");
        list.add("서울");
        list.add("도쿄");
        list.add("뉴욕");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        /*
        서울
        북경
        상해
        서울
        도쿄
        뉴욕
         */

        list.add("런던");
        list.add("로마");
        list.add("방콕");
        list.add("북경");
        list.add("도쿄");
        list.add("서울");

        System.out.println("1: " + list.toString());
        //1: [서울, 북경, 상해, 서울, 도쿄, 뉴욕, 런던, 로마, 방콕, 북경, 도쿄, 서울]

        list.add(1, "LA");
        print(2, list);
        //2 : [서울, LA, 북경, 상해, 서울, 도쿄, 뉴욕, 런던, 로마, 방콕, 북경, 도쿄, 서울]

        System.out.println("3: " + list.indexOf("서울"));
        //3: 0
        System.out.println("4: " + list.lastIndexOf("서울"));
        //4: 12

        list.remove("LA");
        print(5, list);
        //5 : [서울, 북경, 상해, 서울, 도쿄, 뉴욕, 런던, 로마, 방콕, 북경, 도쿄, 서울]

        list.remove(list.indexOf("상해"));
        print(6, list);
        //6 : [서울, 북경, 서울, 도쿄, 뉴욕, 런던, 로마, 방콕, 북경, 도쿄, 서울]

        System.out.println("7: " + list.contains("LA"));
        //7: false
        System.out.println("7: " + list.contains("뉴욕"));
        //7: true

        //Object[]  toArray () : object 타입의 배열 생성
        Object[] obj = list.toArray();
        System.out.println("8: " + Arrays.toString(obj));
        //8: [서울, 북경, 서울, 도쿄, 뉴욕, 런던, 로마, 방콕, 북경, 도쿄, 서울]

        String[] cities = new String[0];
        cities = list.toArray(cities);
        System.out.println("9: "+ Arrays.toString(cities)+""+cities.length);  //cities.length 가 11이 출력됨.
        //9: [서울, 북경, 서울, 도쿄, 뉴욕, 런던, 로마, 방콕, 북경, 도쿄, 서울]11

        list.clear();
        print(10, list);
        //10 : []

        System.out.println("11: "+list.isEmpty());
        //11: true



        System.out.println("----");
        list.add("파리");
        list.add("방콕");
        list.add("LA");
        print(1201,list);

        //Array 클래스의 static <T> List<T> asList(T... a) : 제네릭 메서드
        //12: [서울, 뉴욕, 상해]
        //List<String> list2 = Arrays.<String>asList("서울","뉴욕","상해");
        //배열 -> List<E> 타입으로 변환
        String[] name = new String[]{"서울", "뉴욕", "상해"};
        List<String> list2 = Arrays.asList(name);
        print(12,list2);
        //12 : [서울, 뉴욕, 상해]

        List<String> list3 = Arrays.asList("서울", "부산", "상해");
        list.addAll(list2);
        print(13,list);
        //13 : [파리, 방콕, LA, 서울, 뉴욕, 상해]
        list.addAll(list3);
        print(1301,list);
        //1301 : [파리, 방콕, LA, 서울, 뉴욕, 상해, 서울, 부산, 상해]

        // boolean containsAll((Collection<?> c)
        System.out.println("14: " + list.contains(list3));  //?? 왜 false 인지 모루겠땨!!!!
        //14: false

        list.retainAll(list2);  //list에서 list2의 데이터만 남겨두고 나머지 데이터는 모두 삭제된다.
        print(15,list);
        //15 : [서울, 뉴욕, 상해]
        //1301추가해서 15 : [서울, 뉴욕, 상해, 서울, 상해]
                     //  list3  서울, 상해가 list2랑 곂쳐서 안지워 진건가?????

        list.removeAll(list2);
        print(16,list);
        //16 : []


    }
}
