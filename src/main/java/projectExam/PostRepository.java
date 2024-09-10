package projectExam;

import java.util.ArrayList;

public class PostRepository {
    ArrayList<Post> posts = new ArrayList<>();

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void delete(Post post) {
        posts.remove(post);
    }

    public void save(Post post) {
        posts.add(post);
    }

    public Post findById(int targetid) {
        for (Post post : posts) {
            if (post.getId() == targetid) {
                return post;
            }
        }
        return null;
    }

    public ArrayList<Post> findByKeyword(String keyword) {
        ArrayList<Post> searchlist = new ArrayList<>();

        for (Post post : posts) {
            if (post.getTitle().contains(keyword)) {
                searchlist.add(post);
            }
        }
       return searchlist;
    }
}
