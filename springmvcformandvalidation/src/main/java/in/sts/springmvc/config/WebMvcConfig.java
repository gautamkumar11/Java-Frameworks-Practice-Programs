package in.sts.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"in.sts.springmvc"})
@EnableWebMvc
public class WebMvcConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver ivr = new InternalResourceViewResolver();
		
		ivr.setPrefix("/WEB-INF/jsp/");
		ivr.setSuffix(".jsp");
		
		return ivr;
		
	}
}
