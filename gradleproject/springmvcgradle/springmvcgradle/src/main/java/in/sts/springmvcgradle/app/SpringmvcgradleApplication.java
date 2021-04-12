package in.sts.springmvcgradle.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan( basePackages = {"in.sts.springmvcgradle.*"})
@EnableJpaRepositories(basePackages = {"in.sts.springmvcgradle.*"})
@EntityScan("in.sts.springmvcgradle.*")
@EnableAutoConfiguration
public class SpringmvcgradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcgradleApplication.class, args);
		
		
		System.out.println("application.java");
	}

}
