package projectExam2;

public class User {
    String userId;
    String userPW;
    String username;

    public User(String userId, String userPW, String username) {
        this.userId = userId;
        this.userPW = userPW;
        this.username = username;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserPW(String userPW) {
        this.userPW = userPW;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPW() {
        return userPW;
    }

    public String getUsername() {
        return username;
    }
}
