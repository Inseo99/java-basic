package project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PostController {
    private Scanner sc = new Scanner(System.in);

    private PostRepository postRepository = new PostRepository();
    private PostView postView = new PostView();
    private UserController userController = new UserController();

    private int lastestId = 1; // 가장 최신의 id 값. id값의 고유성을 유지하기 위해 1씩 증가시킬 계획임.

    // 값의 초기화는 대부분 생성자에서 해주는 것을 권장합니다.다양한 로직 수행 가능합니다.
    public PostController() {

        Post p1 = new Post(8, "안녕하세요 반갑습니다.java 공부중이에요.", "냉무", 15, grtCurrentDateTime(), "홍", 13);
        Post p2 = new Post(3, "java 질문 좀 할게요~", "냉무", 28, grtCurrentDateTime(), "홍", 8);
        Post p3 = new Post(5, "정처기 따야되나요?", "냉무", 9, grtCurrentDateTime(), "홍", 9);

        postRepository.save(p1);
        postRepository.save(p2);
        postRepository.save(p3);
    }

    public void sort() {
        System.out.print("정렬 대상을 선택해주세요. (1. 번호, 2. 조회수) : ");
        int postToSort = Integer.parseInt(sc.nextLine());
        System.out.print("정렬 방법을 선택해주세요. (1. 오름차순, 2. 내림차순) : ");
        int sortMethod = Integer.parseInt(sc.nextLine());

        if (postToSort == 1) {
            if (sortMethod == 1) {
                Collections.sort(postRepository.getPosts(), new Comparator<Post>() {
                    @Override
                    public int compare(Post o1, Post o2) {
                        return Integer.compare(o1.getId(), o2.getId());
                    }
                });
            } else if (sortMethod == 2) {
                postRepository.getPosts().sort(Comparator.comparingInt(Post::getId).reversed());
            }
        } else if (postToSort == 2) {
            if (sortMethod == 1) {
                Collections.sort(postRepository.getPosts(), new Comparator<Post>() {
                    @Override
                    public int compare(Post o1, Post o2) {
                        return Integer.compare(o1.getViews(), o2.getViews());
                    }
                });
            } else if (sortMethod == 2) {
                postRepository.getPosts().sort(Comparator.comparingInt(Post::getViews).reversed());
            }
        }
        System.out.println("==========================");
        for (Post post : postRepository.getPosts()) {
            System.out.println("번호 : " + post.getId());
            System.out.println("제목 : " + post.getTitle());
            System.out.println("작성자 : " + post.getUser());
            System.out.println("조회수 : " + post.getViews());
            System.out.println("좋아요 : " + post.getLikecount());
            System.out.println("==========================");
        }
    }

    public void list() {
        ArrayList<Post> posts = postRepository.getPosts();
        postView.printPostList(posts);
    }

    public void search() {
        System.out.print("검색 키워드를 입력해주세요. : ");
        String keyword = sc.nextLine();

        ArrayList<Post> searchedPostList = postRepository.getPostsByKeyword(keyword);

        postView.printPostList(searchedPostList);
    }

    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요. : ");
        int targetId = Integer.parseInt(sc.nextLine());

        Post post = postRepository.findPostById(targetId); // 창고에 꺼내서

        // ==== 요리를 한다음
        if (post == null) {
            System.out.println("존재하지 않는 게시물 번호입니다.");
            return;
        } else {
            post.increaseView();
            // =======
            postView.printPostDetail(post); // 서빙한테 넘겨줌
        }

        while (true) {
            System.out.print("상세보기 기능을 선택해주세요.(1. 댓글 등록, 2. 좋아요, 3. 수정, 4. 삭제, 5. 목록으로) : ");
            int feature = Integer.parseInt(sc.nextLine());
            if (feature == 1) {
                System.out.print("댓글 내용 : ");
                String comment = sc.nextLine();
                post.addComments(comment, grtCurrentDateTime());

                System.out.println("댓글이 성공적으로 등록되었습니다.");

                postView.printPostDetail(post);
                for (CommentFeature commentFeature : post.getComments()) {
                    System.out.println("========= 댓글 =========");
                    System.out.println("댓글 내용 : " + commentFeature.getComment());
                    System.out.println("댓글 작성일 : " + commentFeature.getTime());
                    System.out.println("======================");
                }

            } else if (feature == 2) {
                if (userController.currentUser != null) {
                    if (!userController.currentUser.likewhether) {
                        System.out.println("해당 게시물을 좋아합니다.");
                        userController.currentUser.setLikewhether(true);
                        post.increaselikecount();


                    } else {
                        System.out.println("해당 게시물의 좋아요를 해제합니다.");
                        userController.currentUser.setLikewhether(false);
                        post.decreaselikecount();
                    }

                    postView.printPostDetail(post);
                } else {
                    System.out.println("로그인 상태만 가능합니다.");
                    continue;
                }
            } else if (feature == 3) {
                if (userController.currentUser == null) {
                    System.out.println("로그인 상태만 가능합니다.");
                } else if (!post.getUser().equals(userController.currentUser.getName())) {
                    System.out.println("자신의 게시물만 수정/삭제 할 수 있습니다.");
                } else if (post.getUser().equals(userController.currentUser.getName())) {
                    System.out.print("제목 : ");
                    String newtitle = sc.nextLine();
                    post.setTitle(newtitle);
                    System.out.print("내용 : ");
                    String newcontect = sc.nextLine();
                    post.setContent(newcontect);

                    System.out.println("======================");
                    System.out.println("번호 : " + post.getId());
                    System.out.println("제목 : " + post.getTitle());
                    System.out.println("내용 : " + post.getContent());
                    System.out.println("작성일 : " + post.getTime());
                    System.out.println("조회수 : " + post.getViews());
                    System.out.println("작성자 : " + post.getUser());
                    System.out.println("======================");
                }

            } else if (feature == 4) {
                if (userController.currentUser == null) {
                    System.out.println("로그인 상태만 가능합니다.");
                } else if (!post.getUser().equals(userController.currentUser.getName())) {
                    System.out.println("자신의 게시물만 수정/삭제 할 수 있습니다.");
                } else if (post.getUser().equals(userController.currentUser.getName())) {
                    System.out.print("정말 게시물을 삭제하시겠습니까? (y/n) : ");
                    String answer = sc.nextLine();
                    if (answer.equals("y")) {
                        System.out.println(post.getUser() + "님의 " + post.getId() + "번의 게시물을 삭제했습니다.");

                        postRepository.delete(post);

                        postView.printPostList(postRepository.getPosts());
                        break;
                    } else if (answer.equals("n")) {
                        continue;
                    }
                }
            } else {
                break;
            }
        }
    }

    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findPostById(targetId);
        if (post == null) {
            System.out.println("존재하지 않는 게시물 번호입니다.");
            return;
        }
        System.out.println(targetId + "번 게시물이 삭제되었습니다.");
        postRepository.delete(post);

    }

    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findPostById(targetId);
        if (post == null) {
            System.out.println("존재하지 않는 게시물 번호입니다.");
            return;
        }
        System.out.print("제목 : ");
        String newtitle = sc.nextLine();
        System.out.print("내용 : ");
        String newcontent = sc.nextLine();

        post.setTitle(newtitle);
        post.setContent(newcontent);

        System.out.println(targetId + "번 게시물이 수정되었습니다.");
    }

    public void add() {
        System.out.print("게시물 제목을 입력해주세요. : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요. : ");
        String content = sc.nextLine();

        // 1부터 1씩 증가 -> 고유값 유지하는데 편리
        String username = userController.loginWhether();
        Post post = new Post(lastestId, title, content, 0, grtCurrentDateTime(), username, 0);

        postRepository.save(post);
        System.out.println("게시물이 등록되었습니다.");
        lastestId++; // 다음 게시물의 id를 부여하기 위해 1증가
    }


    public String grtCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String time = now.format(formatter);
        return time;
    }
}
