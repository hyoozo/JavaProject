package exam_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedWriter out = null;
        Socket socket = null;
        String ServerIP;
        try {
            //접속할 서버가 클라이언트와 동일 컴퓨터에 존재 시 아래와 같이 작성할 수 있다.
//            ServerIP = InetAddress.getLocalHost().getHostAddress();
            ServerIP = "192.168.130.23";
            // 그러나 서버와 클라이언트가 서로 다른 컴퓨터라면 반드시 서버의 IP를 명시해 주어야한다.
            // 예를 들어 서버 IP가 192.168.0.12라면
            //ServerIP = "192.168.0.12"로 작성하여야 한다.
            socket = new Socket(ServerIP, 5050);
//            socket = new Socket(ServerIP, 9999);
            System.out.println(ServerIP + "서버에 접속하였습니다...");

            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String outputMessage;
            while (true) {
                System.out.print("텍스트입력 >>> ");
                outputMessage = sc.nextLine();
                out.write(outputMessage + "\n");
                out.flush();
                if (outputMessage.equalsIgnoreCase("end")) {
                    System.out.println("연결을 종료합니다.");
                    break;
                }
            }
            socket.close();
            sc.close();
        } catch (IOException e) {
            System.out.println("입출력 오류가 발생했습니다.");
        }
    }
}
