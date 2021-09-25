package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public String one() {
		
		System.out.println("HELLO FROM ONE !!");
		return "redirect:/three";
		
	}
	
	@RequestMapping("/two")
	public RedirectView two() {
		
		System.out.println("HELLO FROM TWO !!");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("three");
		return redirectView;
		
	}
	
	@RequestMapping("/three")
	public String three() {
		
		System.out.println("HELLO FROM THREE !!");
		return "redirect:/contact";
		
	}

}
