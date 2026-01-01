package br.com.bloco_blog_back.controller;

import br.com.bloco_blog_back.entities.Theme;
import br.com.bloco_blog_back.service.ThemeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/theme")
public class ThemeController {

    private final ThemeService themeService;

    public ThemeController(ThemeService themeService) {
        this.themeService = themeService;
    }

    @GetMapping
    public ResponseEntity<List<Theme>> findAll(){
        List<Theme> themes = this.themeService.findAll();
        return ResponseEntity.ok(themes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Theme> findById(@PathVariable Long id){
        Theme theme = this.themeService.findById(id);
        return ResponseEntity.ok(theme);
    }
}
