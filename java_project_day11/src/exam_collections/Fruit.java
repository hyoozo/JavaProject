package exam_collections;

import java.util.Objects;

public class Fruit implements Comparable<Fruit> {
    private String name;
    private int price;

    public Fruit(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[ \"" + name + "\" - " + price + "]";
    }

    //    @Override
//    public int compareTo(Fruit fruit) {
//        if (fruit.price < price) {
//            return 1;
//        } else if (fruit.price > price) {
//            return -1;
//        }
//        return 0;
//    }
    public int compareTo(Fruit o) {  //정렬할때 기준이 가격순이 된다.
        if (price < o.price){
            return -1;
        } else if (price == o.price) {
            return 0;
        } else {
            return 1;
        }
    }
}
