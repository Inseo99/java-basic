package project;

public class Like {
    int count;
    String user;

    public Like(int count, String user) {
        this.count = 0;
        this.user = user;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getCount() {
        return count;
    }

    public String getUser() {
        return user;
    }
}
