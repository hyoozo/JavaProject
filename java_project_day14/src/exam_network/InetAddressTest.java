package exam_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress itan = InetAddress.getByName("www.naver.com");
                                //getByName : throws UnknownHostException 예외처리해줘야함
                                //될수있으면 try-catch 로 잡아주기~!
        InetAddress itad = InetAddress.getByName("www.daum.net");

        System.out.println("호스트명과 IP:" + itan.toString()); //호스트명과 IP:www.naver.com/223.130.200.107

        System.out.println("호스트명:" + itad.getHostName()); //호스트명:www.daum.net
        System.out.println("IP:" + itad.getHostAddress()); //IP:211.249.220.24

        InetAddress ina[] = InetAddress.getAllByName("www.naver.com"); //www.naver.com/223.130.200.107
        for (int i = 0; i < ina.length; i++) {
            System.out.println(ina[i]); //www.naver.com/223.130.195.200
        }
        System.out.println();

        InetAddress ital = InetAddress.getLocalHost();
        System.out.println("로컬컴퓨터 이름:" + ital.getHostName()); //로컬컴퓨터 이름:DESKTOP-6LM6N9F
        System.out.println("로컬컴퓨터 IP주소:" + ital.getHostAddress()); //로컬컴퓨터 IP주소:192.168.30.72
    }
}
