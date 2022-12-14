package example;

import java.io.*;
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
public class Diary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 일기쓰기");
            System.out.println("2. 일기불러오기");
            System.out.println("3. 종료");
            System.out.println("원하는 작업 번호를 입력해주세요.");

            int checkNum;
            try {
                String input = sc.nextLine();
                checkNum = Integer.parseInt(input);

            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            if (checkNum == 1) {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); //날짜형식 고정

                System.out.println("날짜를 입력하세요 (yyyy-MM-dd)");
                String date = sc.nextLine();

                try {
                    Date date2 = format.parse(date);

                    String path = "/Users/j/Desktop/Temp/"; // 경로지정
                    String fileName = format.format(date2);
                    String fileFormat = ".txt";

                    File file = new File(path + fileName + fileFormat);
                    FileWriter fw = new FileWriter(file, false);

                    System.out.println("일기 제목을 입력하세요");
                    String title = sc.nextLine();
                    System.out.println("날씨를 입력하세요.");
                    String weather = sc.nextLine();
                    fw.write("날짜: " + fileName + " 날씨: " + weather + " \n제목: " + title + "\n");

                    System.out.println("종료: 빈 줄에서 엔터키 입력");
                    System.out.println("내용을 입력하세요.");

                    while (true) {
                        String content = sc.nextLine();
                        if (content.equals("")) {
                            break; // 엔터입력시 종료
                        }
                        fw.write("내용: " + content);
                        fw.write("\n");
                    }

                    fw.flush();
                    fw.close();
                } catch (ParseException e) {
                    System.out.println("날짜를 잘못 입력하셨어요.");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("파일에 문자열을 쓰지 못했습니다.");
                }


            } else if (checkNum == 2) {
                System.out.println("열고싶은 날짜를 입력하세요.");
                String fileName = sc.nextLine();

                File file = new File("/Users/j/Desktop/Temp/" + fileName + ".txt");  //지정한 경로에서 파일이름 넣기
                try {

                    byte[] bytes = Files.readAllBytes(Paths.get(file.toURI())); //파일을 배열로 출력

                    if (file.isDirectory()) {
                        System.out.println("디렉토리가 존재합니다.");
                    } else if (file.isFile()) {
                        System.out.println("파일이 존재합니다.");
                        System.out.println();
                        System.out.println(new String(bytes));
                    }

                } catch (NoSuchFileException e) {
                    System.out.println("파일이 존재하지 않습니다.");
                    continue;
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
