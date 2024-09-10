package projectExam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PostController {
    private Scanner sc = new Scanner(System.in);
    private PostRepository postRepository = new PostRepository();
    private PostView postView = new PostView();

    int lastid = 1;

    public PostController() {
        Post p1 = new Post(1, "안녕하세요 반갑습니다. java 공부중이에요.", "냉무", getCurrentDateTime(), 5);
        Post p2 = new Post(2, "java 질문좀 할게요~", "냉무", getCurrentDateTime(), 8);
        Post p3 = new Post(3, "정처기 따야되나요?", "냉무", getCurrentDateTime(), 3);

        postRepository.save(p1);
        postRepository.save(p2);
        postRepository.save(p3);
    }

    public void add() {
        System.out.print("제목 : ");
        String title = sc.nextLine();
        System.out.print("내용 : ");
        String contect = sc.nextLine();

        Post post = new Post(lastid, title, contect, getCurrentDateTime(), 0);

        postRepository.save(post);
        lastid++;
    }

    public void list() {
        ArrayList<Post> posts = postRepository.getPosts();
        postView.printPostList(posts);
    }

    public void update() {

        System.out.print("수정할 게시물 번호 : ");
        int targetid = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findById(targetid);

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

            postView.printPostDetail(post);
        }
    }

    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int targetid = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findById(targetid);

        if (post == null) {
            System.out.println("게시물이 없습니다.");
        } else {
            postRepository.delete(post);
            System.out.println(targetid + "번 게시물이 삭제되었습니다.");
        }
    }

    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
        int targetid = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findById(targetid);

        if (post == null) {
            System.out.println("게시물이 없습니다.");
            return;
        } else {
            post.hit++;
            postView.printPostDetail(post);
        }

        while (true) {
            System.out.print("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 좋아요, 3. 수정, 4. 삭제, 5. 목록으로");
            int feature = Integer.parseInt(sc.nextLine());

            if (feature == 1) {
                System.out.println("댓글 기능");

            } else if (feature == 2) {
                System.out.println("좋아요 기능");
            } else if (feature == 3) {
                System.out.println("수정 기능");
            } else if (feature == 4) {
                System.out.println("삭제 기능");
            } else if (feature == 5) {
                break;
            }
        }

    }

    public void search() {
        System.out.print("검색 키워드를 입력해주세요 : ");
        String keyword = sc.nextLine();

        ArrayList<Post> searchlist = postRepository.findByKeyword(keyword);

        postView.printPostList(searchlist);
    }

    public String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
        String time = now.format(formatter);
        return time;
    }
}
