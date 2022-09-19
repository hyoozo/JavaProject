package simple_fruitinfo;

public class FruitTest {
    public static void main(String[] args) {
        FruitInfo banana = new FruitInfo("banana",4800);
        FruitInfo strawberry = new FruitInfo("strawberry",21000);
        FruitInfo persimmon = new FruitInfo("persimmon", 19000);
        FruitInfo cherry = new FruitInfo("cherry", 12000);

        System.out.println("======== [과일구입 목록] ========");
        System.out.println(banana.getFname()+":"+banana.getPrice());
        System.out.println(strawberry.getFname()+":"+strawberry.getPrice());
        System.out.println(persimmon.getFname()+":"+persimmon.getPrice());
        System.out.println(cherry.getFname()+":"+cherry.getPrice());
        System.out.println("======== [ 영  수  증] ========");
        int sum = banana.getPrice()+ strawberry.getPrice()+ persimmon.getPrice()+ cherry.getPrice();
        int total = sum - (int)(sum * 0.15);
        System.out.println("총금액: "+sum+"원");
        System.out.println("할인 후 결제 금액: "+total+"원");
    }
}
