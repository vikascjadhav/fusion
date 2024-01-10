package com.fusion;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import com.fusion.model.Home;

@Controller
public class HomeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@GetMapping("/home")
	public String home(Model model) {
		Home home = new Home();
		home.setMessage("Hello World Example Using Spring MVC 5!!!");
		home.setDateTime(new Date());
		model.addAttribute("home", home);
		return "home";
	}


}
