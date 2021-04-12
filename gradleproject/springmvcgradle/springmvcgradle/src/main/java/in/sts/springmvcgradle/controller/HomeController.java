package in.sts.springmvcgradle.controller;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sts.springmvcgradle.springsecurity.User;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
    public String viewHelloPage() {
      
		System.out.println("homecontroller");
		
		return "home";
    }
	
	@RequestMapping("/login")
	public String loginPage()
	{
		
		return "login";
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage()
	{
		return "logout";
	}
	
	
}
