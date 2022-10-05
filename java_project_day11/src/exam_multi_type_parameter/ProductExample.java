package exam_multi_type_parameter;

public class ProductExample {
    public static void main(String[] args) {
        Product<Car, String> product1 = new Product<Car, String>();
        product1.setKind(new Car());
        product1.getKind().setColor("RED");
        product1.setModel("베뉴");
        System.out.println(product1.toString() + "[color : " + product1.getKind().getColor() + "]");
                            //  kind : CAR, model : 베뉴[color : RED]

        /*Product<Tv, String> product2 = new Product<Tv, String>();
        product2.setKind(new Tv(48));
        product2.setModel("스마트TV"); */

        Product<Tv, String> product2 = new Product<Tv, String>(new Tv(48), "스마트 TV");

        System.out.println(product2.toString() + " ");
        System.out.println(product2.getKind().toString());
                            // kind : TV, model : 스마트 TV
                              // TV size : 48
        Product<SmartPhone, String> product3 = new Product<>(new SmartPhone("삼성","안드로이드"),"갤럭시 Z플립3");

        System.out.println(product3.toString());
        System.out.println(product3.getKind().toString());
                        //product3.gerKind() -> SmartPhone의 주솟값.toString() -> SmartPhone이 가진 toString()
                        // kine : SMARTPHONE, model : 갤럭시 Z플립3
                        //SmartPhone company : 삼성, os : 안드로이드

    }
}