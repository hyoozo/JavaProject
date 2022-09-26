package hy_test_day7_interface;

public class BookCDMS {
    public static void main(String[] args) {
        SeparateVolume separateVolume = new SeparateVolume();
        separateVolume.setBookTitle("엄마를 부탁해");
        separateVolume.setWriter("신경숙");
        System.out.println(separateVolume.getState());
        separateVolume.checkOut("홍길동","20210801");
        separateVolume.checkIn();
        System.out.println();

        AppCDInfo appCDInfo = new AppCDInfo();
        appCDInfo.setTitle("Redhat Fedora");
        System.out.println(appCDInfo.getSate());
        appCDInfo.checkOut("Redhat Fedora CD","20210810");
        appCDInfo.checkIn();

        MusicCDInfo musicCDInfo = new MusicCDInfo();
        System.out.println(musicCDInfo.toString("김동률", "동행",new String[]{"고백 청춘 내 사람"}));
    }
}
