package co.edu.escuelaing.sistemas.spm.controllers;

import co.edu.escuelaing.sistemas.spm.entities.Post;
import co.edu.escuelaing.sistemas.spm.services.PostService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/post")
public class PostController {

  @Autowired private PostService postService;

  @GetMapping("/posts")
  public List<Post> getPosts() {
    return postService.retrieveAllPosts();
  }

  @PostMapping("/publish")
  public Post addPost(@RequestBody @Valid Post post) {
    return postService.save(post);
  }

  @PutMapping("/publish")
  public Post updatePost(@RequestBody @Valid Post post) {
    return postService.update(post);
  }
}
