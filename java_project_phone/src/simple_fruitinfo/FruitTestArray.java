package simple_fruitinfo;

public class FruitTestArray {
    public static void main(String[] args) {
        FruitInfo[] fruit = {new FruitInfo("banana",10000),
                            new FruitInfo("strawberry", 20000),
                            new FruitInfo("persimmon",30000),
                            new FruitInfo("cherry",40000)};

        for (int i = 0; i < fruit.length; i++){
            System.out.println(fruit[i].toString());
        }
        int sum = 0;
        for (int i = 0; i < fruit.length; i++) {
            sum += fruit[i].getPrice();
        }
        int total = sum - (int)(sum * 0.15);
        System.out.println("총금액: "+sum+"원");
        System.out.println("할인 후 결제 금액: "+total+"원");
    }
}
