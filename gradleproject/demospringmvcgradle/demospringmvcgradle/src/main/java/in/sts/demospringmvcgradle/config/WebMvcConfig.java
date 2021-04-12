package in.sts.demospringmvcgradle.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@ComponentScan(basePackages = {"in.sts.demospringmvcgradle.*"})
@EnableJpaRepositories(basePackages = {"in.sts.demospringmvcgradle.*"})
@EntityScan("in.sts.demospringmvcgradle.entity")
@EnableAutoConfiguration
public class WebMvcConfig {

	public static void main(String[] args) {
		SpringApplication.run(WebMvcConfig.class, args);
		
		System.out.println("application.java");
	}

}
