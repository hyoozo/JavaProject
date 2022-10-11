package exam_collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample02 {
    public static void main(String[] args) {

        Set<Key> set = new HashSet<Key>();

        set.add(new Key(1));
        set.add(new Key(13));
        set.add(new Key(1));
        set.add(new Key(25));
        set.add(new Key(3));



        int size = set.size();
        System.out.println("총 객체수 : " + size);

        Iterator<Key> iterator = set.iterator();
        while (iterator.hasNext()) {
            Key k = iterator.next();
            System.out.println("\t"+k.toString());
        }
    }
}
