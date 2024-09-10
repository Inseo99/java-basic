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
        System.out.println("번호 : " + post.id);
        System.out.println("제목 : " + post.title);
        System.out.println("내용 : " + post.contect);
        System.out.println("작성일 : " + post.time);
        System.out.println("조회수 : " + post.hit);
        System.out.println("=======================");
    }

}
