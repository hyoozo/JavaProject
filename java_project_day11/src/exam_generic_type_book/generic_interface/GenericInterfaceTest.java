package exam_generic_type_book.generic_interface;

public class GenericInterfaceTest {
    public static void main(String[] args) {
        Integer[] inum = {50, 10, 20, 30, 40};
        Double[] dnum = {1.0, 2.0, 5.0, 3.0, 4.0};
        String[] snum = {"1", "2", "3", "4", "5"};
        NumUtil<Integer> iutil = new NumUtil<>(inum);
        NumUtil<Double> dutil = new NumUtil<>(dnum);
        NumUtil<String> sutil = new NumUtil<>(snum);

        System.out.println("inum 최댓값 : " + iutil.max());  // inum 최댓값 : 50
        System.out.println("dnum 최댓값 : " + dutil.max());  // dnum 최댓값 : 5.0
        System.out.println("snum 최댓값 : " + sutil.max());  // snum 최댓값 : 5

    }
}
