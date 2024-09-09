package project;

import java.io.Serializable;
import java.util.ArrayList;

public class Post implements Serializable {
    private int id;
    private String title;
    private String content;
    private String time;
    private int views;
    private ArrayList<CommentFeature> comments;
    private String user;
    private int likecount;


    public Post(int id, String title, String content, int view, String time, String user, int likecount) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.time = time;
        this.views = view;
        this.comments = new ArrayList<>();
        this.user = user;
        this.likecount = likecount;
    }

    public void setLikecount(int likecount) {
        this.likecount = likecount;
    }

    public int getLikecount() {
        return likecount;
    }

    public void setComments(ArrayList<CommentFeature> comments) {
        this.comments = comments;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
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

    public void increaselikecount() {
        likecount++;
    }

    public void decreaselikecount() {
        likecount--;
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

    public void addComments(String comment, String time) {
        comments.add(new CommentFeature(comment, time));
    }

    public ArrayList<CommentFeature> getComments() {
        return comments;
    }
}
