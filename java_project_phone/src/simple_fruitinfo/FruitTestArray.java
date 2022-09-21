package simple_fruitinfo;

public class FruitTestArray {
    public static void main(String[] args) {
        //객체 배열 선언 및 초기화
        FruitInfo[] fruit = {new FruitInfo("banana",4800),     //fruit[0]
                            new FruitInfo("strawberry", 21000), //fruit[1]
                            new FruitInfo("persimmon",19000),   //fruit[2]
                            new FruitInfo("cherry",12000)};     //fruit[3]
        //fruit 객체 배열 명

        int sum = 0; //객체 합 구하기
        for (int i = 0; i < fruit.length; i++) {
            sum += fruit[i].getPrice();
        }
        int total = sum - (int)(sum * 0.15);

        System.out.println("========[과일구입목록]========");
        //for 확장문 for(자료형 변수명 : 배열명){}
        for (FruitInfo fruitInfo : fruit) {     // 객체 출력하기 반복문
            System.out.println(fruitInfo.toString());
        }
//        for (int i = 0; i < fruit.length; i++){     // 객체 출력하기 반복문
//            System.out.println(fruit[i].toString());
//        }
        System.out.println("========[구매 영수증]=========");
        System.out.println("총금액: "+sum+"원");
        System.out.println("할인 후 결제 금액: "+total+"원");
    }
}
