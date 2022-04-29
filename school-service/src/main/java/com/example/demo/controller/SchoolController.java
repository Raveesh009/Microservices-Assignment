package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.School;
import com.example.demo.service.SchoolService;

@RestController
public class SchoolController {
    
	@Autowired
	public SchoolService schoolService;
	
	@PostMapping("/")
	public School createSchool(@RequestBody School school) {
		return schoolService.createSchool(school);
	}
	
	@GetMapping("/{schoolName}")
	public School findSchoolByName(@PathVariable("schoolName")String schoolName) {
		
		return schoolService.findSchoolByName(schoolName);
	}
	
	@GetMapping("/allSchools")
	public ResponseEntity<?> getAll() {
		
		return ResponseEntity.ok(schoolService.getAll());
	}
}
