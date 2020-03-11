package br.com.devjava.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

	@GetMapping
	public String sayHello() {
		return "Hello from SpringBoot by DevJava";
	}
}
