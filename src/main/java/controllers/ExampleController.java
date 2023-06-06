package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example") // prefisso per tutti gli endpoint di questo controller
public class ExampleController {

	@GetMapping("/index")
	public String index() {
		return "ciao!";
	}

	@GetMapping("/about")
	public String about() {
		return "<h1>pagina principale</h1>";
	}
}
