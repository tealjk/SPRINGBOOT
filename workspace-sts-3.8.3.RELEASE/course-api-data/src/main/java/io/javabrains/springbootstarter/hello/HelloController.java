package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	

	
	
	@RequestMapping("/hellos")
	public String sayHi() {
		return "HI Jun Kim TESTING"; 
	}
	
		

}
