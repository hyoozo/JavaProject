package example;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DiaryMain {
    public static void main(String[] args) {
        DiaryManager dm = new DiaryManager();
        DiaryTest diary = new DiaryTest();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        int checkNum;

        while (true) {
            System.out.println("1. 일기쓰기");
            System.out.println("2. 일기불러오기");
            System.out.println("3. 종료");
            System.out.println("원하는 작업 번호를 입력해주세요.");

            try {
                String input = sc.nextLine();
                checkNum = Integer.parseInt(input);

            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            dm.setPath("/Users/j/Desktop/Temp/");// 경로지정
            dm.setFileFormat(".txt");

            if (checkNum == 1) {
                System.out.println("날짜를 입력하세요 (yyyy-MM-dd)");
                String dateInput = sc.nextLine();

                try {
                    Date date = dm.dateChecked(format, dateInput);

                    System.out.println("일기 제목을 입력하세요");
                    String title = sc.nextLine();

                    System.out.println("날씨를 입력하세요.");
                    String weather = sc.nextLine();

                    System.out.println("종료: 빈 줄에서 엔터키 입력");
                    System.out.println("내용을 입력하세요.");

                    StringBuilder allContent = new StringBuilder();

                    while (true) {
                        String content = sc.nextLine();
                        if (content.equals("")) {
                            break; // 엔터입력시 종료
                        }
                        allContent.append("내용: ").append(content).append("\n");
                    }

                    diary.setDate(date);
                    diary.setTitle(title);
                    diary.setWeather(weather);
                    diary.setContent(allContent.toString());

                    dm.setFileName(format.format(date));
                    dm.createDiary(diary);

                } catch (ParseException e) {
                    System.out.println("날짜를 잘못 입력하셨어요.");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("파일에 문자열을 쓰지 못했습니다.");
                }

            } else if (checkNum == 2) {
                System.out.println("열고싶은 날짜를 입력하세요.");

                String fileName = sc.nextLine();
                dm.setFileName(fileName);
                try {
                    byte[] findDiary = dm.findDiary(fileName);

                    System.out.println("파일이 존재합니다.");
                    System.out.println();
                    System.out.println(new String(findDiary));

                } catch (NoSuchFileException e) {
                    System.out.println("파일이 존재하지 않습니다.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (checkNum == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
