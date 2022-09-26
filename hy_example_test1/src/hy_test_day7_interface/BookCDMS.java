package hy_test_day7_interface;

public class BookCDMS {
    public static void main(String[] args) {
        SeparateVolume separateVolume = new SeparateVolume();
        separateVolume.checkOut("엄마를 부탁해","20210801");
        separateVolume.checkIn();

        AppCDInfo appCDInfo = new AppCDInfo();
        appCDInfo.checkOut("Redhat Fedora CD","20210810");
        appCDInfo.checkIn();

        MusicCDInfo musicCDInfo = new MusicCDInfo();


    }
}
