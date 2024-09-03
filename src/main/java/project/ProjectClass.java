package project;

import java.util.ArrayList;

public class ProjectClass {
    private ArrayList titlelist = new ArrayList<>();
    private ArrayList contentlist = new ArrayList<>();

    public void setTitlelist(String title) {
        titlelist.add(title);
    }

    public void setContentlist(String content) {
        contentlist.add(content);
    }

    public void listprint() {
        for (int i = 0; i < titlelist.size(); i++) {
            System.out.println("===========================");
            System.out.println("제목 : " + titlelist.get(i));
            System.out.println("내용 : " + contentlist.get(i));
        }
    }

    public void Titlelist() {
        for (int i = 0; i < titlelist.size(); i++) {
            System.out.println("=================");
            System.out.println("번호 : " + (i + 1));
            System.out.println("제목 : " + titlelist.get(i));
        }
        System.out.println("=================");
    }

    public void getTitle(int num) {
        if (num > titlelist.size()) {
            System.out.println("없는 게시물 번호입니다.");
        } else if (num <= titlelist.size()) {

        }
    }

    public void setTitlelist(int choice, String newtitle) {
        titlelist.set(choice - 1, newtitle);
    }

    public void setContentlist(int choice, String newcontent) {
        contentlist.set(choice - 1, newcontent);
    }
}
