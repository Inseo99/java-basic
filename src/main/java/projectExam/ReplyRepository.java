package projectExam;

import day7.inheritance.Animal;

import java.util.ArrayList;

public class ReplyRepository {
    private ArrayList<Reply> replies = new ArrayList<>();

    public void insert(int postId, String body, String regDate) {
        Reply reply = new Reply(postId, body, regDate);
        replies.add(reply);
    }

    public ArrayList<Reply> getRepliesByPostId(int postId) {
        ArrayList<Reply> searchedReplies = new ArrayList<>();
        for (Reply reply : replies) {
            if(reply.getPostId() == postId) {
                searchedReplies.add(reply);
            }
        }
        return searchedReplies;
    }
}


