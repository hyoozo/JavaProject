package exam_multi_type_parameter;

public class ProductExample {
    public static void main(String[] args) {
        Product<Car, String> product1 = new Product<Car, String>();
                                                    //이부분 생략가능.
        product1.setKind(new Car());
                        //Car 클래스를 사용하기 위해 주솟값 줘야하므로 new 생성자 이용
        product1.getKind().setColor("RED");
        //
        product1.setModel("베뉴");
        System.out.println(product1.toString() + "[color : " + product1.getKind().getColor() + "]");
                            //  kind : CAR, model : 베뉴[color : RED]


        /*Product<Tv, String> product2 = new Product<Tv, String>();
        product2.setKind(new Tv(48));
        product2.setModel("스마트TV"); */
        Product<Tv, String> product2 = new Product<Tv, String>(new Tv(48), "스마트 TV");
                                                    //set 하지 말고 인스턴스가 만들어질때 값을 주자.

        System.out.println(product2 + " ");
                        //(product2.toString() + " ";  toStrint 사용 하지않아도 결과물은 같다.
        System.out.println(product2.getKind().toString());
                            // kind : TV, model : 스마트 TV
                              // TV size : 48


        Product<SmartPhone, String> product3 = new Product<>(new SmartPhone("삼성","안드로이드"),"갤럭시 Z플립3");

        System.out.println(product3.toString());
        // kine : SMARTPHONE, model : 갤럭시 Z플립3
        //>> product 클래스에 있는 toString 사용한것

//        SmartPhone p = product3.getKind();

        System.out.println(product3.getKind().toString());
        //SmartPhone company : 삼성, os : 안드로이드
                        //product3.gerKind() -> SmartPhone 의 주솟값.toString() -> SmartPhone 이 가진 toString()



    }
}