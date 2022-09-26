package hy_test_day7_interface;

import java.util.Arrays;

public class MusicCDInfo extends CDInfo{
    private String artist;
    private String[] songTitle;


    public String toString(String artist,String title, String[] songTitle) {
        return  artist +" "+ title + Arrays.toString(songTitle) + "음반";
    }
}
