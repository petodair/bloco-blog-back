package br.com.bloco_blog_back.controller;

import br.com.bloco_blog_back.entities.Post;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/post")
public class PostController {

    @GetMapping
    public ResponseEntity<Post> findAll(){
        Post post = new Post();
        post.setId(1L);
        post.setTitle("Post 1");
        post.setContent("Post content");

        return ResponseEntity.ok(post);
    }
}
