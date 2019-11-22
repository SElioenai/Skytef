package skytef.fidelidade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import skytef.fidelidade.model.Product;
import skytef.fidelidade.service.ProductService;
@Controller
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping(value = {"/product"})
	public ModelAndView productList() {
		ModelAndView mv = new ModelAndView("create-product");
		mv.addObject(new Product());
		return mv;
	}
	
	@PostMapping("/products")
	public String save(Product product) {
		service.addProduct(product);
//		return "create-product";
		return "redirect:product";
	}

}
