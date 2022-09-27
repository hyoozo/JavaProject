package hy_test_day7_interface;

public class BookCDMS {
    public static void main(String[] args) {
        SeparateVolume separateVolume = new SeparateVolume("1","엄마를 부탁해","신경숙");
        separateVolume.checkOut("홍길동","20210801");
        separateVolume.checkIn();

        AppCDInfo appCDInfo = new AppCDInfo("Redhat","Fedora");
        appCDInfo.checkOut("박희진","20210810");
        appCDInfo.checkIn();

        MusicCDInfo musicCDInfo = new MusicCDInfo("1","동행","김동률",new String[]{"고백 청춘 내 사람"});
        System.out.println(musicCDInfo.toString());
    }
}
