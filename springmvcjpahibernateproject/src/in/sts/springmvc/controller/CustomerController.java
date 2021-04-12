package in.sts.springmvc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.sts.springmvc.entity.Customer;
import in.sts.springmvc.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		List<Customer> listCustomer = customerService.listAll();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("listCustomer", listCustomer);
		return mv;
	}
	
	@RequestMapping("/new")
	public String newCustomerForm(Map<String, Object> model)
	{
		Customer customer = new Customer();
		model.put("Customer", customer);		
		return "new_customer";
	}
	
	@RequestMapping("/save")
	public String saveCustomer(@ModelAttribute("customer") Customer customer)
	{
		customerService.save(customer);
		return "redirect/";
	}
	
}
