package example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DiaryManager {
    private String path;
    private String fileName;
    private String fileFormat;

    public void setPath(String path) {
        this.path = path;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    //파일이름 날짜 체크
    public Date dateChecked(SimpleDateFormat format, String date) throws ParseException {
        return format.parse(date);
    }

    //파일생성
    public void createDiary(DiaryTest diaryTest) throws IOException {
        File file = new File(path + fileName + fileFormat);
        FileWriter fw = new FileWriter(file, false);
        fw.write("날짜: " + fileName + " 날씨: " + diaryTest.getWeather() + " \n제목: " + diaryTest.getTitle() + "\n");
        fw.write(diaryTest.getContent());
        fw.flush();
        fw.close();
    }

    //파일찾기
    public byte[] findDiary(String fileName) throws IOException {
        File file = new File(path + fileName + fileFormat);  //지정한 경로에서 파일이름 넣기
        return Files.readAllBytes(Paths.get(file.toURI())); //파일을 배열로 출력
    }

}
