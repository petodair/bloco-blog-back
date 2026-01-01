package br.com.bloco_blog_back.repositories;

import br.com.bloco_blog_back.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
