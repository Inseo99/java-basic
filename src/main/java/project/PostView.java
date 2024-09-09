package project;

import java.util.ArrayList;

public class PostView {
    private PostRepository postRepository = new PostRepository();

    public void printPostList(ArrayList<Post> targetList) {
        System.out.println("==================");
        for (Post post : targetList) {
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.println("작성자 : " + post.getUser());
            System.out.println("==================");
        }
    }

    public void printPostDetail(Post post){
        System.out.println("======================");
        System.out.println("번호 : " + post.getId());
        System.out.println("제목 : " + post.getTitle());
        System.out.println("내용 : " + post.getContent());
        System.out.println("작성일 : " + post.getTime());
        System.out.println("조회수 : " + post.getViews());
        System.out.println("작성자 : " + post.getUser());
        if (post.getLikecount() == 0) {
            System.out.println("좋아요 : ♡ " + post.getLikecount());
        } else {
            System.out.println("좋아요 : ♥ " + post.getLikecount());
        }
        System.out.println("======================");
    }
}
