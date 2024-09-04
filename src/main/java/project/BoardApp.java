package project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardApp {

    //main 메서드와 findPostById 메서드가 같이 사용해야 하므로 main 밖으로 빼주고 static 붙여줌
    ArrayList<Post> posts = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    User currentUser = null;

    // 값의ㅏ 초기화는 대부분 생성자에서 해주는 것을 권장합니다. 다양한 로직 수행 가능합니다.
//    public BoardApp() {
//
//        Post p1 = new Post(1, "안녕하세요 반갑습니다.java 공부중이에요.", "냉무", grtCurrentDateTime(), "홍");
//        Post p2 = new Post(2, "java 질문 좀 할게요~", "냉무", grtCurrentDateTime(), "홍");
//        Post p3 = new Post(3, "정처기 따야되나요?", "냉무", grtCurrentDateTime(), "홍");
//        posts.add(p1);
//        posts.add(p2);
//        posts.add(p3);
//    }

    public void run() {

        Scanner sc = new Scanner(System.in);

        int lastestId = 1; // 가장 최신의 id 값. id값의 고유성을 유지하기 위해 1씩 증가시킬 계획임.

        while (true) {
            if (currentUser != null) {
                System.out.print("명령어를 입력해주세요.[");
                System.out.print(currentUser.getID() + "(" + currentUser.getName() + ")");
                System.out.print("] : ");
            } else if (currentUser == null) {
                System.out.print("명령어를 입력해주세요. : ");
            }

            String command = sc.nextLine();

            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요. : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요. : ");
                String content = sc.nextLine();

                // 1부터 1씩 증가 -> 고유값 유지하는데 편리
                Post post = new Post(lastestId, title, content, grtCurrentDateTime(), currentUser.getName());

                posts.add(post);
                System.out.println("게시물이 등록되었습니다.");
                lastestId++; // 다음 게시물의 id를 부여하기 위해 1증가

            } else if (command.equals("list")) {
                printPostList(posts);
            } else if (command.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());
                Post post = findPostById(targetId);
                System.out.print("제목 : ");
                String newtitle = sc.nextLine();
                System.out.print("내용 : ");
                String newcontent = sc.nextLine();

                post.setTitle(newtitle);
                post.setContent(newcontent);

                System.out.println(targetId + "번 게시물이 수정되었습니다.");
//                for (Post post : posts) {
//                    if (post.getId() == targetId) {
//                        System.out.print("제목 : ");
//                        String newtitle = sc.nextLine();
//                        System.out.print("내용 : ");
//                        String newcontent = sc.nextLine();
//
//                        post.setTitle(newtitle);
//                        post.setContent(newcontent);
//
//                        System.out.println(targetId + "번 게시물이 수정되었습니다.");
//                    }
//                }

//                    Post newpost = new Post(postnum, newtitle, newcontent);
//                    posts.set(postnum - 1, newpost); // 원하는 위치의 post를 newPost로 교체

//                    Post post = posts.get(postnum - 1);
//                    post.setTitle(newtitle);
//                    post.setContent(newcontent);

//                System.out.println(targetId + "번 게시물이 수정되었습니다.");
            } else if (command.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());
//                for (Post post : posts) {
//                    if (post.getId() == targetId) {
//                        System.out.println(targetId + "번 게시물이 삭제되었습니다.");
//                        posts.remove(post);
//                    }
//                }

                Post post = findPostById(targetId);
                System.out.println(targetId + "번 게시물이 삭제되었습니다.");
                posts.remove(post);

                if (post == null) {
                    System.out.println("존재하지 않는 게시물 번호입니다.");
                }

            } else if (command.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요. : ");
                int targetId = Integer.parseInt(sc.nextLine());
                Post post = findPostById(targetId);

                if (post == null) {
                    System.out.println("존재하지 않는 게시물 번호입니다.");
                }

                post.increaseView();
                System.out.println("======================");
                System.out.println("번호 : " + targetId);
                System.out.println("제목 : " + post.getTitle());
                System.out.println("내용 : " + post.getContent());
                System.out.println("등록날짜 : " + post.getTime());
                System.out.println("조회수 : " + post.getViews());
                System.out.println("작성자 : " + post.getUser());
                System.out.println("======================");
//                for (Post post : posts) {
//                    if (post.getId() == targetId) {
//                        post.increaseView();
//                        System.out.println("======================");
//                        System.out.println("번호 : " + targetId);
//                        System.out.println("제목 : " + post.getTitle());
//                        System.out.println("내용 : " + post.getContent());
//                        System.out.println("등록날짜 : " + post.getTime());
//                        System.out.println("조회수 : " + post.getViews());
//                        System.out.println("======================");
//                    }
//                }
                while (true) {
                    System.out.print("상세보기 기능을 선택해주세요.(1. 댓글 등록, 2. 좋아요, 3. 수정, 4. 삭제, 5. 목록으로) : ");
                    int feature = Integer.parseInt(sc.nextLine());
                    if (feature == 1) {
                        System.out.print("댓글 내용 : ");
                        String comment = sc.nextLine();
                        post.addComments(comment, grtCurrentDateTime());

                        System.out.println("댓글이 성공적으로 등록되었습니다.");

                        System.out.println("======================");
                        System.out.println("번호 : " + targetId);
                        System.out.println("제목 : " + post.getTitle());
                        System.out.println("내용 : " + post.getContent());
                        System.out.println("등록날짜 : " + post.getTime());
                        System.out.println("조회수 : " + post.getViews());
                        System.out.println("작성자 : " + post.getUser());
                        System.out.println("======================");
                        for (CommentFeature commentFeature : post.getComments()) {
                            System.out.println("========= 댓글 =========");
                            System.out.println("댓글 내용 : " + commentFeature.getComment());
                            System.out.println("댓글 작성일 : " + commentFeature.getTime());
                            System.out.println("======================");
                        }

                    } else if (feature == 2) {
                        System.out.println("해당 게시물을 좋아합니다.");
                        System.out.println("해당 게시물의 좋아요를 해제합니다.");
                    } else if (feature == 3) {
                        if (post.getUser() == currentUser.getName()) {
                            System.out.print("제목 : ");
                            String newtitle = sc.nextLine();
                            post.setTitle(newtitle);
                            System.out.print("내용 : ");
                            String newcontect = sc.nextLine();
                            post.setContent(newcontect);

                            System.out.println("======================");
                            System.out.println("번호 : " + targetId);
                            System.out.println("제목 : " + post.getTitle());
                            System.out.println("내용 : " + post.getContent());
                            System.out.println("등록날짜 : " + post.getTime());
                            System.out.println("조회수 : " + post.getViews());
                            System.out.println("작성자 : " + post.getUser());
                            System.out.println("======================");
                        } else {
                            System.out.println("자신의 게시물만 수정/삭제 할 수 있습니다.");
                            continue;
                        }

                    } else if (feature == 4) {
                        if (post.getUser().equals(currentUser.getName())) {
                            System.out.print("정말 게시물을 삭제하시겠습니까? (y/n) : ");
                            String answer = sc.nextLine();
                            if (answer.equals("y")) {
                                System.out.println(post.getUser() + "님의 " + post.getId() + "번의 게시물을 삭제했습니다.");

                                posts.remove(post);

                                printPostList(posts);
                                break;
                            } else if (answer.equals("n")) {
                                continue;
                            }
                        } else {
                            System.out.println("자신의 게시물만 수정/삭제 할 수 있습니다.");
                            continue;
                        }
                    } else {
                        break;
                    }
                }

            } else if (command.equals("search")) {
                System.out.print("검색 키워드를 입력해주세요. : ");
                String keyword = sc.nextLine();
                ArrayList<Post> searchedPostList = new ArrayList<>();

                for (Post post : posts) {
                    if (post.getTitle().contains(keyword)) {
                        searchedPostList.add(post);
                    }
                }

                printPostList(searchedPostList);

            } else if (command.equals("signup")) {
                System.out.println("==== 회원 가입을 진행합니다. ====");
                System.out.print("아이디를 입력해주세요. : ");
                String ID = sc.nextLine();
                System.out.print("비밀번호를 입력해주세요. : ");
                String password = sc.nextLine();
                System.out.print("닉네임을 입력해주세요 : ");
                String name = sc.nextLine();

                User user = new User(ID, password, name);
                users.add(user);

                System.out.println("==== 회원가입이 완료되었습니다. ====");

            } else if (command.equals("login")) {
                System.out.print("아이디 : ");
                String ID = sc.nextLine();
                System.out.print("비밀번호 : ");
                String password = sc.nextLine();
                User userId = findUserById(ID);
                User userPassword = findUserByPassword(password);
                if (userId.getID().equals(ID) && userPassword.getPassword().equals(password)) {
                    System.out.println(userId.getName() + "님 환영합니다!");
                    currentUser = userId;

                    if (userId.getID() == null || userPassword.getPassword() == null) {
                        System.out.println("비밀번호를 틀렸거나 잘못된 회원정보입니다.");
                    }
                }
            }
        }
    }


    public Post findPostById(int id) {
        // 만약 내가 찾고자 하는 게시물이 없다면?
        for (Post post : posts) {
            if (post.getId() == id) {
                return post; // return을 만나면 메서드는 그 즉시 종료
            }
        }
        return null; // null은 없다라는 의미
    }

    public User findUserById(String id) {
        for (User user : users) {
            if (user.getID().equals(id)) {
                return user; // return을 만나면 메서드는 그 즉시 종료
            }
        }
        return null; // null은 없다라는 의미
    }

    public User findUserByPassword(String password) {
        for (User user : users) {
            if (user.getID().equals(password)) {
                return user; // return을 만나면 메서드는 그 즉시 종료
            }
        }
        return null; // null은 없다라는 의미
    }

    public String grtCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String time = now.format(formatter);
        return time;
    }

    public void printPostList(ArrayList<Post> targetList) {
        System.out.println("==================");
        for (Post post : targetList) {
            System.out.printf("번호 : %d\n", post.getId());
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.println("작성자 : " + currentUser.getName());
            System.out.println("==================");
        }
    }
}