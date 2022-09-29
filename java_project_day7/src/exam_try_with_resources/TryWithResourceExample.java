package exam_try_with_resources;

public class TryWithResourceExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.txt")) {
            // ( 를 열어 넣어준다.
            fis.read();
            //호출
            throw new Exception(); // 이 코드가 아래 문구(catch) 를 실행시는것
        } catch (Exception e) {
            System.out.println("예외 처리 코드가 실행되었습니다.");
        }  //오류가 발행되지 않아서 이 문구는 나오지 않고, !!! 자동으로 !!! close()메서드를 불러온다.
    }
}
/* console
file.txt을 읽습니다.
file.txt을 닫습니다.
 */