package com.demo.ea.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ea.model.TestModel;

@RestController
public class TestController {

	
	@GetMapping("/")
	public TestModel getMethod(@RequestParam ("id") String id) {
		
		TestModel model=new TestModel();
		model.setDate(new Date());
		model.setDescription("test success");
		System.out.println(" response -> "+model);
		return model;
	}	
}
