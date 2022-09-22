package class_exam_test;

import java.util.stream.Stream;

public class Overloading {
    public void test(int d, int s, int g){}
    public void test(String str) {}
    public void test(int i) {}
    public void test(String s, int d, int t) {}
    public void test(char ch) {}
    public void test(String str, int i) {}
    public void test(int i, String str) {}
//    public void test(int i, int w) {}
    public int test(){
        return 0;
    }
}
