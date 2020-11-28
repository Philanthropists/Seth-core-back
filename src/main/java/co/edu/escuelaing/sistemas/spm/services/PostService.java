package co.edu.escuelaing.sistemas.spm.services;

import co.edu.escuelaing.sistemas.spm.entities.Post;
import co.edu.escuelaing.sistemas.spm.exception.SethCoreException;
import co.edu.escuelaing.sistemas.spm.repository.PostRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  @Autowired private PostRepository postRepository;

  public List<Post> retrieveAllPosts() {
    List<Post> posts = new ArrayList<>();
    postRepository.findAll().forEach(posts::add);
    return posts;
  }

  public Post save(Post post) {
    if (post.getId() != null) {
      SethCoreException.builder()
          .badRequest()
          .message("This post has an id! It should be new.")
          .throwIt();
    }
    return postRepository.save(post);
  }

  public Post update(Post post) {
    if (post.getId() == null) {
      SethCoreException.builder()
          .badRequest()
          .message("Post is new! It should has an id.")
          .throwIt();
    }
    return postRepository.save(post);
  }
}
