package exam_try_with_resources;

public class FileInputStream implements AutoCloseable {

        // 원래 파일 입출력시 해당 클래스는 만들지 않음.

    private String file;

    public FileInputStream(String file) {
        this.file = file;
    }

    public void read(){
        System.out.println(file + "을 읽습니다.");
    }

    @Override
    public void close() throws Exception {
        System.out.println(file + "을 닫습니다.");
    }
     // 인터페이스를 해지하기위한 close() 를 재정의 한거다.
}
