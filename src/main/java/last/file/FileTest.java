package last.file;

import project.Post;
import project.User;

public class FileTest {
    public static void main(String[] args) {

        Post p1 = new Post(1, "aaa","aaaaaa", 0,"240912", "홍", 0);
        User u1 = new User("qwe123","asd123", "홍", false);

        // 자바의 대부분의 정보는 객체라는 형태로 구조화(얼려져)되어 있다.
        // 파일은 기본적으로 텍스트로 저장된다.
        // 자바의 객체를 바로 텍스트로 저장 불가능.
        // 자바의 객체를 먼저 텍스트(문자)화 시켜야 함. => 직렬화(Serializable)
        // 텍스트를 불러와서 자바의 객체 형태로 만드는 것 => 역직렬화(Deserializable)

        // 객체 직렬화 -> jackson 라이브러리를 이용해 객체를 json 문자화하기


        FileUtil fu = new FileUtil();
        JsonUtil ju = new JsonUtil();

        String jsonString = ju.toJsonString(p1); // p1객체를 json 문자열로 직렬화
        String jsonUserString = ju.toJsonString(u1);

        fu.save(jsonString, "test.json"); // 직렬화된 p1을 test.json 파일에 저장
        String contect = fu.load("test.json");

        fu.save(jsonString, "User.json");
        String userContect = fu.load("User.json");

        System.out.println(contect);
        Post post = (Post) ju.toClass(contect);
        System.out.println("제목 : " + post.getTitle()); // json 문자열을 Post로 객체화(역직렬화)
        System.out.println("내용 : " + post.getContent());

        System.out.println(userContect);
        User user = (User) ju.toClass(userContect);
        System.out.println("아이디 : " + user.getID());
        System.out.println("비밀번호 : " + user.getPassword());
        System.out.println("닉네임 : " + user.getName());

        // 생성자 여러개 만들 수 있다. 단, 매개변수 모양이 달라야 함. => 생성자 오버로딩
    }
}

