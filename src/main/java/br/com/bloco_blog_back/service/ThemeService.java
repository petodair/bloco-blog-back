package br.com.bloco_blog_back.service;

import br.com.bloco_blog_back.entities.Theme;
import br.com.bloco_blog_back.repositories.ThemeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThemeService {
    private final ThemeRepository themeRepository;

    public ThemeService(ThemeRepository themeRepository) {
        this.themeRepository = themeRepository;
    }

    public List<Theme> findAll() {
        return this.themeRepository.findAll();
    }

    public Theme findById(Long id){
        Optional<Theme> theme = themeRepository.findById(id);
        return theme.get();
    }

}
