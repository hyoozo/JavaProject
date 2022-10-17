package exam_object_stream;

import java.io.*;

/* 개체단위의 입출력
파일명은 account.dat 이다.
직렬화하여 저장되어야 하는 데이터는 123-4535-33478 홍길동 10000.
-> 게터,세터,메소드 등등
역직렬화하여 화면에 보여지는 형태는
-> 필드값으로 바꿔주는걸 역직렬화
계좌번호 : 123-4535-33478
예금주명: 홍길동
금액: 10000
으로 보여질 수 있도록 코딩해 주세요.
 */
public class AccountExample {
    public static void main(String[] args) throws IOException {
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("account.dat"));
            out.writeObject(new Account("123-4535-3378", "홍길동", 10000));
            out.flush(); //버퍼에 남아있을수있어서.

            in = new ObjectInputStream(new FileInputStream("account.dat")); //프로젝트에 파일이 생성됨.
            Account ea = (Account) in.readObject();
            //readObject은 오브젝트를 반환하니 Account에 담을수없어서 형변환을 진행함.

            System.out.println(ea.toString());
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println(classNotFoundException.getMessage());
        } catch (IOException i) {
            //여기에 출력할게 없기때문에..?
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try {// 반드시 해제작업을 해야된다.
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
