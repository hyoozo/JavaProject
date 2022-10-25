package exam_network_01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver {
    public static void main(String[] args) {
        byte[] buf = new byte[256];

        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(5000);
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            System.out.println("데이터 전송을 기다리고 있습니다.\n");
            socket.receive(packet); //패킷이 도착할 때 까지 기다리게 된다.


            System.out.println("[전송데이터]");
            System.out.println(new String(buf, 0, packet.getLength()));
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            socket.close();

        }
    }
}
