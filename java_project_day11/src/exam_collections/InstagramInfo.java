package exam_collections;

import java.util.ArrayList;
import java.util.HashMap;

public class InstagramInfo {
    private ArrayList<Photo> photos = new ArrayList<>();
    private HashMap<String,String> users = new HashMap<>();


    public InstagramInfo(){

    }
    public void join (String id, String pw) {
        this.users.put(id,pw);
    }

    public void exit (String id, String pw){
        if(this.users.containsKey(id)) {
            if (this.users.get(id).equals(pw)){
                this.users.remove(id);
            }
        }
    }

    public String findPw(String id) {
        if (this.users.containsKey(id)) {
            return this.users.get(id);
        }
        return "x";
    }


    public void uploadPhoto(Photo p){
        photos.add(p);

    }
    public void deletePhoto(String title){
        for (Photo p : photos){
            if (p.getTitle().equals(title)) {
                photos.remove(p);
            }
        }
    }
    public ArrayList<Photo> getPhotos(){
        return this.photos;
    }

}
