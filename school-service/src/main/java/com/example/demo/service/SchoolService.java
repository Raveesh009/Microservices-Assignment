package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.School;
import com.example.demo.repo.SchoolRepository;

@Service
public class SchoolService {
    
	@Autowired
	public SchoolRepository schoolRepository;

	public School createSchool(School school) {
		
		return schoolRepository.save(school);
	}

	public School findSchoolByName(String schoolName) {
		
		return schoolRepository.findBySchoolName(schoolName);
	}
	
	public List<School> getAll() {
		
		return schoolRepository.findAll();
	}
	
}
