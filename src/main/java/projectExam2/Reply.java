package projectExam2;

public class Reply {
    String comment;
    String time;

    public Reply(String comment, String time) {
        this.comment = comment;
        this.time = time;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getComment() {
        return comment;
    }

    public String getTime() {
        return time;
    }
}
