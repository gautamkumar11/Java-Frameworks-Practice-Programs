package in.sts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddController {
	@RequestMapping("/add")
	public String add(@RequestParam("t1") int i, @RequestParam("t2") int j, Model m)
	{
		int k = i + j;
		
		m.addAttribute("result", k);
		
		return "result";
	}

}
