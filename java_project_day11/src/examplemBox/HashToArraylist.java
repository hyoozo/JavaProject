package examplemBox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
[요구사항]
범죄, 112
화재, 119
전화번호, 114
데이터가 HashMap에 저장되어 있다.
이값을 ArrayList 자료 구조에 저장할 수 있도록 toArraylist() 메서드를 정의하고
메인에서 출력하여라.
 */
public class HashToArraylist {
    public void toArrayList(){

    }
    public static void main(String[] args) {
        HashMap<String, Integer> phoneInfo = new HashMap<>();
        phoneInfo.put("범죄",112);
        phoneInfo.put("화재",119);
        phoneInfo.put("전화번호",114);

        List<String> key = new ArrayList<>(phoneInfo.keySet());
        List<Integer> value = new ArrayList<>(phoneInfo.values());
        for ( int i = 0; i < key.size();i++) {
            System.out.println(key.get(i) + "," + value.get(i));
        }


    }
}
