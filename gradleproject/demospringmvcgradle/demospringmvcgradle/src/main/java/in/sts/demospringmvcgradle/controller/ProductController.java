package in.sts.demospringmvcgradle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.sts.demospringmvcgradle.entity.Product;
import in.sts.demospringmvcgradle.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
    public ModelAndView viewHomePage() {
		
		List<Product> listProducts = productService.listAll();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("listProducts", listProducts);
		return mv;
    }
	
	@RequestMapping("/new")
	public String viewNewProductPage(Model model)
	{
		Product product = new Product();
		model.addAttribute("prodcut", product);
		return "new_product";
	}
	
	@RequestMapping("/save")
	public String saveProduct(Product product)
	{
		productService.save(product);
		return "redirect:/";
	}
	
	@RequestMapping("/delete")
	public String deleteProduct(int id)
	{
		productService.delete(id);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editProduct(int id)
	{
		ModelAndView mv = new ModelAndView("edit_product");
		Product product = productService.get(id);
		mv.addObject("product", product);
		return mv;
	}
}
