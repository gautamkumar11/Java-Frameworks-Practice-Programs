package in.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController2 {
	@RequestMapping("/boot")
	public String display() {
		
		return "viewpage2";
	}
}
