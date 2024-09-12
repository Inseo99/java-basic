package projectExam2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PostController {
    private Scanner sc = new Scanner(System.in);
    private PostView postView = new PostView();
    private PostRepository postRepository = new PostRepository();

    public PostController() {
        Post p1 = new Post(1, "안녕하세요 반갑습니다. java 공부중이에요.", "냉무", getCurrentTime(), 5);
        Post p2 = new Post(2, "java 질문 좀 할게요", "냉무", getCurrentTime(), 7);
        Post p3 = new Post(3, "정처기 따야되나요", "냉무", getCurrentTime(), 0);

        postRepository.save(p1);
        postRepository.save(p2);
        postRepository.save(p3);
    }

    private int lastId = 4;

    public void add() {
        System.out.print("제목 : ");
        String title = sc.nextLine();
        System.out.print("내용 : ");
        String contect = sc.nextLine();

        Post post = new Post(lastId, title, contect, getCurrentTime(), 0);

        postRepository.save(post);
        lastId++;
    }

    public void list() {
        ArrayList<Post> posts = postRepository.getPosts();
        postView.printPostList(posts);
    }

    public void update() {
        System.out.print("수정할 게시물의 번호를 선택하시오 : ");
        int targetId = getParsedInt(sc.nextLine(), -1);
        Post post = postRepository.fintById(targetId);

        if (targetId == -1) {
            return;
        }

        if (post == null) {
            System.out.println("게시물이 없습니다.");
        } else {
            System.out.print("제목 : ");
            String newtitle = sc.nextLine();
            System.out.print("내용 : ");
            String newcontect = sc.nextLine();

            post.setTitle(newtitle);
            post.setContect(newcontect);

            System.out.println("게시물이 수정되었습니다.");
        }
    }

    public void delete() {
        System.out.print("삭제할 게시물의 번호를 선택하시오 : ");
        int targetId = getParsedInt(sc.nextLine(), -1);
        Post post = postRepository.fintById(targetId);

        if (targetId == -1) {
            return;
        }

        if (post == null) {
            System.out.println("게시물이 없습니다.");
        } else {
            postRepository.delete(post);
            System.out.println(post.getId() + "번의 게시물이 삭제되었습니다.");
        }
    }

    public void detail() {
        System.out.print("상세보기 할 게시물의 번호를 선택하시오 : ");
        int targetId = getParsedInt(sc.nextLine(), -1);
        Post post = postRepository.fintById(targetId);

        if (targetId == -1) {
            return;
        }


        if (post == null) {
            System.out.println("게시물이 없습니다.");
            return;
        }
        post.setHit(post.getHit() + 1);

        if (post.getReplies() == null) {
            postView.printPostDetail(post);
        } else {
            postView.printPostDetail(post);
            postView.printReplyList(post.getReplies());
        }

        while (true) {
            System.out.print("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
            int feature = Integer.parseInt(sc.nextLine());

            if (feature == 1) {
                System.out.print("댓글 : ");
                String comment = sc.nextLine();
                post.saveRelies(comment, getCurrentTime());

                System.out.println("댓글이 등록되었습니다.");

                postView.printPostDetail(post);
                postView.printReplyList(post.getReplies());

            } else if (feature == 2) {
                System.out.println("좋아요 기능");
            } else if (feature == 3) {
                System.out.println("수정 기능");
            } else if (feature == 4) {
                System.out.println("삭제 기능");
            } else if (feature == 5) {
                break;
            } else {
                System.out.println("다시 입력하시오");
            }
        }
    }

    public void search() {
        System.out.print("검색 키워드를 입력하시오 : ");
        String keyword = sc.nextLine();
        ArrayList<Post> posts = postRepository.findByKeyword(keyword);

        postView.printPostList(posts);
    }

    public String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        return now.format(formatter);
    }

    public int getParsedInt(String value, int defaultValue) {
        try {
            int parsedInt = Integer.parseInt(value);
            return parsedInt;
        } catch (NullPointerException e) {
            System.out.println("숫자만 입력해주세요.");
        }
        return defaultValue;
    }
}
