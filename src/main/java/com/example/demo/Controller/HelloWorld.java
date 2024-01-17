package com.example.demo.Controller;
import com.example.demo.service.helloworldSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	private final helloworldSerivce helloworldserivce;
    @Autowired
    public HelloWorld(helloworldSerivce helloworldserivce) {
        this.helloworldserivce = helloworldserivce;
    }
	
	
	@RequestMapping("/")
	String home() {
		return "Hello 1";
	}
	
	@RequestMapping("/other")
	String home1() {
		return helloworldserivce.newLogic();
	}

}
