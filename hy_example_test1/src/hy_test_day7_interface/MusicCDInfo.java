package hy_test_day7_interface;

public class MusicCDInfo extends CDInfo{
    public String artist;
    public String[] songTitle;

    @Override
    public int getRegisterNo() {
        return super.getRegisterNo();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String[] getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String[] songTitle) {
        this.songTitle = songTitle;
    }
//    public String toString(String artist, String title, String[] songTitle){
//        return ;
//    }

}
