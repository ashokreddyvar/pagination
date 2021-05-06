package com.example.ojas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class Hellocontroller {
	@GetMapping("/hello")
	@ResponseBody
    public String sayHello() {
		return "hello ojas";
		
		
	}
}
