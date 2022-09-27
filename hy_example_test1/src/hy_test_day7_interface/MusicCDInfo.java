package hy_test_day7_interface;

import java.util.Arrays;

public class MusicCDInfo extends CDInfo{
    private String artist;
    private String[] songTitle;


    public MusicCDInfo(String registerNo, String title, String artist, String[] songTitle) {
        super(registerNo, title);
        this.artist = artist;
        this.songTitle = songTitle;
    }
    public String toString() {
        return  artist +" "+ getTitle() + Arrays.toString(songTitle) + "음반";
    }
}
