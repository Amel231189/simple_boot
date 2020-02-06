package com.formation.simpleboot.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.formation.simpleboot.service.calculator;

@RestController
public class calculatorCtrl {
	@Autowired
	private calculator calculator;
	
	@RequestMapping("/sum")
	String sum (@RequestParam ("a")Integer a,@RequestParam("b")Integer b) {
		return String.valueOf(((calculator).sum (a,b));
	}
	
}
