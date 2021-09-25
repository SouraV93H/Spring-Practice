package learncrud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import learncrud.Dao.ProductDao;
import learncrud.model.Product;

@Controller
public class MainController {
	
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String home(Model m) {
		List<Product> products= productDao.getProducts();
		
		m.addAttribute("product", products);
		
		return "home";
	}
	
	@RequestMapping("/addproduct")
	public String addProduct(Model m) {
		
		m.addAttribute("title", "Add Product");
		return"add_product_form";
		
	}
	
	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest r) {
		System.out.println(product);

		productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
	
		redirectView.setUrl(r.getContextPath()+"/");
		
		return redirectView;
		
	}
	//delete handler
	
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int id,HttpServletRequest r ) {
		
		this.productDao.deleteProduct(id);
		RedirectView redirectView = new RedirectView();
		
		redirectView.setUrl(r.getContextPath()+"/");
		return redirectView;
	}
	
	//update handler
	@RequestMapping("/update/{productId}")
	public String updateProduct(@PathVariable("productId") int id, Model m) {
		
		Product product =this.productDao.getProduct(id);
		m.addAttribute("product", product);
		return "update_form";
		
	}

}
