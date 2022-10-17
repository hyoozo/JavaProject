package example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/*
[요구사항]
메모장 프로그램을 기반으로 간단한 일기장 프로그램을 만들어보세요.
년, 월, 일 순으로 입력받아 파일명으로 사용해보세요.
제목과 날씨를 입력받아 일기 내용의 첫 줄에 날짜와 날씨, 제목을 추가해 보세요.
 */
public class DiaryTest {
    private String title;
    private String weather;
    private String content;
    private Date date;

    public String getTitle() {
        return title;
    }
    public String getWeather(){
        return weather;
    }
    public String getContent(){
        return content;
    }
    public Date getDate(){
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
