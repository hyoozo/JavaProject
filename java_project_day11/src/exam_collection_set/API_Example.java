package exam_collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class API_Example {
    public static void main(String[] args) {
//        Random random = new Random();
//65~90
        HashSet<Character> ch = new HashSet<>();
        for ( int i = 0; i < 10;  i++) {
            char tmp = (char) ((int) (Math.random() * 26) + 65);
            System.out.println(ch.add(tmp )+" ");
        }
//        Iterator it = ch.iterator();
//        while (it.hasNext()) {
//            System.out.println(it + " ");
//        }

    }
}
