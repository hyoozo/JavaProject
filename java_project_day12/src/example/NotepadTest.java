package example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotepadTest {
    public static void main(String[] args) {

        //Scanner 를 선언한다.
        static Scanner sc = new Scanner(System.in);
        NotepadManager manager = new NotepadManager();

        //반복문 1
        //무한반복. 사용자가 3일 입력하면 반복문을 탈출하도록 구현합니다.
        while (true) {
            manager.MenuView(); // 메뉴 보여주기

            int taskNum;
            try {
                String input = sc.nextLine();
                taskNum = Integer.parseInt(input);

            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            //메모 읽기를 선택한 경우
            if (taskNum == 1) {
                System.out.println("메모 파일명을 입력하세요.");

                //사용자로부터 문자열로 파일명을 입력받습니다.
                String fileName = sc.nextLine();

                //파일 내용을 읽어들이기 위해 FileInputStream 을 선언한다.
                FileInputStream inputStream = null;

                //사용자로부터 입력한 파일명을 가지고 FileInputStream 을 생성한다.
                //파일이 없을 경우 "파일이 존재하지 않습니다" 라는 메시지를 출력 후
                //반복문 1의 처음으로 돌아간다.

                try {
                    inputStream = new FileInputStream(fileName);
                } catch (FileNotFoundException e) {
                    System.out.println("파일이 존재하지 않습니다.");
                    continue;
                }

                //FileInputStream 이 성공적으로 생성되면 안내 메시지를 출력합니다.
                System.out.println(fileName + "의 내용을 출력합니다.");

                //FileInputStream 으로 부터 파일의 내용을 읽어들일 scanner 를 선언합니다.
                Scanner reader = new Scanner(inputStream);

                //반복문 2
                //파일의 내용을 한줄씩 읽어 끝까지 출력합니다.
                while (reader.hasNextLine()) {
                    System.out.println(reader.nextLine());
                }
                System.out.println("\n");

                //파일을 다 사용했으면 닫아 줍니다.
                reader.close();
            }

            //새 메모를 선택한 경우
            else if (taskNum == 2) {
                System.out.println("저장할 메모 파일명을 입력하세요.");

                //새 메모를 저장하기 위해 새 파일명을 입력 받습니다.
                String fileName = sc.nextLine();

                //파일을 쓰기 위해 FileWriter 를 선언합니다.
                FileWriter writer = null;

                //사용자가 입력한 파일명을 가지고 FileWriter 를 생성합니다.
                //파일 생성에 실패한 경우 " 파일 생성에 실패했습니다. " 출력 후
                //반복문의 처음으로 돌아간다.
                try {
                    writer = new FileWriter(fileName);
                } catch (IOException e) {
                    System.out.println("파일 생성에 실패했습니다.");
                    continue;
                }
                System.out.println("메모할 문자열을 입력하세요.");
                System.out.println("종료: 빈 줄에서 엔터키 입력");

                //반복문3
                //계속해서 사용자 입력 값을 받기 위해 무한 반복합니다.
                while (true) {
                    String input = sc.nextLine();

                    //사용자가 입력한 값이 빈 문자열 이라면
                    //파일에 쓸 문자열을 입력받는 반복문 3을 탈출합니다.
                    if (input.equals("")) {
                        break;
                    }

                    //사용자가 입력한 문자열을 파일에 쓰고
                    //줄바꿈 문자를 통해 줄바꿈을 추가해줍니다.
                    try {
                        writer.write(input);
                        writer.write("\n");
                    } catch (IOException e) {
                        System.out.println("파일에 문자열을 쓰지 못했습니다.");
                    }
                }
                //빈 문자열을 입력받아 반복문 3을 탈출했다면 입력이 종료된 것이므로 파일을 닫아줍니다.
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("파일을 닫는 데 실패했습니다.");
                }
            }

            // 종료를 선택한 경우
            else if (taskNum == 3) {

                //프로그램을 종료하는 메세지 출력 후 반복문 1을 탈출 합니다.
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            //사용자가 입력한 값이 1,2,3 중 하나가 아닌 경우
            //"잘못된 입력입니다." 하는 메시지를 출력합니다.
            else {
                System.out.println("잘못된 입력입니다.");
            }

        }
    }
}
