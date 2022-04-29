package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentService {

	@Autowired
	public StudentRepository studentRepository;
	
	@Autowired
	public RestTemplate restTemplate;

	public Student createStudent(Student student) {
	     log.info("Inside createStudent of StudentService");
		return studentRepository.save(student);
	}

	public Student findStudentById(int studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findByStudentId(studentId);
	}

	
}
