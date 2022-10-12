package exam_collections;

import java.util.*;

public class FruitSortTest {
    public static void main(String[] args) {
//        Fruit[] fruits = new Fruit[3];
//        fruits[0] = new Fruit("포드",3000);
//        fruits[1] = new Fruit("수박",20000);
//        fruits[2] = new Fruit("딸기",11900);
        //객체 배열을 선언하여 저장한다.
        Fruit[] fruits = {
                new Fruit("포도",3000),
                new Fruit("수박",20000),
                new Fruit("딸기",11900)
        };

//        // 객체 배열에서 가격순으로 정렬하여 출력한다.
////        int tmp=0;
////        for (int i = 0; i < fruits.length; i++) {
////            for (int k = i; k < fruits.length; k++) {
////
////                if(fruits[k].getPrice() < fruits[i].getPrice()){
////                    tmp = fruits[i].getPrice();
////                   fruits[i].setPrice(fruits[k].getPrice());
////                   fruits[k].setPrice(tmp);
////                }
////            }
////        }
//        Arrays.sort(fruits); // 정렬 -> compareTo를 근거로 정렬이 되는거다.
////        for (Fruit i : fruits) {  // 정렬후
////            System.out.println(i);
////        }
//        System.out.println(Arrays.toString(fruits));//출력
//        System.out.println();

        //리스트 타입으로 변환하여 Collections.sort()를 사용하여 정렬하여 출력한다.
//        List<Fruit> list = new ArrayList<>();
//        list.add(new Fruit("포도",3000));
//        list.add(new Fruit("수박",20000));
//        list.add(new Fruit("딸기",11900));
        List<Fruit> list = Arrays.asList(fruits);

        Collections.sort(list); //오름차순
        System.out.println(list.toString());

        Collections.reverse(list); // 내림차순
        System.out.println(list.toString());

        System.out.println();

        Collections.sort(list, Collections.reverseOrder()); //내림차순

        //TreeSet에 저장하여 출력한다.
//        Set set = new TreeSet();
//        set.addAll(list);
//        System.out.println(set.toString());

        TreeSet<Fruit> treeSet = new TreeSet<>();
        treeSet.add(new Fruit("vheh", 225555552));
        treeSet.add(new Fruit("fff", 2323));
        treeSet.add(new Fruit("asdf", 500000));

        //동일원소 저장 안됨.

        Iterator<Fruit> it = treeSet.iterator();
        while (it.hasNext()) {
            Fruit fruit = it.next();
            System.out.println(fruit.getName()+":"+fruit.getPrice());
        }
    }
}
