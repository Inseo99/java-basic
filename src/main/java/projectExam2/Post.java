package projectExam2;

import java.util.ArrayList;

public class Post {
    private int id;
    private String title;
    private String contect;
    private String time;
    private int hit;
    private ArrayList<Reply> replies;

    public Post(int id, String title, String contect, String time, int hit) {
        this.id = id;
        this.title = title;
        this.contect = contect;
        this.time = time;
        this.hit = hit;
        this.replies = new ArrayList<>();
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContect(String contect) {
        this.contect = contect;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContect() {
        return contect;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getHit() {
        return hit;
    }

    public ArrayList<Reply> getReplies() {
        return replies;
    }

    public void setReplies(ArrayList<Reply> replies) {
        this.replies = replies;
    }

    public void saveRelies(String comment, String time) {
        replies.add(new Reply(comment, time));
    }
}
