package br.com.bloco_blog_back.config;

import br.com.bloco_blog_back.entities.Post;
import br.com.bloco_blog_back.entities.User;
import br.com.bloco_blog_back.enums.Rating;
import br.com.bloco_blog_back.repositories.PostRepository;
import br.com.bloco_blog_back.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    private final UserRepository userRepository;
    private final PostRepository postRepository;

    public TestConfig(UserRepository userRepository,  PostRepository postRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User("Maria Brown", "Maria@gmail.com", "12345678");
        User u2 = new User("Alex Grenn", "Alex@gmail.com", "12345678");
        Post p1 = new Post("Novo Post","Esse é meu novo post",u1, Rating.NEUTRAL);
        Post p2 = new Post("Novo Post 2","Esse é meu novo post 2",u2, Rating.NEUTRAL);
        userRepository.saveAll(Arrays.asList(u1, u2));
        postRepository.saveAll(Arrays.asList(p1,p2));
    }
}
