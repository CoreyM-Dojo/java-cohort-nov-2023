package comcoreym.jspLecture.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String index(Model model) {
		ArrayList<String> VGsAndPizza = new ArrayList<>();
		VGsAndPizza.add("Pepperoni");
		VGsAndPizza.add("Cheese");
		VGsAndPizza.add("Halo");
		VGsAndPizza.add("Combination");
		VGsAndPizza.add("Meat Lovers");
		VGsAndPizza.add("Fable");
		VGsAndPizza.add("Destiny 2");
		model.addAttribute("myList", VGsAndPizza);
		return "index.jsp";
	}
}
