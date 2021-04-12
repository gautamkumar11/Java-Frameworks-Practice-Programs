package in.sts.springdemoproject.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.sts.springdemoproject.entities")
public class EmployeeConfig {

}
