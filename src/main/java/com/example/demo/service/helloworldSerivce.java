package com.example.demo.service;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;

@Service
public class helloworldSerivce {
	
	public String newLogic() {
		return "Hello World this is new logic";
	}
	
	public String getUserMsg() {
		return new UserRepository;
	}
	
	

}
