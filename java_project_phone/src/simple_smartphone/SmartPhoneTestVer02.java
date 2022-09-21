package simple_smartphone;

public class SmartPhoneTestVer02 {
    public static void main(String[] args) {
        SmartPhone[] sp = {new SmartPhone("갤럭시노트9","삼성",1094500),
                            new SmartPhone("아이폰XS","애플",1364000,10),
                            new SmartPhone("갤럭시S8","삼성",935000,35)};

        for (SmartPhone smartPhone : sp ){
            System.out.println("----------------------");
            smartPhone.printInpo();
        }
        System.out.println();
    }
}

