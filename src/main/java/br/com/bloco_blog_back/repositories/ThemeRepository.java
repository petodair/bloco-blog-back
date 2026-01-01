package br.com.bloco_blog_back.repositories;

import br.com.bloco_blog_back.entities.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThemeRepository extends JpaRepository<Theme, Long> {
}