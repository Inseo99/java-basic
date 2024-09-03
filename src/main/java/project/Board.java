package project;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Board {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Post> posts = new ArrayList<>();
        int lastestId = 1; // 가장 최신의 id 값. id값의 고유성을 유지하기 위해 1씩 증가시킬 계획임.

        posts.add(new Post(1, "안녕하세요 반갑습니다. 자바 공부중이에요", "너무 어려워요", "2024.09.03"));
        posts.add(new Post(2, "자바 질문 좀 할게요~", "너무 어려워요", "2024.09.04"));
        posts.add(new Post(3, "정처기 따야되나요?", "너무 어려워요", "2024.09.05"));

        while (true) {
            System.out.print("명령어를 입력해주세요. : ");
            String command = sc.nextLine();

            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요. : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요. : ");
                String content = sc.nextLine();
                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
                String time = now.format(formatter);

                // 1부터 1씩 증가 -> 고유값 유지하는데 편리
                Post post = new Post(lastestId, title, content, time);

                posts.add(post);
                System.out.println("게시물이 등록되었습니다.");
                lastestId++; // 다음 게시물의 id를 부여하기 위해 1증가

            } else if (command.equals("list")) {
//                System.out.println("====================");
//                for (Post post : posts) {
//                    System.out.println("제목 : " + post.getTitle());
//                    System.out.println("내용 : " + post.getContent());
//                    System.out.println("====================");
//                }
                System.out.println("====================");
                for (Post post : posts) {
                    System.out.println("번호 : " + post.getId());
                    System.out.println("제목 : " + post.getTitle());
                    System.out.println("====================");
                }
            } else if (command.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());
                for (Post post : posts) {
                    if (post.getId() == targetId) {
                        System.out.print("제목 : ");
                        String newtitle = sc.nextLine();
                        System.out.print("내용 : ");
                        String newcontent = sc.nextLine();

                        post.setTitle(newtitle);
                        post.setContent(newcontent);

                        System.out.println(targetId + "번 게시물이 수정되었습니다.");
                    }
                }

//                    Post newpost = new Post(postnum, newtitle, newcontent);
//                    posts.set(postnum - 1, newpost); // 원하는 위치의 post를 newPost로 교체

//                    Post post = posts.get(postnum - 1);
//                    post.setTitle(newtitle);
//                    post.setContent(newcontent);

                System.out.println(targetId + "번 게시물이 수정되었습니다.");
            } else if (command.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());
                for (Post post : posts) {
                    if (post.getId() == targetId) {
                        System.out.println(targetId + "번 게시물이 삭제되었습니다.");
                        posts.remove(post);
                    }
                }
            } else if (command.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요. : ");
                int targetId = Integer.parseInt(sc.nextLine());
                for (Post post : posts) {
                    if (post.getId() == targetId) {
                        post.increaseView();
                        System.out.println("======================");
                        System.out.println("번호 : " + targetId);
                        System.out.println("제목 : " + post.getTitle());
                        System.out.println("내용 : " + post.getContent());
                        System.out.println("등록날짜 : " + post.getTime());
                        System.out.println("조회수 : " + post.getViews());
                        System.out.println("======================");
                    }
                }
                System.out.print("상세보기 기능을 선택해주세요.(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
                int feature = Integer.parseInt(sc.nextLine());
                if (feature == 1) {
                    System.out.println("댓글 기능");
                } else if (feature == 2) {
                    System.out.println("추천 기능");
                } else if (feature == 3) {
                    System.out.println("수정 기능");
                } else if (feature == 4) {
                    System.out.println("삭제 기능");
                } else {
                    continue;
                }


            } else if (command.equals("search")) {
                System.out.print("검색 키워드를 입력해주세요. : ");
                String keyword = sc.nextLine();
                System.out.println("====================");
                for (Post post : posts) {
                    if (post.getTitle().contains(keyword)) {
                        System.out.println("번호 : " + post.getId());
                        System.out.println("제목 : " + post.getTitle());
                        System.out.println("====================");
                    }
                }
            }
        }
    }
}
