package projectExam;

public class Reply {
    private int postId;
    private String body;
    private String regDate;

    public Reply(int postId, String body, String regDate) {
        this.postId = postId;
        this.body = body;
        this.regDate = regDate;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getPostId() {
        return postId;
    }

    public String getBody() {
        return body;
    }

    public String getRegDate() {
        return regDate;
    }
}
