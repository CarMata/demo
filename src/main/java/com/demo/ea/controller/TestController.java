package com.demo.ea.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.demo.ea.model.PeopleModel;
import com.demo.ea.model.TestModel;
import com.demo.ea.repository.PeopleCrud;
import com.demo.ea.repository.PeopleRepository;

@RestController
public class TestController {

	@Autowired
	private PeopleRepository peopleRepository;
	@Autowired
	private PeopleCrud crud;
	@CrossOrigin
	@GetMapping("/")
	public ResponseEntity<?> getMethod() {
		System.out.println("-----------get Method----------- ");
		List<PeopleModel> p = new ArrayList<PeopleModel>();
		try {
			p = (List<PeopleModel>) peopleRepository.findAll();
		//	crud.returnPeople();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(" response -> " + p.toString());
		return new ResponseEntity<>(p, HttpStatus.OK);
	}

	@PostMapping("/")
	public TestModel postMethod(@RequestParam("id") String id) {
		System.out.println("--------------------------post method");
		TestModel model = new TestModel();
		model.setDate(new Date());
		model.setDescription("test success");
		System.out.println(" response -> " + model);
		return model;
	}

	@PutMapping("/")
	public TestModel putMethod(@RequestParam("id") String id) {
		System.out.println("---------PutMapping--------------");
		TestModel model = new TestModel();
		model.setDate(new Date());
		model.setDescription("test success");
		System.out.println(" response -> " + model);
		return model;
	}

	@CrossOrigin
	@DeleteMapping("/delete")
	public void deleteMethod(@RequestParam("id") Integer id) {
		System.out.println("-----------------delete method ----------------------");
		List<PeopleModel> p = new ArrayList<PeopleModel>();
		peopleRepository.deleteById(id);
	}
}
