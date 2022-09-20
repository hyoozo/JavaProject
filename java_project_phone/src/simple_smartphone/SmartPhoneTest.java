package simple_smartphone;

public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("삼성","갤럭시노트9",1094500);
        SmartPhone phone1 = new SmartPhone("애플","아이폰XS",1364000,10);
        SmartPhone phone2 = new SmartPhone("삼성","갤럭시S8",935000,35);

        System.out.println("------제품목록------");
        System.out.println("-------------------");
        System.out.println(phone.getName()+"["+phone.getMaker()+"]"+
                "\n가격 : "+phone.getPrice());
        System.out.println("-------------------");
        System.out.println(phone1.getName()+"["+phone1.getMaker()+"]"+
                "\n가격 : "+phone1.getPrice()+
                "\n할인가격("+phone1.getDiscountRate()+"%)"+phone1.calculateDiscount(phone1.getDiscountRate()));
        System.out.println("-------------------");
        System.out.println(phone2.getName()+"["+phone2.getMaker()+"]"+
                "\n가격 : "+phone2.getPrice()+
                "\n할인가격("+phone2.getDiscountRate()+"%)"+phone2.calculateDiscount(phone2.getDiscountRate()));
        System.out.println("-------------------");
    }
}
