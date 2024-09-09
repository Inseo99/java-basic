package project;

import java.io.Serializable;

public class User implements Serializable {
    String ID;
    String password;
    String name;
    boolean likewhether;

    public User(String ID, String password, String name, boolean likewhetherwhether) {
        this.ID = ID;
        this.password = password;
        this.name = name;
        this.likewhether = likewhetherwhether;
    }

    public void setLikewhether(boolean likewhether) {
        this.likewhether = likewhether;
    }

    public boolean isLikewhether() {
        return likewhether;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}

