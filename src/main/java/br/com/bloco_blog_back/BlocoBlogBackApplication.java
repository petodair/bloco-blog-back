package br.com.bloco_blog_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BlocoBlogBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlocoBlogBackApplication.class, args);
	}

}
