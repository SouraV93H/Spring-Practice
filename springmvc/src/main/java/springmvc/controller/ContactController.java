package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;

	@RequestMapping("/contact")
	public String showForm() {

		return "contact";
	}

	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email") String email, @RequestParam("name")
	 * String name,
	 * 
	 * @RequestParam("password") String password, Model model) { User user = new
	 * User(); user.setEmail(email); user.setName(name); user.setPassword(password);
	 * System.out.println(user); // model.addAttribute("email", email); //
	 * model.addAttribute("name", name); // model.addAttribute("password",
	 * password);
	 * 
	 * model.addAttribute("user", user); return "success";
	 * 
	 * }
	 */

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

		System.out.println(user);
this.userService.createUser(user);
model.addAttribute("msg", "User created Successfully");
		return "success";
	}
}
