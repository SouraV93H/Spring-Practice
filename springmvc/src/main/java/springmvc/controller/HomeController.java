package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Home ruls");
		model.addAttribute("name", "Sourav");

		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("About page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("help page");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "ABC");
		List<Integer> list = new ArrayList<Integer>();	
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		modelAndView.addObject("marks", list);
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
	
}
