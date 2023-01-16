package com.practice.lp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.lp.models.Person;

@RestController
public class PersonController {
	
	List<Person> persons = new ArrayList<>();
	
	@GetMapping("/person")
	public ResponseEntity<List<Person>> getAllPerson() {
		return ResponseEntity.status(HttpStatus.OK).body(persons);
	}
	
	@PostMapping("/person")
	public ResponseEntity<String> setAPerson(@RequestBody Person createdPerson) {
		persons.add(createdPerson);
		return ResponseEntity.status(HttpStatus.CREATED).body("Person A	dded...");
	}

}
