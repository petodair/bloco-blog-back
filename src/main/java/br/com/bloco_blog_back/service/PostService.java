package br.com.bloco_blog_back.service;

import br.com.bloco_blog_back.entities.Post;
import br.com.bloco_blog_back.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findAll() {
        return this.postRepository.findAll();
    }

    public Post findById(Long id){
        Optional<Post> post = postRepository.findById(id);
        return post.get();
    }

}
