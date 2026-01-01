package br.com.bloco_blog_back.repositories;

import br.com.bloco_blog_back.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
