package projectExam;

import java.util.ArrayList;

public class PostView {


    public void printPostList(ArrayList<Post> targetlist) {
        System.out.println("======================");
        for (Post post : targetlist) {
            System.out.println("번호 : " + post.getId());
            System.out.println("제목 : " + post.getTitle());
            System.out.println("======================");
        }
    }

    public void printPostDetail (Post post) {
        System.out.println("=======================");
        System.out.println("번호 : " + post.getId());
        System.out.println("제목 : " + post.getTitle());
        System.out.println("내용 : " + post.getContect());
        System.out.println("작성일 : " + post.getTime());
        System.out.println("조회수 : " + post.getHit());
        System.out.println("=======================");
    }

    public void printReplies(ArrayList<Reply> replies) {
        System.out.println("======= 댓글 =======");
        for (Reply reply : replies) {
            System.out.println("댓글 내용 : " + reply.getBody());
            System.out.println("댓글 작성일 : " + reply.getRegDate());
            System.out.println("====================");
        }
    }

}
