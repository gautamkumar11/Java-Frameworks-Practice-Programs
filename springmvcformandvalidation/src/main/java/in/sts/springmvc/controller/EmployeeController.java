package in.sts.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import in.sts.springmvc.bean.Employee;

@Controller
public class EmployeeController {
	
	@RequestMapping("/employeeform")
	public String generateForm(Model model)
	{
		
		Employee emp = new Employee();
		model.addAttribute("employeedetails", emp);
		
		return "employee_form";
	}
}
