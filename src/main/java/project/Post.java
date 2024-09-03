package project;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Post {
    private int id;
    private String title;
    private String content;
    private String time;
    private int views;

    ArrayList<CommentFeature> comments = new ArrayList<>();

    public Post(int id, String title, String content, String time) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.time = time;
        this.views = 0;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void increaseView() {
        views++;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
